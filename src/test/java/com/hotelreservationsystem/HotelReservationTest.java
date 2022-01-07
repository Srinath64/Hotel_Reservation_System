package com.hotelreservationsystem;

import com.hotelreservationsystem.model.Hotel;
import com.hotelreservationsystem.service.HotelReservation;
import com.hotelreservationsystem.service.HotelReservationInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HotelReservationTest {
    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRating(){
        HotelReservationInterface hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Ridgewood", 5, 220, 150);
        int hotelRating = hotelReservation.getHotelList().get(0).getRating();
        Assertions.assertEquals(5, hotelRating);
    }
}
