import Flyweight.Fridger;
import Flyweight.FridgerFactory;
import facade.UserFacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // facade pattern
        System.out.println("facade pattern");
        UserFacade userFacade = new UserFacade();
        userFacade.send("asd", "zxc", "qwe");
        userFacade.printInfo();


        System.out.println("\n\nЛегковесный паттерн(приспособленец): \n");
        FridgerFactory fridgerFactory = new FridgerFactory();
        List<Fridger> fridgers = new ArrayList<>();

        fridgers.add(fridgerFactory.NeedFridger("Meet"));
        fridgers.add(fridgerFactory.NeedFridger("Meet"));
        fridgers.add(fridgerFactory.NeedFridger("Meet"));
        fridgers.add(fridgerFactory.NeedFridger("Vegetable"));
        fridgers.add(fridgerFactory.NeedFridger("Vegetable"));
        fridgers.add(fridgerFactory.NeedFridger("Vegetable"));
        fridgers.add(fridgerFactory.NeedFridger("Vegetable"));
        for(Fridger fridger: fridgers){
            fridger.Working();
        }
    }
}