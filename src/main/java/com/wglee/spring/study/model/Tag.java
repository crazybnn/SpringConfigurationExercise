package com.wglee.spring.study.model;

/**
 * @author wglee21g@gmail.com
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
