package com.hotelreservationsystem;

import com.hotelreservationsystem.model.Hotel;
import com.hotelreservationsystem.service.HotelReservation;
import com.hotelreservationsystem.service.HotelReservationInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;


public class HotelReservationTest {
    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelWeekdayRewardCustomerCost() {
        HotelReservationInterface hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 150, 50, 110, 50);
        int hotelRewardCustomerCost = (int) hotelReservation.getHotelList().get(0).getWeekdayRewardCustomerCost();
        hotelReservation.printHotelList();
        Assertions.assertEquals(110, hotelRewardCustomerCost);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelWeekendRewardCustomerCost() {
        HotelReservationInterface hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 150, 50, 110, 50);
        int hotelRegularCustomerCost = (int) hotelReservation.getHotelList().get(0).getWeekendRewardCustomerCost();
        hotelReservation.printHotelList();
        Assertions.assertEquals(50, hotelRegularCustomerCost);
    }

}
