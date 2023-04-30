package com.tulasi.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tulasi.DMS.Models.Dog;


/**
*
* @author Tulasi Bodduluri s554045
*/

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
