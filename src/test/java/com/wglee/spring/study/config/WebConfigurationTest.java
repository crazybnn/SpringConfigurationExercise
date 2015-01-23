package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import com.wglee.spring.study.model.Tag;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author wglee21g@gmail.com
 */
public class WebConfigurationTest {
	@Test
	public void getTagContainerBean_XML() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Article article = context.getBean("article", Article.class);

		assertNotNull(article);
	}

	@Test
	public void getTagBean_XML() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Article article = context.getBean("article", Article.class);

		List<Tag> tags = article.getTags();
		int size = tags.size();

		assertEquals(size, 1);
	}
}