package com.sindam.DMS.repository;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.repository.CrudRepository;

import com.sindam.DMS.Models.Dog;


/**
 * 
 * @author S555653 Suresh Sindam
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
