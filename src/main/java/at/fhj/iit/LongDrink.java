package at.fhj.iit;

import java.util.List;

/**
 * Contains all relevant information to create a long drink
 * It is a derived class that inherits from the class {@link Cocktail}
 *
 * @author Viktoria Feichtinger
 * @version 2.0, 19.05.2021
 * @see Cocktail
 * @since v1.0
 */
public class LongDrink extends Cocktail {

    private int iceCube;

    /**
     * Creates a Longdrink object with given name from superclass {@link Cocktail}, e.g. Pina Colada, Mojito,
     * with the identified flavour, e.g. sour, sweet, creamy...,
     * with the type of glass Hurricane and the CocktailType Longdrink
     *
     * @param name    name of the drink
     * @param flavour flavour of the cocktail
     * @param liquids list of liquids
     */
    public LongDrink(String name, String flavour, List<Liquid> liquids){
        super(name, flavour, "Hurricane", liquids, CocktailType.Longdrink);
        this.iceCube = getIceCubes();
    }

//    public LongDrink(String name, String flavour, List<Liquid> liquids) {
//        super(name);
//        if(liquids.size() <= 2) {
//           super.name = name;
//           super.setFlavour(flavour);
//           super.setGlass("Hurricane");
//           super.setLiquids(liquids);
//           super.setCocktailType(CocktailType.Longdrink);
//           this.iceCube = getIceCubes();
//       } else {
//           System.out.println("To many liquids for a Longdrink!");
//       }
//    }

    public int getIceCubes() {
        if (getVolume()>0.3) {
            return 3;
        } else {
            return 2;
        }
    }

    @Override
    public double getVolume() {
        double volume = super.getVolume();
        volume += (0.02 * this.iceCube);
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        double alcoholPercent = super.getAlcoholPercent();
        alcoholPercent -= (0.01 * this.iceCube);

        return alcoholPercent;
    }

    @Override
    public boolean isAlcoholic() {
        return super.isAlcoholic();
    }

    /**
     * Contains given information from the class about a specific long drink
     *
     * @return String of given information
     */
    public String toString() {
        return name + " is a " + super.getFlavour() + " " + getCocktailType() +
                " served in a " + super.getGlass() + " glass with "+ getIceCubes() + " ice cubes."
                + "\nMostly it has a volume of " + super.getVolume()
                + " with an alcohol percentage of " + super.getAlcoholPercent() + "%.";
    }
}