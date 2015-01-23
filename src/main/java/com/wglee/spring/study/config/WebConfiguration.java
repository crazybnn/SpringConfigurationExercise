package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wglee21g@gmail.com
 */
@Configuration
public class WebConfiguration {
	@Bean
	public Article article() {
		Article article = new Article();
		article.setId(1L);
		article.setContent("Hello, Spring!!");
		return article;
	}
}