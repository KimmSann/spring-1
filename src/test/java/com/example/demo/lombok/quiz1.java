package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest 
public class quiz1 {

	@Test //단위테스트
	void 도서클래스생성테스트() {
		Book book1 = new Book();
		book1.setTitle("자바프로그래밍입문");
		book1.setPrice(20000);
		book1.setCompany("한빛미디어");
		book1.setPage(300);
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println(book1.getCompany());
		System.out.println(book1.getPage());
		
		Book book2 = new Book("스프링부트",30000,"남가락북스",400);
		System.out.println(book2.toString());
		
		Book book3 = Book.builder().title("엘라스틱서치").price(150).company("책만").page(350).build();
		System.out.println(book3.toString());
	}
}
