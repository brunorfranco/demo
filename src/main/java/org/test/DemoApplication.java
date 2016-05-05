package org.test;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.test.entity.Reservation;
import org.test.repository.ReservationRepositoryNewAnnotation;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(ReservationRepositoryNewAnnotation rr){
		return args -> {
			Arrays.asList("Les,Josh,Phil,Sasha,Bruno,Vinicius".split(","))
			.forEach(n -> rr.save(new Reservation(n)));
			
			rr.findAll().forEach(r -> System.out.println(r));
			
			rr.findByReservationName("Bruno").forEach(r -> System.out.println(r));
		};
	}
}
