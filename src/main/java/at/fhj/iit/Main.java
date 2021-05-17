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

        System.out.println("\n"+"*".repeat(50)+"\n");

        Cocktail c = new Cocktail("Pina Colada", "creamy", "Hurricane", 0.300, 28.0);
        c.setCocktailType(Cocktail.CocktailType.Dessert_Cocktail);
        c.addDecoration("pineapple");
        System.out.println(c.printCocktailMessage());

        System.out.println("\n"+"*".repeat(50)+"\n");

        Liquid juice = new Liquid("juice", 1, 0);
        Juice j = new Juice("applejuice", juice, "apple", 17.20, true);
        System.out.println(j.toString() + ", " + j.informationToString());

        System.out.println("\n"+"*".repeat(50)+"\n");

        Drink lD = new LongDrink("Basil Smash", "sour", "Hurricane", 0.33, 12.0);
        System.out.println(lD);

        
    }
}
