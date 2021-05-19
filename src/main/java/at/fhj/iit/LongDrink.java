package at.fhj.iit;

import java.util.List;

/**
 * Contains all relevant information to create a long drink
 * It is a derived class that inherits from the class {@link Cocktail}
 *
 * @author Viktoria Feichtinger
 * @version 2.0, 20.04.2021
 * @see Cocktail
 * @since v1.0
 */
public class LongDrink extends Cocktail {

    private int iceCube;

    /**
     * Creates a Cocktail object with given name from superclass {@link Cocktail}, e.g. Pina Colada, Mojito,
     * with the identified flavour, e.g. sour, sweet, creamy...,
     * with the type of glass, e.g. Balloon, Old Fashion...
     *
     * @param name    name of the drink
     * @param flavour flavour of the cocktail
     * @param liquids list of liquids
     */
    public LongDrink(String name, String flavour, List<Liquid> liquids) {
        super(name);
        if(liquids.size() <= 2) {
           super.name = name;
           super.setFlavour(flavour);
           super.setGlass("Hurricane");
           super.setLiquids(liquids);
           this.iceCube = getIceCubes();
           super.getAlcoholPercent();
           super.getVolume();
       } else {
           System.out.println("To many liquids for a Longdrink!");
       }


    }


    public int getIceCubes() {
        if (getVolume()>0.3) {
            return 3;
        } else {
            return 2;
        }

    }
    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public double getAlcoholPercent() {
        return super.getAlcoholPercent();
    }

    @Override
    public boolean isAlcoholic() {
        return super.isAlcoholic();
    }



    /**
     * Classification of the CocktailType that are valid for all object from that class
     */
    private final CocktailType cocktailType = CocktailType.Longdrink;

    /**
     * Contains given information from the class about a specific long drink
     *
     * @return String of given information
     */
    public String toString() {
        return name + " is a " + getFlavour() + " " + cocktailType +
                " served in a " + getGlass() + " glass with "+getIceCubes() + " ice cubes."
                + "\nMostly it has a volume of " + getVolume()
                + " with an alcohol percentage of " + getAlcoholPercent() + ".";
    }
}