package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Tag;
import com.wglee.spring.study.model.Article;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leewangeun on 15. 1. 20..
 */
@Configuration
public class WebConfiguration {
	@Bean
	public Article tagContainer(Tag tag) {
		Article article = new Article();
		article.setContent("Hello, Spring!!");
//		article.setTags(createTagList(tag));
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