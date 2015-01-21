package com.wglee.spring.study.model;

import javax.persistence.*;

/**
 * Created by leewangeun on 15. 1. 21..
 */
@Entity
public class Tag {
	@Id
	@GeneratedValue
	private Long ig;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ARTICLE_ID")
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
