package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
//	Chef chef = new 백종원();
//	Chef chef = new 이연복();
	
	@Autowired
	Chef chef;
	
	Chef chef2 = new 이연복();
	
}
