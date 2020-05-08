package io.ankit.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


import io.ankit.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long>{
	
	
	@RestResource(path = "categoryid") // Customized the REST End point. For giving the particular category of books
	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
	
	
	//Search Query for Searching the particular book
	@RestResource(path = "searchbykeyword")
	Page<Book> findByNameContaining(@Param("name") String keyword, Pageable pageable);
	

	
}

































