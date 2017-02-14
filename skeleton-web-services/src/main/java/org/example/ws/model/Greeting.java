package org.example.ws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * @Entity : makes this class JPA persistent model class and it will be registered by the Spring Data Framework
 * 
 */

@Entity
public class Greeting {

	/*
	 * @Id :  this "id" will be the primary key 
	 * @GeneratedValue = this denote that the "id" will be generated by the underlying DB 
	 */
	@Id
	@GeneratedValue
	private Long id;
	private String text;
	public Greeting(){
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}