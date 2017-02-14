package org.booking.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String hotelName;
	private double pricePerNight;
	private int nbOfNight;
	
	// default constructor is needed by string for object construction from a input Json
	public HotelBooking(){}
	public HotelBooking(String hotelName, double pricePerNight, int nbOfNight) {
		super();
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
		this.nbOfNight = nbOfNight;
	}

	public String getHotelName() {
		return hotelName;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public int getNbOfNight() {
		return nbOfNight;
	}
	
	public double getTotalPrice(){
		return pricePerNight*nbOfNight;
	}
	
	public Long getId(){
		return id;
	}
}
