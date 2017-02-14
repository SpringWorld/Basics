package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/** spring boot main (configuration class) application 
 */
@SpringBootApplication
/** this informs spring to enable transaction management support within the application
 *  and search the code base for the transactional boundary.
 */
@EnableTransactionManagement 
/** this informs the spring to enable cache management support within the application , 
 * and search the code base for cache management metadata.  
 */
@EnableCaching
/**
 * this annotation informs the spring to search in the application code base for methods annotated
 * with scheduling metadata. 
 */
@EnableScheduling
/**
 * this informs the spring to search the code base for the async processes and execute them separately
 */
@EnableAsync
public class Application {
	public static void main(String[] args) throws Exception{
		//supplying the name of this call and any argument passed via command line
		SpringApplication.run(Application.class, args);
	}
	/* spring uses the cachedManager to store the cached Objects
	 *  we need to define the cache management bean
	 */
	@Bean
	public CacheManager cacheManager(){
		/* let us use the simple in memory cache manager class of spring , good for non-production environment
		* CacheManager constructor accepts array of strings , which signifies the individual named caches
		*  controlled by the Manager .
		*/
	//	ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager("greetings");
		GuavaCacheManager cacheManager = new GuavaCacheManager("greetings");
		return cacheManager;
	}
	
	/**
	 * TODO:Asynchronous processes are the task executed by spring in seperate thread
	 */
	
}
