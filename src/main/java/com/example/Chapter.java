package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chapter {

	@Id
	@Column(name = "chapter_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private int pageNumber;

	public Chapter() {
	}

	public Chapter(String name, int pageNumber) {
		this.name = name;
		this.pageNumber = pageNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

}
