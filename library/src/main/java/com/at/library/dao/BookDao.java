package com.at.library.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.at.library.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Integer> {

	List<Book> findBookByName(String name);
	
	
}
