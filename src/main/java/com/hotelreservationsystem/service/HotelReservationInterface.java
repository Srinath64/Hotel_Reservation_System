package com.hotelreservationsystem.service;

import com.hotelreservationsystem.model.Hotel;

import java.util.ArrayList;

public interface HotelReservationInterface {

    public void addHotel(String hotelName,int rating, double regularCustomerRate);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
}
