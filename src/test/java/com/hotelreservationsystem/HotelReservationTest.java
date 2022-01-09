package com.hotelreservationsystem;

import com.hotelreservationsystem.Exception.HotelReservationException;
import com.hotelreservationsystem.model.Hotel;
import com.hotelreservationsystem.service.HotelReservation;
import com.hotelreservationsystem.service.HotelReservationInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;


public class HotelReservationTest {
    @Test
    public void givenHotelDetails_WhenNull_ShouldThrowHotelReservationException() {


        try {
            HotelReservation hotelReservation = new HotelReservation();
            hotelReservation.addHotel("Lakewood", 3, 110, 90, 80, 80);
            hotelReservation.addHotel("Bridgewood", 4, 150, 50, 110, 50);
            hotelReservation.addHotel("Ridgewood", 5, 220, 150, 100, 40);
            LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
            LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 12);
            hotelReservation.getCheapestBestRatedHotel(null, startDate, endDate);
        }
        catch(HotelReservationException e){
            Assertions.assertEquals(HotelReservationException.ExceptionType.ENTERED_NULL, e.type);
            e.printStackTrace();
        }

    }

    @Test
    public void givenHotelDetails_WhenEmpty_ShouldThrowHotelReservationException() {


        try {
            HotelReservation hotelReservation = new HotelReservation();
            hotelReservation.addHotel("Lakewood", 3, 110, 90, 80, 80);
            hotelReservation.addHotel("Bridgewood", 4, 150, 50, 110, 50);
            hotelReservation.addHotel("Ridgewood", 5, 220, 150, 100, 40);
            LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
            LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 12);
            hotelReservation.getCheapestBestRatedHotel("", startDate, endDate);
        }
        catch(HotelReservationException e){
            Assertions.assertEquals(HotelReservationException.ExceptionType.ENTERED_EMPTY, e.type);
            e.printStackTrace();
        }

    }
}
