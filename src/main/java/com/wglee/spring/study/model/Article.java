package com.wglee.spring.study.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wglee21g@gmail.com
 */
public class Article {
	private Long id;
	private String content;
	private List<Tag> tags = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}
