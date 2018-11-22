package org.com.cay.spring.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@ComponentScan(value="org.com.cay.spring.mvc", excludeFilters={
		@Filter(type=FilterType.ANNOTATION, classes=Controller.class)
})
public class RootConfig {

}
