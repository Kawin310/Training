package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.example.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BookServiceTest {

BookService service=null;
	
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"called");
	}
	@BeforeEach
	public void setUp() {
		 service = new BookService();
	}
	
	@Test
	@DisplayName(value = "The List must have Value")
	void testBookList()
	{
		BookService service=new BookService();
		assertNotNull(service.getBookList());
	}
	
	@DisplayName(value = "add Method Should return 1 for Success and 0 for failure to insert")
	@Test
	void testBookListToAdd()
	{
		Book book=new Book(101,"kawin",22);
		Object value=service.addBook(book);
     
         assertEquals(1,value);			
		
	}
	
	@DisplayName(value = "addBook Method Should not Accept Duplicate value")
	@Test
	void testDuplicate()
	{
		
//		assertAll("Testing Add book",
//				()->assertEquals(1,new Book(103,"Java",450)),
//				()->assertEquals(0,new Book(103,"Java",450))
//				);
			BookService service=new BookService();
			Book Java=new Book(1001, "Java", 700);
			Book list=new Book(1001, "Java", 700);
			service.addBook(Java);
			 int actual=service.addBook(list);
			 int expected=0;
			 assertEquals(expected, actual);			
		}
	
	
	@DisplayName(value = "If the element is not found in the collection removeBook method should throw runtime exception element not found")
	@Test
	void testRemovebook()
	{
		Book book=new Book(3, "Ramayanam", 100.0);
				
		Throwable e=assertThrows(RuntimeException.class,
				()-> service.removeBook(book));
		assertEquals("Element Not Found",e.getMessage());
		
	}
	
	@DisplayName(value = "Test if getBestBook method has the Value Head First Java in one first three positions")
	@ParameterizedTest
	@ValueSource(ints= {0,1,2})
	void testGetBestBook(int pos)
	{
        System.out.println(System.getProperty("os.name"));
		
		assumeTrue(System.getProperty("os.name").equals("Windows 8.1"));
		
		assertEquals("Head First Java",service.getBestBooks().get(pos));
	}
	
	}
	
//BookService service = new BookService();
//Book book = new Book(101, "venki", 1000);
//int actual = service.addBook(book);
//
//Set<Book> set = service.getBookList();
//boolean value=set.contains(book);
//assertEquals(false,value);
