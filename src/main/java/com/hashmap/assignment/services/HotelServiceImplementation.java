package com.hashmap.assignment.services;

import com.hashmap.assignment.model.Food;
import com.hashmap.assignment.model.Hotel;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@EqualsAndHashCode
public class HotelServiceImplementation implements ManageHotel {
    private List<Hotel> hotelList=new ArrayList<Hotel>();

    public void showMenu(Hotel hotel){
    System.out.println("ITEM NAME      THEME     TYPE     COST/plate");
     for (Map.Entry<Food, Integer> map :hotel.getMenu().entrySet() ) {
    System.out.println(map.getKey().getFoodName() + "  " +map.getKey().getCategory().getTheme()
    + "  "+ map.getKey().getCategory().getType()+"  "+map.getValue());   }
    }

    public void addHotel(Hotel hotel){
        hotelList.add(hotel);
    }

    public void removeHotel(Hotel hotel){
        hotelList.remove(hotel);
    }
}
