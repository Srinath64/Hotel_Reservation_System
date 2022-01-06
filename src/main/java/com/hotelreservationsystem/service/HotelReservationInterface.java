package com.hotelreservationsystem.service;

import com.hotelreservationsystem.model.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public interface HotelReservationInterface {

    public void addHotel(String hotelName,int rating, double weekdayRegularCustomerCost, double weekendRegularCustomerCost);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate);
}
