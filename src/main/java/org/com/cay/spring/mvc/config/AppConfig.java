package org.com.cay.spring.mvc.config;

import org.com.cay.spring.mvc.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//开启webmvc功能
@EnableWebMvc
//禁用默认的过滤规则
@ComponentScan(value="org.com.cay.spring.mvc", includeFilters={
		@Filter(type=FilterType.ANNOTATION, classes=Controller.class)
},useDefaultFilters=false)
public class AppConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		//默认从/web-inf/下找jsp页面
//		registry.jsp();
		
		//指定从/WEB-INF/views/目录下找jsp页面
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		super.addInterceptors(registry);
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
	}
	
}
