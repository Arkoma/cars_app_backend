package com.arkoma.demo.repository;

import com.arkoma.demo.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "https://localhost:4200")
public interface CarRepository extends JpaRepository<Car, Long> {

}
