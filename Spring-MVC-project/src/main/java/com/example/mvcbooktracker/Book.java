package com.example.mvcbooktracker;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Book")
public class Book {
	private String name;
	private String description;
	private String author;
	public String id;

	private String name2;
	private String description2;
	private String author2;
	public String id2;

	

	private int yearOfRelease;
	private int rating;

	private int yearOfRelease2;
	private int rating2;

	//Getter Functions
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getAuthor() {
		return author;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public int getRating() {
		return rating;
	}


	public String getName2() {
		return name2;
	}
	public String getDescription2() {
		return description2;
	}
	public String getAuthor2() {
		return author2;
	}
	public int getYearOfRelease2() {
		return yearOfRelease2;
	}
	public int getRating2() {
		return rating2;
	}

	//Setter Functions

	public void getID (String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}


	public void setName2(String name) {
		this.name2 = name;
	}
	public void setDescription2(String description) {
		this.description2 = description;
	}
	public void setAuthor2(String author) {
		this.author2 = author;
	}
	public void setYearOfRelease2(int yearOfRelease) {
		this.yearOfRelease2 = yearOfRelease;
	}
	public void setRating2(int rating) {
		this.rating2 = rating;
	}

}
