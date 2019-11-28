package com.ouyang.bootstrip.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientUtil {
	
	private static String YES = "Y";
	
	private static String NO = "N";
	
	private static String P1 = "/";
	
	private static String P2 = "_";
	
	private static String BR = "<br>";
	
	private static String SCRIPT1 = "</div>				<script>insertFixed();</script>";
	
	private static String ZHUANMA = "<p class=\"anti-transform\" style=\"margin:0\">转码页面功能异常，本站不支持转码阅读，点击页面底部[查看原网页]可正常浏览，或通过浏览器访问本页地址: http://www.biquge18.com/</p>";
	
	private static String LOADING = "<p class=\"preload\">正在加载中……</p>";
	
	/**
	 * @param baseUrl 请求网站跟地址
	 * @param kind 请求文件类型
	 * @param kindId 请求文件主键
	 * @param currentPage  请求当前页
	 * @param urlType 请求结束类型
	 * @param printTitleFlag 是否打印章节名称标志
	 * */
	public static String postRequest(String baseUrl,String kind,String kindId,String currentPage,String urlType,String printTitleFlag) throws Exception{
		String msg = null;
		String preUrl = baseUrl+kind+kindId+P1+currentPage;
		// 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
		CloseableHttpClient httpClient = HttpClientBuilder.create().build(); 
		//创建POST请求
		HttpPost httpPost = new HttpPost(preUrl+urlType);
		//创建响应模型
		CloseableHttpResponse response = null;
		try {
			RequestConfig requestConfig  = RequestConfig.custom()
					// 设置连接超时时间(单位毫秒)
					.setConnectTimeout(5000)
					// 设置请求超时时间(单位毫秒)
					.setConnectionRequestTimeout(5000)
					// socket读写超时时间(单位毫秒)
					.setSocketTimeout(5000)
					// 设置是否允许重定向(默认为true)
					.setRedirectsEnabled(true).build();
			httpPost.setConfig(requestConfig);
			response = httpClient.execute(httpPost);
			StringBuffer buf = new StringBuffer();
			if(response.getStatusLine().getStatusCode()==200){
	            HttpEntity entity = response.getEntity();
	            InputStream content = entity.getContent();
	            BufferedReader read = new BufferedReader(new InputStreamReader(content));
	            File baseDir = new File("F:\\小说\\代码下载");
	            String fileName = "";
	            String text = null;
	            String out = null;
	            boolean currentPageOutputEndFlag = false;
	            //分页标志
	            boolean turnPageFlag = false;
	            //当前页结束返回下一页时截取下一页的url结尾
	            String pageStr = "";
	            String[] arr = null;
	            //动态拼接分页额外文字
	            String turnPageExtra = "";
	            String newPage = "";
	            //广告额外文字
	            String adExtra = "";
	            while((text=read.readLine())!=null){
	            	if(text.contains("<title>")){
	            		out = text.replace("<title>", "").replace("</title>", "");
	            		arr =  out.split(P2);
	            		fileName = arr[1];
	            		if(YES.equals(printTitleFlag)){
	            			buf.append(arr[0]).append("\n");
	            		}
	            	}
            		if(text.contains("<div id=")&&text.contains("content")){
	            		//读取到<div id="content">时给标记打上记号,准备输出下一行内容
	            		currentPageOutputEndFlag = true;
	            		continue;
	            	}
            		if(text.contains(LOADING)){
            			//取得到加载中时跳过
            			continue;
            		}
            		if(text.contains("本章未完，点击下一页继续阅读</a>")&&currentPage!=null){
            			//读取到本章未完，点击下一页继续阅读</a>,再次请求进行分页处理
            			if(currentPage.contains(P2)){
            				pageStr = text.split(currentPage.split(P2)[0]+P2)[1];
            				newPage = currentPage.split(P2)[0];
            			}else{
            				pageStr = text.split(currentPage+P2)[1];
            				newPage = currentPage;
            			}
            			pageStr = pageStr.split("\"")[0];
            			pageStr = pageStr.split(urlType)[0];
            			turnPageFlag = true;
            			newPage = newPage+P2+pageStr;
            			text = text.split("-->><p")[0];
            		}
	            	if(currentPageOutputEndFlag){
	            		adExtra = BR+ZHUANMA+BR;
	            		turnPageExtra = "-->><p class=\"to_nextpage\"><a href=\""+kind+kindId+newPage+urlType+"\" rel=\"next\">本章未完，点击下一页继续阅读</a></p>											</div>";
	            		out = text.replace(adExtra, "")
	            				.replace(ZHUANMA, "")
	            				.replace(SCRIPT1, "")
	            				.replace(turnPageExtra, "")
	            				.replace("    											</div>", "\n")
	            				.replace(BR+BR, "\n");
	            		buf.append(out);
	            		//网站内容输出完毕后修改标志位
	            		currentPageOutputEndFlag = false;
	            	}
	            }
	            msg = buf.toString();
	            String fileAllName = baseDir+P1+fileName+".txt";
	            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(fileAllName),true)));
	            pw.write(msg);
	            pw.flush();
	            pw.close();
	            if(turnPageFlag){
	            	//一章还未结束时继续读取当前章节数据
	            	postRequest(baseUrl,kind,kindId,newPage,urlType,NO);
	            }else{
	            	//读取下一章节数据
	            	newPage = String.valueOf(Integer.valueOf(currentPage.split(P2)[0])+1);
	            	postRequest(baseUrl,kind,kindId,newPage,urlType,YES);
	            }
	        }
		} catch (Exception e) {
			throw e;
		}finally{
			if(response!=null){
				response.close();
			}
			if(httpClient!=null){
				httpClient.close();
			}
		}
		return msg;
	}
	public static void main(String[] args) {
		try {
			postRequest("https://www.biquge18.com","/book","/77306","0",".html","Y");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
