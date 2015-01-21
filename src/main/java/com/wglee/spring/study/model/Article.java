package com.wglee.spring.study.model;

import javax.persistence.Entity;

/**
 * @Author wangeun.lee
 */
@Entity
public class Article {
	private Long id;
	private String content;

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
}
