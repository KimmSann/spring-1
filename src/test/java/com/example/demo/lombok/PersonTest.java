package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTest {
	
	@Test
	public void 롬복테스트() {
		Person person = new Person();
		
		person.setName("둘리");
		person.setAge(10);
		
		String name = person.getName();
		int age = person.getAge();
		
		System.out.println(person);
		
		
		Person person2 = new Person();
		
		
		System.out.println(person2.getAge()+","+person2.getAge());
		
		
	}

}
