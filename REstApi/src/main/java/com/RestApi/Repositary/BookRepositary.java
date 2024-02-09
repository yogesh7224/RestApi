package com.RestApi.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.RestApi.Entity.Book;

public interface BookRepositary extends CrudRepository<Book, Integer>{

}
