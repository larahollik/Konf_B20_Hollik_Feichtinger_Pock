package at.fhj.iit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);

        Cocktail c = new Cocktail("Pina Colada", "creamy", "Hurricane");
        c.setCocktailType(Cocktail.CocktailType.Dessert_Cocktail);
        c.setAlcoholPercent(28.0);
        c.setVolume(0.300);
        c.addDecoration("pineapple");
        System.out.println(c.printCocktailMessage());
    }
}
