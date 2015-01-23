package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import com.wglee.spring.study.model.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wglee21g@gmail.com
 */
@Configuration
public class WebConfiguration {
	@Bean
	public Article article(Tag tag) {
		Article article = new Article();
		article.setContent("Hello, Spring!!");
		article.setTags(createTagList(tag));
		return article;
	}

	@Bean
	public Tag tag() {
		return new Tag("Java");
	}

	private List<Tag> createTagList(Tag tag) {
		List<Tag> tagList = new ArrayList<>();
		tagList.add(tag);
		return tagList;
	}
}