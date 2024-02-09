package com.RestApi.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.RestApi.Entity.Book;
import com.RestApi.Repositary.BookRepositary;

@Component
public class BookService {
	
	@Autowired
private	BookRepositary bookRepositary;
      
//       public static List<Book>list=new ArrayList<>();
//       
//       static {
//    	   
//    	   list.add(new Book(10,"java","Games Gossiling"));
//    	   list.add(new Book(20,"React","Facebook"));
//    	   list.add(new Book(30,"Spring boot","Rod Jhonson"));
//       }
//       
       
       public List<Book> getbook() {
    	 List<Book>list=(List<Book>)this. bookRepositary.findAll();
    	    return list;
       }
       
//       public Book getbookbyid(int id) {
//              Optional<Book> book=null;        
////    	book=list.stream().filter(e->e.getId()==id).findFirst().get();
////            return book;
//                        
//              try {
//				
//            	  book=this.bookRepositary.findById(id);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//              return book;
//       }
	
       public Book addbook(Book b) {
    	           
    	Book result=bookRepositary.save(b);
    	   return result;
    	   
    	   
       }
       
       public void deletebook(int bid) {
    	         
//    	   list.stream().filter(e->e.getId()!=bid).collect(Collectors.toList());
    	  
    	   bookRepositary.deleteById(bid);
    	   
       }
       
       public void updateBook(Book book,int bookid) {
    	          
//    	   list.stream().map(b->{
//    		   if(b.getId()==bookid) {
//    			   b.setName(b.getName());
//    			   b.setAuthor(b.getAuthor());
//    		   }
//    		   return b;
//    	   }).collect(Collectors.toList());
//    	   
    	  book.setId(bookid);
    	   bookRepositary.save(book);
       }
	
	
	
}
