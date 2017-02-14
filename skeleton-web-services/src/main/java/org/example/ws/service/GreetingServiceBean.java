package org.example.ws.service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.example.ws.model.Greeting;
import org.example.ws.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/** when spring starts , it automatically manages the classes annotated with @Service. 
 */
@Service
/** @Transactional : used to declare the transaction boundary , can be applied to a class / methods 
 * and can be override at the method level.
 * here it instructs the Spring that all the public method of the greetingService interface supports Transactions.
 * 
 * propagation= defines the transaction quality
 * 	SUPPORTS => support only those trans that are already there , don't create if none exists
 * readOnly= defines whether the transaction that have the write related operations are allowed or not.  
 */
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class GreetingServiceBean implements GreetingService {
	/** @Autowired , should be applied to the interface class , and not to the implementation class */
	@Autowired
    private GreetingRepository greetingRepository;
	@Override
	public Collection<Greeting> findAll() {
		Collection<Greeting> greetings = greetingRepository.findAll();
		return greetings;
	}
	@Override
	/** @Cacheable : to define one method as cachable
	 *   value => defines which cache will be used for storing the method responses.
	 *   key => defines the index of the cached objects.  */
	@Cacheable(value="greetings",key="#id")
	public Greeting findOne(Long id) {
		Greeting greeting = greetingRepository.findOne(id);
		return greeting;
	}
	/** @Transactional , should be applied to the implementation class and not to the Interface class.
	 *  here @Transactional behavior is override , to support write operations
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	/*
	 * @Cacheput : used to insert item into the cache or update the item in the cache
	 *   value => defines which cache will be used for storing the method responses.
	 *   key => defines the index of the cached objects.
	 *   #result.id => id(index)will be derived from result(returned greeting Obj).
	 */
	@CachePut(value="greetings",key="#result.id")
	public Greeting create(Greeting greeting) {
		if(greeting.getId() != null){
			// can't create the Greeting with the specified value
			return  null;
		}Greeting savedGreeting = greetingRepository.save(greeting); 
		//Illustrate tx RollBack on an exception
		if(savedGreeting.getId()==5L){
			throw new RuntimeException("Roll me Back! , i hate number 5");
		}
		return savedGreeting;
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	/** #greeting.id => id(index) will be derived from the greeting Object passed , as it is a update not a create */
	@CachePut(value="greetings",key="#greeting.id")
	public Greeting update(Greeting greeting) {
		if(findOne(greeting.getId()) == null){
			// can't update the Greeting which don't exist 
			return null;
		}Greeting updatedGreeting = greetingRepository.save(greeting);
		return updatedGreeting;
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	/*
	 * @CacheEvict : used to remove the items from the cache
	 * */
	@CacheEvict(value="greetings" , key="#id")
	public void delete(Long id) {
		greetingRepository.delete(id);
	}
	@Override
	/*
	 * this evict removes/ purge all the items from the cache
	 *  */
	@CacheEvict(value="greetings" ,allEntries=true)
	public void evictCache() {
			
	}
}
