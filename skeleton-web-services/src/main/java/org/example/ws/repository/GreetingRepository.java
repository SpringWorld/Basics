package org.example.ws.repository;

import org.example.ws.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.stereotype.Repository;

/*
 * spring data repository .
 * Jpa< EntityClass , PrimaryKey >
 * 
 * 
 * spring registers the @Repository Components when the Application starts
 */

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long>{
	
}