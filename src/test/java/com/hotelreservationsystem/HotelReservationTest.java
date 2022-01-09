package com.hotelreservationsystem;

import com.hotelreservationsystem.model.Hotel;
import com.hotelreservationsystem.service.HotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;


public class HotelReservationTest {
    @Test
    public void givenHotelDetails_shouldReturnHighestRatedHotel(){

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110, 90);
        hotelReservation.addHotel("Bridgewood", 4, 150, 50);
        hotelReservation.addHotel("Ridgewood", 5, 220, 150);
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 12);
        Hotel hotel = hotelReservation.getBestRatedHotel(startDate, endDate);
        Assertions.assertEquals("Ridgewood", hotel.getHotelName());
    }
}
