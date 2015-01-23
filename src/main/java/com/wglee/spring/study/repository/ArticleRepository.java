package com.wglee.spring.study.repository;

import com.wglee.spring.study.model.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by leewangeun on 15. 1. 21..
 */
@Repository
public class ArticleRepository {
	@PersistenceContext
	private EntityManager em;

	public void save(Article article) {
		em.persist(article);
	}

	public List<Article> findAll() {
		TypedQuery<Article> query = em.createNamedQuery("Article.findAll", Article.class);
		return query.getResultList();
	}
}