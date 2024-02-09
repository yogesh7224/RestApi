package com.RestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.Entity.Book;
import com.RestApi.Service.BookService;

@RestController
public class BookController {
               
	@Autowired
private	BookService bookService;
	
	
	@GetMapping("/yogesh")
	public List<Book> bookgetbooks() {
		 
		return this.bookService.getbook();
	}
	     
//	
//	@GetMapping("/yogesh/{id}")
//	public Book bookgetbooksbyids(@PathVariable ("id")int id) {
//		 
//	return this.bookService.getbookbyid(id);
//
//
//	}
	
	@PostMapping("/yogesh")
	public Book addbooks(@RequestBody Book book) {
		
	Book	b= this.bookService.addbook(book);
		return b;
	}
	
	@DeleteMapping("/yogesh/{bid}")
	public void deletebooks(@PathVariable("bid")int bid) {
           this.bookService.deletebook(bid);


	}
	
	@PutMapping("/yogesh/{bookid}")
	public Book updatebook(@RequestBody Book book ,@PathVariable("bookid")int bookid) {
		           
		this.bookService.updateBook(book, bookid);
		return book;
	}
	
}
