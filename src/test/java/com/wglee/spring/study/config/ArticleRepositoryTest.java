package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import com.wglee.spring.study.repository.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by leewangeun on 15. 1. 21..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ArticleRepositoryTest {
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	public void testFindAll() throws Exception {
		List<Article> articleList = articleRepository.findAll();

		assertEquals(0, articleList.size());
	}
}
