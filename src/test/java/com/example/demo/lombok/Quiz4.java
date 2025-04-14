package com.example.demo.lombok;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class Quiz4 {

	@Test
	void 영화클래스생성테스트() {
		Movie movie = new Movie();
		movie.setTitle("서울의 봄");
		movie.setDirector("김성수");
		movie.setDate(LocalDate.of(2023, 11, 22)); // 시간 생성
		System.out.println(movie.getTitle());
		System.out.println(movie.getDirector());
		System.out.println(movie.getDate());

	
		Movie movie2 = new Movie("3일의 휴가", "육상효", null);
		System.out.println(movie2);

		
		Movie movie3 = Movie.builder().title("리틀 포레스트").director("임순례").build();
		System.out.println(movie3);
	}
}