package com.wglee.spring.study.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wglee21g@gmail.com
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a")
})
public class Article {
	@Id
	@GeneratedValue
	@Column(name = "ARTICLE_ID")
	private Long id;

	private String content;

	@OneToMany(mappedBy = "id")
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
