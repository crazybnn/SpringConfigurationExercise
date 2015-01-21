package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wangeun.lee
 */
@Configuration
public class WebConfiguration {
	@Bean
	public Article tagContainer() {
		Article article = new Article();
		article.setId(1L);
		article.setContent("Hello, Spring!!");
		return article;
	}
}