package com.hashmap.assignment.services;

import com.hashmap.assignment.Utilty.Themes;
import com.hashmap.assignment.Utilty.Type;
import com.hashmap.assignment.model.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FoodTest {
    private static FoodPanda foodPanda;
    private Cart cart=new Cart();

    @BeforeClass
    public static void setup(){
        HotelServiceImplementation hotelServices = new HotelServiceImplementation();

        Map<Food, Integer> mapLakewood = new HashMap<Food, Integer>();
        Map<Food, Integer> mapBridgewood = new HashMap<Food, Integer>();
        Map<Food, Integer> mapRidgewood = new HashMap<Food, Integer>();

        mapLakewood.put(new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)), 120);
        mapLakewood.put(new Food("PAV BHAJI",new Category(Themes.INDIAN, Type.VEG)), 60);
        mapLakewood.put(new Food("GOLGAPPE",new Category(Themes.INDIAN, Type.VEG)), 20);
        mapLakewood.put(new Food("RAJMA CHAWAL",new Category(Themes.INDIAN, Type.VEG)), 40);
        mapLakewood.put(new Food("PIZZA",new Category(Themes.ITALIAN, Type.VEG)), 200);
        mapLakewood.put(new Food("THAI CURRY",new Category(Themes.CONTINENTAL, Type.VEG)), 320);

        mapBridgewood.put(new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),100);
        mapBridgewood.put(new Food("PAV BHAJI",new Category(Themes.INDIAN, Type.VEG)),50);
        mapBridgewood.put(new Food("GOLGAPPE",new Category(Themes.INDIAN, Type.VEG)), 20);
        mapBridgewood.put(new Food("PIZZA",new Category(Themes.ITALIAN, Type.NONVEG)), 200);

        mapRidgewood.put(new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),100);
        mapRidgewood.put(new Food("PAV BHAJI",new Category(Themes.INDIAN, Type.VEG)), 60);
        mapRidgewood.put(new Food("GOLGAPPE",new Category(Themes.INDIAN, Type.VEG)), 40);
        mapRidgewood.put(new Food("RAJMA CHAWAL",new Category(Themes.INDIAN, Type.VEG)),50);
        mapRidgewood.put(new Food("PIZZA",new Category(Themes.ITALIAN, Type.VEG)),200);
        mapRidgewood.put(new Food("THAI CURRY",new Category(Themes.CONTINENTAL, Type.VEG)), 320);

        hotelServices.addHotel(new Hotel("LAKEWOOD",3,mapLakewood));
        hotelServices.addHotel(new Hotel("BRIDGEWOOD",3,mapBridgewood));
        hotelServices.addHotel(new Hotel("RIDGEWOOD",3,mapRidgewood));

        foodPanda=new FoodPanda(hotelServices.getHotelList());
    }

    @Test
    public void getTotalTest(){
        cart.addItem(new Request("LAKEWOOD",new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),2));
        cart.addItem(new Request("BRIDGEWOOD",new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),2));

        double billAmount=foodPanda.getTotal(cart);
        double expectedBill=440;
        Assert.assertEquals((long)expectedBill,(long)billAmount);
    }


}