package com.arkoma.demo;

import com.arkoma.demo.entities.Car;
import com.arkoma.demo.repository.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CarRepository carRepo) {
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
			"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV", "LC500", "ShelbyGT350", "Aston Martin")
				.forEach(name -> {
					Car car = new Car();
					car.setName(name);
					carRepo.save(car);
				});
				carRepo.findAll().forEach(System.out::println);
		};
	}
}
