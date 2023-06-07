package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FridgerFactory {
    private static final Map<String, Fridger> fridgers = new HashMap<>();

    public Fridger NeedFridger(String type){
        Fridger fridger = fridgers.get(type);
        if (fridger == null){
            if (type.equals("Meet")){
                fridger = new MeetFridger();
            }
            else if (type.equals("Vegetable")){
                fridger = new VegFridger();
            }
            fridgers.put(type, fridger);
        }
        return fridger;
    }
}
