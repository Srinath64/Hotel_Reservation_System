package com.hotelreservationsystem;

import com.hotelreservationsystem.Exception.HotelReservationException;
import com.hotelreservationsystem.service.HotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HotelReservationTest {
    @Test
    public void givenDate_WhenNotProperFormat_ShouldReturnFalse() {

        HotelReservation hotelReservation = new HotelReservation();
        boolean isNotVAlid = hotelReservation.validateDate("19-10-1999");
        Assertions.assertFalse(isNotVAlid);
    }

    @Test
    public void givenDate_WhenSeperatedBySlashes_ShouldReturnFalse() {

        HotelReservation hotelReservation = new HotelReservation();
        boolean isNotVAlid = hotelReservation.validateDate("1999/09/2021");
        Assertions.assertFalse(isNotVAlid);
    }

    @Test
    public void givenDate_WhenContainsCharcters_ShouldReturnFalse() {

        HotelReservation hotelReservation = new HotelReservation();
        boolean isNotVAlid = hotelReservation.validateDate("200s-a2-19");
        Assertions.assertFalse(isNotVAlid);
    }

    @Test
    public void givenDate_WhenSpecialCharcters_ShouldReturnFalse() {

        HotelReservation hotelReservation = new HotelReservation();
        boolean isNotVAlid = hotelReservation.validateDate("2009/%%/13");
        Assertions.assertFalse(isNotVAlid);
    }

    @Test
    public void givenDate_WhenNull_ShouldThrowHotelReservationException() {

        HotelReservation hotelReservation = new HotelReservation();
        try {
            String date = null;
            hotelReservation.validateDate(date);
        }
        catch(HotelReservationException e){
            Assertions.assertEquals(HotelReservationException.ExceptionType.ENTERED_NULL,e.type);
            e.printStackTrace();
        }
    }

    @Test
    public void givenDate_WhenEmpty_ShouldThrowHotelReservationException() {

        HotelReservation hotelReservation = new HotelReservation();
        try {
            String date = "";
            hotelReservation.validateDate(date);
        }
        catch(HotelReservationException e){
            Assertions.assertEquals(HotelReservationException.ExceptionType.ENTERED_EMPTY,e.type);
            e.printStackTrace();
        }
    }
}
