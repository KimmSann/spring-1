package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Quiz4 {

	
	@Autowired
	Cafe cafe;

	
	@Autowired
	Manager manager;

	@Test
	void 카페와매니저가_컨테이너에_생성되었는지확인() {
		System.out.println("cafe: " + cafe);
		System.out.println("manager: " + manager);
	}

	@Test
	void 테스트의매니저와_카페의매니저가_같은객체인지확인() {
		// 두 객체의 주소가 같음
		System.out.println("manager: " + manager);
		System.out.println("cafe의 manager: " + cafe.manager);
	}

}
