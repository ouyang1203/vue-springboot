package com.ouyang.bootstrip;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Ignore;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Ignore
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        File file = new File("C:\\Users\\Administrator\\Desktop\\ProjectDAOImpl.java");
        File outFile = new File("C:\\Users\\Administrator\\Desktop\\ProjectDAOImpl-1.java");
        
        BufferedReader read =  null;
        PrintWriter write = null;
        try {
        	if(!outFile.exists()){
            	outFile.createNewFile();
            }
        	read = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        	write = new PrintWriter(new OutputStreamWriter(new FileOutputStream(outFile)));
        	String str = null;
        	while ((str = read.readLine())!=null){
        		if((str.contains("//")&&!str.contains(";//")&&!str.contains("; //"))
        				||str.contains("/*")
        				||(str.contains("*")&&!str.contains("(*")&&!str.contains("( *")
        						&&!str.contains(".*")&&!str.contains("select *"))){
        			//删除代码中注释
        			continue;
        		}
        		if(str.contains("if(")||str.contains("if (")){
        			//所有if条件只保留前面的花括号
        			str = "{";
        		}
        		if(str.contains("else if{")||str.contains("else{")||str.contains("else {")){
        			str = "}{";
        		}
        		System.out.println(str);
        		write.write(str+"\n");
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(read!=null){
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(write!=null){
				write.close();
			}
		}
    }
	
	public String article = "Old soldiers never die Mr. President, Mr. Speaker, and Distinguished Members of the Congress: I stand on this rostrum with a sense of deep humility and great pride -- humility in the weight of those great American architects of our history who have stood here before me; pride in the reflection that this home of legislative debate represents human liberty in the purest form yet devised. Here are centered the hopes and aspirations and faith of the entire human race. I do not stand here as advocate for any partisan cause, for the issues are fundamental and reach quite beyond the realm of partisan consideration. They must be resolved on the highest plane of national interest if our course is to prove sound and our future protected. I trust, therefore, that you will do me the justice of receiving that which I have to say as solely expressing the considered viewpoint of a fellow American. I address you with neither rancor nor bitterness in the fading twilight of life, with but one purpose in mind: to serve my country. The issues are global and so interlocked that to consider the problems of one sector, oblivious to those of another, is but to court disaster for the whole. While Asia is commonly referred to as the Gateway to Europe, it is no less true that Europe is the Gateway to Asia, and the broad influence of the one cannot fail to have its impact upon the other. There are those who claim our strength is inadequate to protect on both fronts, that we cannot divide our effort. I can think of no greater expression of defeatism. If a potential enemy can divide his strength on two fronts, it is for us to counter his effort. The Communist threat is a global one. Its successful advance in one sector threatens the destruction of every other sector. You can not appease or otherwise surrender to communism in Asia without simultaneously undermining our efforts to halt its advance in Europe. Beyond pointing out these general truisms, I shall confine my discussion to the general areas of Asia. Before one may objectively assess the situation now existing there, he must comprehend something of Asia's past and the revolutionary changes which have marked her course up to the present. Long exploited by the so-called colonial powers, with little opportunity to achieve any degree of social justice, individual dignity, or a higher standard of life such as guided our own noble administration in the Philippines, the peoples of Asia found their opportunity in the war just past to throw off the shackles of colonialism and now see the dawn of new opportunity, a heretofore unfelt dignity, and the self-respect of political freedom. Mustering half of the earth's population, and 60 percent of its natural resources these peoples are rapidly consolidating a new force, both moral and material, with which to raise the living standard and erect adaptations of the design of modern progress to their own distinct cultural environments. Whether one adheres to the concept of colonization or not, this is the direction of Asian progress and it may not be stopped. It is a corollary to the shift of the world economic frontiers as the whole epicenter of world affairs rotates back toward the area whence it started. In this situation, it becomes vital that our own country orient its policies in consonance with this basic evolutionary condition rather than pursue a course blind to the reality that the colonial era is now past and the Asian peoples covet the right to shape their own free destiny. What they seek now is friendly guidance, understanding, and support -- not imperious direction -- the dignity of equality and not the shame of subjugation. Their pre-war standard of life, pitifully low, is infinitely lower now in the devastation left in war's wake. World ideologies play little part in Asian thinking and are little understood. What the peoples strive for is the opportunity for a little more food in their stomachs, a little better clothing on their backs, a little firmer roof over their heads, and the realization of the normal nationalist urge for political freedom. These political-social conditions have but an indirect bearing upon our own national security, but do form a backdrop to contemporary planning which must be thoughtfully considered if we are to avoid the pitfalls of unrealism. Of more direct and immediately bearing upon our national security are the changes wrought in the strategic potential of the Pacific Ocean in the course of the past war. Prior thereto the western strategic frontier of the United States lay on the literal line of the Americas, with an exposed island salient extending out through Hawaii, Midway, and Guam to the Philippines. That salient proved not an outpost of strength but an avenue of weakness along which the enemy could and did attack. The Pacific was a potential area of advance for any predatory force intent upon striking at the bordering land areas. All this was changed by our Pacific victory. Our strategic frontier then shifted to embrace the entire Pacific Ocean, which became a vast moat to protect us as long as we held it. Indeed, it acts as a protective shield for all of the Americas and all free lands of the Pacific Ocean area. We control it to the shores of Asia by a chain of islands extending in an arc from the Aleutians to the Mariannas held by us and our free allies. From this island chain we can dominate with sea and air power every Asiatic port from Vladivostok to Singapore -- with sea and air power every port, as I said, from Vladivostok to Singapore -- and prevent any hostile movement into the Pacific. Any predatory attack from Asia must be an amphibious effort.* No amphibious force can be successful without control of the sea lanes and the air over those lanes in its avenue of advance. With naval and air supremacy and modest ground elements to defend bases, any major attack from continental Asia toward us or our friends in the Pacific would be doomed to failure. Under such conditions, the Pacific no longer represents menacing avenues of approach for a prospective invader. It assumes, instead, the friendly aspect of a peaceful lake. Our line of defense is a natural one and can be maintained with a minimum of military effort and expense. It envisions no attack against anyone, nor does it provide the bastions essential for offensive operations, but properly maintained, would be an invincible defense against aggression. The holding of this literal defense line in the western Pacific is entirely dependent upon holding all segments thereof; for any major breach of that line by an unfriendly power would render vulnerable to determined attack every other major segment. This is a military estimate as to which I have yet to find a military leader who will take exception. For that reason, I have strongly recommended in the past, as a matter of military urgency, that under no circumstances must Formosa fall under Communist control. Such an eventuality would at once threaten the freedom of the Philippines and the loss of Japan and might well force our western frontier back to the coast of California, Oregon and Washington. To understand the changes which now appear upon the Chinese mainland, one must understand the changes in Chinese character and culture over the past 50 years. China, up to 50 years ago, was completely non-homogenous, being compartmented into groups divided against each other. The war-making tendency was almost non-existent, as they still followed the tenets of the Confucian ideal of pacifist culture. At the turn of the century, under the regime of Chang Tso Lin, efforts toward greater homogeneity produced the start of a nationalist urge. This was further and more successfully developed under the leadership of Chiang Kai-Shek, but has been brought to its greatest fruition under the present regime to the point that it has now taken on the character of a united nationalism of increasingly dominant, aggressive tendencies. Through these past 50 years the Chinese people have thus become militarized in their concepts and in their ideals. They now constitute excellent soldiers, with competent staffs and commanders. This has produced a new and dominant power in Asia, which, for its own purposes, is allied with Soviet Russia but which in its own concepts and methods has become aggressively imperialistic, with a lust for expansion and increased power normal to this type of imperialism. There is little of the ideological concept either one way or another in the Chinese make-up. The standard of living is so low and the capital accumulation has been so thoroughly dissipated by war that the masses are desperate and eager to follow any leadership which seems to promise the alleviation of local stringencies. I have from the beginning believed that the Chinese Communists' support of the North Koreans was the dominant one. Their interests are, at present, parallel with those of the Soviet. But I believe that the aggressiveness recently displayed not only in Korea but also in Indo-China and Tibet and pointing potentially toward the South reflects predominantly the same lust for the expansion of power which has animated every would-be conqueror since the beginning of time. The Japanese people, since the war, have undergone the greatest reformation recorded in modern history. With a commendable will, eagerness to learn, and marked capacity to understand, they have, from the ashes left in war's wake, erected in Japan an edifice dedicated to the supremacy of individual liberty and personal dignity; and in the ensuing process there has been created a truly representative government committed to the advance of political morality, freedom of economic enterprise, and social justice. Politically, economically, and socially Japan is now abreast of many free nations of the earth and will not again fail the universal trust. That it may be counted upon to wield a profoundly beneficial influence over the course of events in Asia is attested by the magnificent manner in which the Japanese people have met the recent challenge of war, unrest, and confusion surrounding them from the outside and checked communism within their own frontiers without the slightest slackening in their forward progress. I sent all four of our occupation divisions to the Korean battlefront without the slightest qualms as to the effect of the resulting power vacuum upon Japan. The results fully justified my faith. I know of no nation more serene, orderly, and industrious, nor in which higher hopes can be entertained for future constructive service in the advance of the human race. Of our former ward, the Philippines, we can look forward in confidence that the existing unrest will be corrected and a strong and healthy nation will grow in the longer aftermath of war's terrible destructiveness. We must be patient and understanding and never fail them -- as in our hour of need, they did not fail us. A Christian nation, the Philippines stand as a mighty bulwark of Christianity in the Far East, and its capacity for high moral leadership in Asia is unlimited. On Formosa, the government of the Republic of China has had the opportunity to refute by action much of the malicious gossip which so undermined the strength of its leadership on the Chinese mainland. The Formosan people are receiving a just and enlightened administration with majority representation on the organs of government, and politically, economically, and socially they appear to be advancing along sound and constructive lines. With this brief insight into the surrounding areas, I now turn to the Korean conflict. While I was not consulted prior to the President's decision to intervene in support of the Republic of Korea, that decision from a military standpoint, proved a sound one, as we hurled back the invader and decimated his forces. Our victory was complete, and our objectives within reach, when Red China intervened with numerically superior ground forces. This created a new war and an entirely new situation, a situation not contemplated when our forces were committed against the North Korean invaders; a situation which called for new decisions in the diplomatic sphere to permit the realistic adjustment of military strategy. Such decisions have not been forthcoming. While no man in his right mind would advocate sending our ground forces into continental China, and such was never given a thought, the new situation did urgently demand a drastic revision of strategic planning if our political aim was to defeat this new enemy as we had defeated the old. Apart from the military need, as I saw It, to neutralize the sanctuary protection given the enemy north of the Yalu, I felt that military necessity in the conduct of the war made necessary: first the intensification of our economic blockade against China; two the imposition of a naval blockade against the China coast; three removal of restrictions on air reconnaissance of China's coastal areas and of Manchuria; four removal of restrictions on the forces of the Republic of China on Formosa, with logistical support to contribute to their effective operations against the common enemy. For entertaining these views, all professionally designed to support our forces committed to Korea and bring hostilities to an end with the least possible delay and at a saving of countless American and allied lives, I have been severely criticized in lay circles, principally abroad, despite my understanding that from a military standpoint the above views have been fully shared in the past by practically every military leader concerned with the Korean campaign, including our own Joint Chiefs of Staff. I called for reinforcements but was informed that reinforcements were not available. I made clear that if not permitted to destroy the enemy built-up bases north of the Yalu, if not permitted to utilize the friendly Chinese Force of some 600,000 men on Formosa, if not permitted to blockade the China coast to prevent the Chinese Reds from getting succor from without, and if there were to be no hope of major reinforcements, the position of the command from the military standpoint forbade victory. We could hold in Korea by constant maneuver and in an approximate area where our supply line advantages were in balance with the supply line disadvantages of the enemy, but we could hope at best for only an indecisive campaign with its terrible and constant attrition upon our forces if the enemy utilized its full military potential. I have constantly called for the new political decisions essential to a solution. Efforts have been made to distort my position. It has been said, in effect, that I was a warmonger. Nothing could be further from the truth. I know war as few other men now living know it, and nothing to me is more revolting. I have long advocated its complete abolition, as its very destructiveness on both friend and foe has rendered it useless as a means of settling international disputes. Indeed, on the second day of September, nineteen hundred and forty-five, just following the surrender of the Japanese nation on the Battleship Missouri, I formally cautioned as follows: Men since the beginning of time have sought peace. Various methods through the ages have been attempted to devise an international process to prevent or settle disputes between nations. From the very start workable methods were found in so far as individual citizens were concerned, but the mechanics of an instrumentality of larger international scope have never been successful. Military alliances, balances of power, Leagues of Nations, all in turn failed, leaving the only path to be by way of the crucible of war. The utter destructiveness of war now blocks out this alternative. We have had our last chance. If we will not devise some greater and more equitable system, Armageddon will be at our door. The problem basically is theological and involves a spiritual recrudescence and improvement of human character that will synchronize with our almost matchless advances in science, art, literature, and all material and cultural developments of the past 2000 years. It must be of the spirit if we are to save the flesh. But once war is forced upon us, there is no other alternative than to apply every available means to bring it to a swift end. War's very object is victory, not prolonged indecision. In war there is no substitute for victory. There are some who, for varying reasons, would appease Red China. They are blind to history's clear lesson, for history teaches with unmistakable emphasis that appeasement but begets new and bloodier war. It points to no single instance where this end has justified that means, where appeasement has led to more than a sham peace. Like blackmail, it lays the basis for new and successively greater demands until, as in blackmail, violence becomes the only other alternative. Why, my soldiers asked of me, surrender military advantages to an enemy in the field? I could not answer. Some may say: to avoid spread of the conflict into an all-out war with China; others, to avoid Soviet intervention. Neither explanation seems valid, for China is already engaging with the maximum power it can commit, and the Soviet will not necessarily mesh its actions with our moves. Like a cobra, any new enemy will more likely strike whenever it feels that the relativity in military or other potential is in its favor on a world-wide basis. The tragedy of Korea is further heightened by the fact that its military action is confined to its territorial limits. It condemns that nation, which it is our purpose to save, to suffer the devastating impact of full naval and air bombardment while the enemy's sanctuaries are fully protected from such attack and devastation. Of the nations of the world, Korea alone, up to now, is the sole one which has risked its all against communism. The magnificence of the courage and fortitude of the Korean people defies description. They have chosen to risk death rather than slavery. Their last words to me were: Don't scuttle the Pacific! I have just left your fighting sons in Korea. They have met all tests there, and I can report to you without reservation that they are splendid in every way. It was my constant effort to preserve them and end this savage conflict honorably and with the least loss of time and a minimum sacrifice of life. Its growing bloodshed has caused me the deepest anguish and anxiety. Those gallant men will remain often in my thoughts and in my prayers always. I am closing my 52 years of military service. When I joined the Army, even before the turn of the century, it was the fulfillment of all of my boyish hopes and dreams. The world has turned over many times since I took the oath on the plain at West Point, and the hopes and dreams have long since vanished, but I still remember the refrain of one of the most popular barrack ballads of that day which proclaimed most proudly that old soldiers never die; they just fade away. And like the old soldier of that ballad, I now close my military career and just fade away, an old soldier who tried to do his duty as God gave him the light to see that duty.";
	
	
	public String getRandomMessage(){
		String[] codes = article.split(" ");
		Integer length = codes.length;
		StringBuffer buf = new StringBuffer();
		Random ra =new Random();
		Integer min = 10;
		//设置随机获取的长度最大值
		Integer max = ra.nextInt(length);
		while(max<=min){
			max = ra.nextInt(length);
		}
		buf.append("/*").append("\n").append("*");
		Integer pos = 0 ;
		Integer count = 0;
		for(int i = 1 ;i<=max;i++){
			pos = ra.nextInt(length);
			buf.append(codes[pos]).append(" ");
			if(max>30){
				if(count==30){
					buf.append("\n").append("*");
					count = 0 ;
				}
				count++;
			}
		}
		buf.append("\n").append("*/").append("\n");
		return buf.toString();
	}
	
	@Ignore
    @Test
    public void test()throws Exception{
    	File file = new File("C:\\Users\\Administrator\\Desktop\\ProjectDAOImpl.java");
    	File outFile = new File("C:\\Users\\Administrator\\Desktop\\ProjectDAOImpl-1.java");
    	PrintWriter write = new PrintWriter(new OutputStreamWriter(new FileOutputStream(outFile)));
		InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(read);
		String lineTxt = null;
		Pattern p = Pattern.compile("if\\s*\\("); // if 正则表达式
		Stack if_st = new Stack();// 存放 if(xxxx)
		
		while ((lineTxt = bufferedReader.readLine()) != null)
        {
			lineTxt = lineTxt.replace("else", "");
			
			if((lineTxt.contains("//"))){
				String pre = lineTxt.split("//")[0];
				if(lineTxt.contains(";//")||lineTxt.contains("; //")){
					write.write(pre+"\n");
					continue;
				}else{
					//删除代码中注释
					if(pre.trim().equals("")){
						continue;
					}else{
						//出现这种情况特殊处理query // to //from
						if(!pre.contains("@param")){
							write.write(pre+"\n");
						}
						continue;
					}
				}
    		}
			if(lineTxt.contains("/*")){
				write.write(getRandomMessage());
				continue;
			}
			
			if((lineTxt.contains("*")&&!lineTxt.contains("(*")&&!lineTxt.contains("( *")
    						&&!lineTxt.contains(".*")&&!lineTxt.contains("select *"))){
				//删除代码中注释
				continue;
			}
			
			char lineTxt_chararr [] = lineTxt.toCharArray();
			
			Matcher m = p.matcher(lineTxt);
			if(m.find()) { // 匹配到有if语句
				String target = m.group();// 获取if开始的字符
				
				int start = lineTxt.indexOf(target);
				int count = 0;// 定义小括号的个数
				String result = lineTxt.substring(start, lineTxt.length());
				char resultarr [] = result.toCharArray();
				for(int i = 0 ; i<resultarr.length ; i++) {
					lineTxt_chararr[start+i]=' ';// 获得的值用空格代替
					if(resultarr[i]==')') {
						count = count -1;
						if(count == 0) {
							break;
						}
					}
					if(resultarr[i]=='(') {
						count = count +1;
					}
					if_st.push(resultarr[i]);
					
				}
				
				System.out.println(new String(lineTxt_chararr));
				write.write(new String(lineTxt_chararr)+"\n");
				while(count > 0 ) { // if 跨多行
					lineTxt = bufferedReader.readLine();
					lineTxt = lineTxt.replace("else", "");
					resultarr = lineTxt.toCharArray();
					for(int i = 0 ; i<resultarr.length ; i++) {
						
						if(resultarr[i]==')') {
							count = count -1;
							if(count == 0) {
								resultarr[i] = ' ';
								break;
							}
						}
						if(resultarr[i]=='(') {
							count = count +1;
						}
						resultarr[i] = ' ';
						if_st.push(resultarr[i]);
						
					}
					System.out.println(new String(resultarr));
					write.write(new String(resultarr)+"\n");
					// 去掉获得的值
				}
			}else {
				System.out.println(lineTxt);
				write.write(lineTxt+"\n");
			}
        }
		bufferedReader.close();
		write.close();
        read.close();
    }
    
    
	public String getRandomShortMessage(int msgLen) {
		String[] codes = article.split(" ");
		Integer length = codes.length;
		StringBuffer buf = new StringBuffer();
		Random ra =new Random();
		//设置随机获取的长度最大值
		Integer max = ra.nextInt(length);
		Integer start = max - msgLen;
		if(start < 0) {
			start = max;
			max = start + msgLen;
		}
		for(int pos = start; pos < max; pos++ ) {
			buf.append(codes[pos]).append(" ");
		};
		return buf.toString();
	}
    
    @Test
	public void delIfAndDealAnotation() throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\Sx4aService.java");
    	File outFile = new File("C:\\Users\\Administrator\\Desktop\\Sx4aService-1.java");
    	if(!outFile.exists()) {
    		outFile.createNewFile();
    	}
    	PrintWriter write = new PrintWriter(new OutputStreamWriter(new FileOutputStream(outFile)));
		InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(read);
		String lineTxt = null;
		Pattern p = Pattern.compile("if\\s*\\("); // if 正则表达式
		Stack if_st = new Stack();// 存放 if(xxxx)
		Integer commentLength = 0;
		
		while ((lineTxt = bufferedReader.readLine()) != null)
        {
			lineTxt = lineTxt.replace("else", "");
			
			if((lineTxt.contains("//"))){
				if(lineTxt.trim().length() <= 2) continue;
				String pre = lineTxt.split("//")[0];
				commentLength = (""+pre).equals("null")?10:pre.length();
				if(lineTxt.contains(";//")||lineTxt.contains("; //")){
					write.write(pre+"// "+getRandomShortMessage(commentLength)+"\n");
					continue;
				}else{
					//删除代码中注释
					if(pre.trim().equals("")){
						write.write(pre+"// "+getRandomShortMessage(commentLength)+"\n");
						continue;
					}else{
						//出现这种情况特殊处理query // to //from
						if(!pre.contains("@param")){
//							write.write(pre+"\n");
							write.write(pre+"// "+getRandomShortMessage(commentLength)+"\n");
						}
						
						continue;
					}
				}
    		}
			if(lineTxt.contains("/*")){
				write.write(getRandomMessage());
				continue;
			}
			
			if((lineTxt.contains("*")&&!lineTxt.contains("(*")&&!lineTxt.contains("( *")
    						&&!lineTxt.contains(".*")&&!lineTxt.contains("select *"))){
				//删除代码中注释
				continue;
			}
			
			char lineTxt_chararr [] = lineTxt.toCharArray();
			
			Matcher m = p.matcher(lineTxt);
			if(m.find()) { // 匹配到有if语句
				String target = m.group();// 获取if开始的字符
				
				int start = lineTxt.indexOf(target);
				int count = 0;// 定义小括号的个数
				String result = lineTxt.substring(start, lineTxt.length());
				char resultarr [] = result.toCharArray();
				for(int i = 0 ; i<resultarr.length ; i++) {
					lineTxt_chararr[start+i]=' ';// 获得的值用空格代替
					if(resultarr[i]==')') {
						count = count -1;
						if(count == 0) {
							break;
						}
					}
					if(resultarr[i]=='(') {
						count = count +1;
					}
					if_st.push(resultarr[i]);
					
				}
				
//				System.out.println(new String(lineTxt_chararr));
				write.write(new String(lineTxt_chararr)+"\n");
				while(count > 0 ) { // if 跨多行
					lineTxt = bufferedReader.readLine();
					lineTxt = lineTxt.replace("else", "");
					resultarr = lineTxt.toCharArray();
					for(int i = 0 ; i<resultarr.length ; i++) {
						
						if(resultarr[i]==')') {
							count = count -1;
							if(count == 0) {
								resultarr[i] = ' ';
								break;
							}
						}
						if(resultarr[i]=='(') {
							count = count +1;
						}
						resultarr[i] = ' ';
						if_st.push(resultarr[i]);
						
					}
//					System.out.println(new String(resultarr));
					write.write(new String(resultarr)+"\n");
					// 去掉获得的值
				}
			}else {
//				System.out.println(lineTxt);
				write.write(lineTxt+"\n");
			}
        }
		bufferedReader.close();
		write.close();
        read.close();
	}
}
