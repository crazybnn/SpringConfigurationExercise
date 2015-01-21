package com.wglee.spring.study.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leewangeun on 15. 1. 21..
 */
@Entity
public class Article {
	@Id
	@GeneratedValue
	@Column(name = "ARTICLE_ID")
	private Long id;

	private String content;

	@OneToMany(mappedBy = "tag", cascade = CascadeType.ALL)
	private List<Tag> tags = new ArrayList<>();

//	public Tag getFirstTag() {
//		return tags.get(0);
//	}

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

//	public List<Tag> getTags() {
//		return tags;
//	}
//
//	public void setTags(List<Tag> tags) {
//		this.tags = tags;
//	}
}