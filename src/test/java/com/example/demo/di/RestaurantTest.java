package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestaurantTest {
	
	@Autowired
	Restaurant restaurant;
	
	// 컨테이너 안에 동일한 타입의 빈이 2개 이상 있으면, 에러남
	@Autowired
	Chef chef;
	
	@Test
	public void 테스트(){
		
		
		System.out.println("chef:" + chef);
		System.out.println("Restaurant: " + restaurant.chef);
	}
}
