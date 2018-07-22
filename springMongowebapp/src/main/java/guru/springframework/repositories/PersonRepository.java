package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.model.Person;

public interface PersonRepository extends CrudRepository<Person, String> {

	
}
