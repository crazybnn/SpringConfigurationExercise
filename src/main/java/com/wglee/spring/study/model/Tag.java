package com.wglee.spring.study.model;

import javax.persistence.*;

/**
 * Created by leewangeun on 15. 1. 21..
 */
public class Tag {
	private Long ig;
	private String name;
	private Article article;

	public Tag(String name) {
		this.name = name;
	}

	public Long getIg() {
		return ig;
	}

	public void setIg(Long ig) {
		this.ig = ig;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}
