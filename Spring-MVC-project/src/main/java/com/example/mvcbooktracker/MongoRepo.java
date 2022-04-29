package com.example.mvcbooktracker;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MongoRepo extends MongoRepository <Book,String>{
	public List<Book> findAll();

	@Query("{author : ?0}")                                       
        List<Book> getBooksByAuthor(String author);
	
}
