package com.springboot_hotelcurd.demo_Hotelcurd.controller;

import com.springboot_hotelcurd.demo_Hotelcurd.dto.HotelDto;
import com.springboot_hotelcurd.demo_Hotelcurd.model.Hotel;
import com.springboot_hotelcurd.demo_Hotelcurd.service.HotelService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;


	@GetMapping("hotel")
	public List<Hotel> getAllHotel() {
		return hotelService.getAllHotel();
	}

	@PostMapping("hotel")
	public HotelDto saveHotel(@RequestBody Hotel hotel) {
		hotelService.saveHotel(hotel);
		HotelDto hotelDto = new HotelDto();
		BeanUtils.copyProperties(hotel, hotelDto);
		return hotelDto;
	}


	/*
	@DeleteMapping("hotel/{id}")
	public List<Hotel> deleteHotel(@PathVariable("id") long id){	
		hotelRepository.deleteById(id);
		return hotelRepository.findAll();
	}
	
	@PutMapping("hotel")
	public List<Hotel> updateHotel(@RequestBody Hotel hotel){	
		hotelRepository.save(hotel);
		return hotelRepository.findAll();
	}*/
	
	
}

