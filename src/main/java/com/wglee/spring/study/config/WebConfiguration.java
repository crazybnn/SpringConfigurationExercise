package com.wglee.spring.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

/**
 * @author wglee21g@gmail.com
 */
@Configuration
@Import({DatabaseConfiguration.class})
@ComponentScan(basePackages = "com.wglee.spring.study", excludeFilters = {@ComponentScan.Filter(Controller.class), @ComponentScan.Filter(Configuration.class)})
public class WebConfiguration {
}