package com.example.mvcbooktracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BookController {

	@Autowired
	public MongoRepo repo;

	@GetMapping("/")
	public String homepage(Model model){
		return "homepage";
	}

	@GetMapping("/viewbooks")
	public String viewBooks(Model model) {
		List<Book> books = repo.findAll();
		model.addAttribute("allbooks",books);
		return "viewbooks";
	}
	
	@GetMapping("/addbook")
	public String addBook(Model model) {
		model.addAttribute("book",new Book());
		return "addbook";
	}

	@PostMapping("/addbook")
	public String submitBook(@ModelAttribute("book") Book book) {
		repo.save(book);
		return "redirect:viewbooks";
	}

	@GetMapping("/editbook")
	public String editBook(Model model) {
		model.addAttribute("book",new Book());


		return "editbook";
	}

	@PostMapping("/editbook")
	public String submiteditBook(@ModelAttribute("book") Book book) {
		System.out.println(book.getAuthor2());

		
		List<Book> books = repo.getBooksByAuthor(book.getAuthor());
		for(Book b : books) {
				b.setAuthor(book.getAuthor2());
				b.setDescription(book.getDescription2());
				b.setName(book.getName2());
				b.setYearOfRelease(book.getYearOfRelease2());
				b.setRating(book.getRating2());
				repo.save(b);
		}
		return "redirect:viewbooks";
	}


	@GetMapping("/deletebook")
	public String deleteBook(Model model) {
		model.addAttribute("book",new Book());
		return "deletebook";
	}

	@PostMapping("/deletebook")
	public String editedBook(@ModelAttribute("book") Book book) {
		System.out.println(book.getAuthor());
		List<Book> books = repo.getBooksByAuthor(book.getAuthor());
		for (Book b : books) {
			System.out.println(b.getAuthor());
			repo.delete(b);
		}
		return "redirect:viewbooks";
	}
}
