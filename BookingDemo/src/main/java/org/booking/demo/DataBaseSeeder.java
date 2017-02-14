package org.booking.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * all the class which implements the CommandLineRunner gets executed immediately after the context path is set.
 * 
 * this class is used here by the spring to populate the DB
 */
@Component
public class DataBaseSeeder implements CommandLineRunner{

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	public DataBaseSeeder(BookingRepository bookingRepository){
		this.bookingRepository=bookingRepository;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		List<HotelBooking> bookings=new ArrayList<>();
		bookings.add(new HotelBooking("vegas-june",200,3));
		bookings.add(new HotelBooking("panther-motel",150,3));
		bookings.add(new HotelBooking("Ibis",250,3));
		
		bookingRepository.save(bookings);
	}

}
