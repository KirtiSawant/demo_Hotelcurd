package com.springboot_hotelcurd.demo_Hotelcurd.service;

import com.springboot_hotelcurd.demo_Hotelcurd.model.Hotel;
import com.springboot_hotelcurd.demo_Hotelcurd.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    public List<Hotel> getAllHotel() {
        List<Hotel> hotels = hotelRepository.findAll();
        System.out.println("getting from db:" + hotels);
        return hotels;
    }

    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
