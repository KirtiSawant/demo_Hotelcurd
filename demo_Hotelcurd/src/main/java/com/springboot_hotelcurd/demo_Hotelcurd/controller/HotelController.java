package com.springboot_hotelcurd.demo_Hotelcurd.controller;

import java.util.List;


import com.springboot_hotelcurd.demo_Hotelcurd.model.Hotel;
import com.springboot_hotelcurd.demo_Hotelcurd.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
	@Autowired
	HotelRepository hotelRepository;
	
	@GetMapping("hotel")
	public List<Hotel> getAllhotel(){
		return hotelRepository.findAll();
	}
	
	@PostMapping("hotels")
	public List<Hotel> saveHotel(@RequestBody Hotel hotel){	
		hotelRepository.save(hotel);
		return hotelRepository.findAll();
	}
	
	@DeleteMapping("hotel/{id}")
	public List<Hotel> deleteHotel(@PathVariable("id") long id){	
		hotelRepository.deleteById(id);
		return hotelRepository.findAll();
	}
	
	@PutMapping("hotel")
	public List<Hotel> updateHotel(@RequestBody Hotel hotel){	
		hotelRepository.save(hotel);
		return hotelRepository.findAll();
	}
	
	
}

