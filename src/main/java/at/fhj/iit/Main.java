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

        List<Liquid> liquids = new ArrayList<Liquid>();
        Liquid gin = new Liquid("gin", 0.2, 45);
        liquids.add(gin);
        Liquid tonic = new Liquid("tonic", 0.3, 0.00);
        liquids.add(tonic);

        Cocktail ginTonic = new Cocktail("Gin Tonic", "sour", "Old Fashioned", liquids);
        ginTonic.addDecoration("lemon");
        ginTonic.setCocktailType(Cocktail.CocktailType.Shortdrink);
        System.out.println(ginTonic.printCocktailMessage());




        System.out.println("\n"+"*".repeat(50)+"\n");

        Liquid juice = new Liquid("juice", 1, 0);
        Juice j = new Juice("applejuice", juice, "apple", 17.20, true);
        System.out.println(j.toString() + ", " + j.informationToString());

        System.out.println("\n"+"*".repeat(50)+"\n");

//        Drink lD = new LongDrink("Basil Smash", "sour", "Hurricane", 0.33, 12.0);
//        System.out.println(lD);

        
    }
}
