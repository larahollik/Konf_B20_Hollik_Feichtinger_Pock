package at.fhj.iit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args){

        // create new Drinks
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

        Cocktail ginTonic = new Cocktail("Gin Tonic", "sour", "Old Fashioned", liquids, Cocktail.CocktailType.Shortdrink);
        ginTonic.addDecoration("lemon");
        System.out.println(ginTonic.printCocktailMessage());

        System.out.println("\n"+"*".repeat(50)+"\n");

        Liquid juice = new Liquid("juice", 0.5, 0);
        Juice j = new Juice("applejuice", juice, 17.20, true);
        System.out.println(j.informationToString());

        System.out.println("\n"+"*".repeat(50)+"\n");

        List<Liquid> liquids2 = new ArrayList<Liquid>();
        Liquid vodka = new Liquid("vodka", 0.1, 40);
        liquids2.add(vodka);
        Liquid orangeJuice = new Liquid("orange juice", 0.3, 0.00);
        liquids2.add(orangeJuice);
        LongDrink vodkaOrange = new LongDrink("Vodka Orange", "sweet", liquids2 );
        System.out.println(vodkaOrange.toString());


        // add sells to the list
        ginTonic.addArticle("02.04.2021", "Hollik");

        j.addArticle("03.05.2021", "Pock");

        vodkaOrange.addArticle("02.04.2021", "Feichtinger");

        // print reports
        System.out.println("\n\nSum of non alcoholic drinks: " + CashRegister.salesNonAlc());

        System.out.println("Sum of mild alcoholic drinks: " + CashRegister.salesMildAlc());

        System.out.println("Sum of strong alcoholic drinks: " + CashRegister.salesStrongAlc());

        System.out.println("Sum of sales of seller Feichtinger: " + CashRegister.salesOfSeller("Feichtinger"));

        System.out.println("Sum of certain day: " + CashRegister.salesOnDay("02.04.2021"));

        System.out.println("Sum of seller Pock on certain day: " + CashRegister.salesOfPersonOnDay("03.05.2021", "Pock"));


    }
}
