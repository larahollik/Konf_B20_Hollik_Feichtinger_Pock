#How to use this CashRegister

Drinks are made of liquids. Use the class Liquids to create the liquids a drink is made of.

Use a Subclass of the absract Class Drink to create the drink you want.

You can use:
- SimpleDrink (to create a simple drink made of one liquid)
- Juice (to create Juice, Subclass of SimpleDrink)
- Cocktails (made of a list of liquids)
- LongDrink (made of a list of liquids and iceCubes, subclass of Cocktail)
___
If something got sold use the method *drink.addArticle(String day, String seller)* to add 
the drink to the list of sold drinks.
___
You can create different kinds of  reports: 

- *CashRegister.salesNonAlc()*: returns the total sales of all non alcoholic drinks
- *CashRegister.salesMildAlc()*: returns the total sales of all alcoholic drink with 16% alc or less
- *CashRegister.salesStrongAlc()*: returns the total sales of all alcoholic drinks with more than 16% alc
- *CashRegister.salesOnDay(String day)*: returns the total sales of a certain day
- *CashRegister.salesOfSeller(String seller)*: returns the total sales of a certain person
- *CashRegister.salesOfPersonOnDay(String day, String seller)*: returns the total sales of a certain person on a certain day


The report methods return doubles. To see them in a beautiful way, use System.out.print().
___

## Example code of using the CashRegister:

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


For more information use the JavaDocs Documentation in Project Reports.