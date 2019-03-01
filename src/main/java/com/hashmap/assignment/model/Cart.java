package com.hashmap.assignment.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Cart {
   private List<Request> itemList = new ArrayList<Request>();
   double total;

   public void addItem(Request request) {
            itemList.add(request);
}

   public void deleteItem(Food item){
       itemList.remove(item);
   }

   public void showCartDetails(){
      for(Request r:itemList){
        System.out.println("HOTEL NAME: "+r.getHotelName()+" "+"ITEM: "+r.getItem()+" "+"QUANTITY: "+r.getQuantity());
         } }

    public void calculateTotal(List<Hotel> hotelList) {
        for(Request r:itemList){
          for(Hotel hotel : hotelList) {
            if(hotel.getName().equalsIgnoreCase(r.getHotelName())){
                 total+=hotel.getMenu().get(r.getItem())*r.getQuantity(); }
            }
        }
    }
}
