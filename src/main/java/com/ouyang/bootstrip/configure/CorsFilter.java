package com.ouyang.bootstrip.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsFilter extends WebMvcConfigurerAdapter{
	@Value("${CorsFilter.url}")
	private String crosUrl;
	@Override  
    public void addCorsMappings(CorsRegistry registry) {
		String [] arr = crosUrl.split(",");
        registry.addMapping("/**")  
                .allowedOrigins(arr)  
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT")  
                .maxAge(3600);  

    }
}
