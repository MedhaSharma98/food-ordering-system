package com.hashmap.assignment.services;

import com.hashmap.assignment.model.Hotel;

import java.util.List;

public interface ManageHotel {
    public void showMenu(Hotel hotel);
    public List<Hotel> getHotelList();
    public void addHotel(Hotel hotel);
    public void removeHotel(Hotel hotel);
}
