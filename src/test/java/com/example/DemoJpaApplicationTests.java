package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJpaApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	public void saveBookWithChaptersTest() {
		Book book = new Book("Dune");
		book.addChapter(new Chapter("Chapter 1", 10));
		book.addChapter(new Chapter("Chapter 2", 53));
		book.addChapter(new Chapter("Chapter 3", 87));

		Book savedBook = bookRepository.save(book);

		Book foundedBook = bookRepository.findOne(savedBook.getId());

		assertNotNull(foundedBook);
		assertNotNull(foundedBook.getChapters());
		assertEquals(foundedBook.getChapters().size(), 3);
	}

	@Test
	public void contextLoads() {
	}

}
