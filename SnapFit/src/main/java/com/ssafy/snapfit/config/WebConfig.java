package com.ssafy.snapfit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Web 관련 설정
@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//자원 설정 
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	}

<<<<<<< HEAD
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
=======
	// CORS 에러 전역 처리 
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("POST", "GET", "PUT", "DELETE");
	}
>>>>>>> 8e10c84053784300036ed377facd88c57e1ee5f9
	
//	// 인터셉터 등 처리 가능
//	@Autowired
//	private JwtInterceptor jwtInterceptor;
//	
//	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(jwtInterceptor).addPathPatterns("/**")
//		.excludePathPatterns("/api-user/**", "/swagger-ui/**", "/v3/api-docs/**");
//	}
	
	

}
