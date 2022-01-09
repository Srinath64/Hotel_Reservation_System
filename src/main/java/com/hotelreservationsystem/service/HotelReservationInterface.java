package com.hotelreservationsystem.service;

import com.hotelreservationsystem.model.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public interface HotelReservationInterface {

    public void addHotel(String hotelName, int rating, double weekdayRegularCustomerCost,
                         double weekendRegularCustomerCost, double weekdayRewardCustomerCost, double weekendRewardCustomerCost);

    public int getHotelListSize();

    public void printHotelList();

    public ArrayList<Hotel> getHotelList();

    public String getDates();

    public boolean validateDate(String date);

    public ArrayList<Hotel> getCheapestHotel(String customerType, LocalDate startDate, LocalDate endDate);

    public Hotel getCheapestBestRatedHotel(String customerType, LocalDate startDate, LocalDate endDate);

    public Hotel getBestRatedHotel(String customerType, LocalDate startDate, LocalDate endDate);

    public ArrayList<Integer> getDurationOfStayDetails(LocalDate startDate, LocalDate endDate);
}
