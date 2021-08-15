package com.springboot_hotelcurd.demo_Hotelcurd.repository;

import com.springboot_hotelcurd.demo_Hotelcurd.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {


}
