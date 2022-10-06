package project.rentacar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import project.rentacar.entities.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {

}
