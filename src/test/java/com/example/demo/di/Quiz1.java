package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest

public class Quiz1 {

	
	@Autowired
	Dog dog;

	@Test
	public void 강아지객체가_컨테이너에_생성되었는지확인() {
		dog.sound();
	}
}
