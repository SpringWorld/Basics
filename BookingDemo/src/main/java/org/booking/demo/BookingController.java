package org.booking.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/bookings")
public class BookingController {

	private List<HotelBooking> bookings;
	
	private BookingRepository bookingRepository ;
	@Autowired
	public BookingController(BookingRepository bookingRepository){
		this.bookingRepository=bookingRepository;
	}
	
	@RequestMapping(value="/all" , method=RequestMethod.GET)
	public List<HotelBooking> getAll(){
		return bookingRepository.findAll();
	}
	
	@RequestMapping(value="/affordable/{price}",method=RequestMethod.GET)
	public List<HotelBooking> getAffordable(@PathVariable double price){
		List<HotelBooking> affordableHotels = new ArrayList<>();
		for(HotelBooking hotels : bookingRepository.findAll()){
			if(hotels.getPricePerNight()<price){
				affordableHotels.add(hotels);
			}
		}
		return affordableHotels;
	}
	
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
		public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
		bookingRepository.save(hotelBooking);
		return bookingRepository.findAll();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public List<HotelBooking> remove (@PathVariable Long id){
		bookingRepository.delete(bookingRepository.findOne(id));
		return bookingRepository.findAll();
	}
}