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
public class LongDrink extends Cocktail{

    public LongDrink(String name, String flavour, String glass, List<Liquid> liquids) {
        super(name, flavour, glass, liquids);
    }

    /**
     * Creates a Cocktail object with given name from superclass {@link Cocktail}, e.g. Pina Colada, Mojito,
     * with the identified flavour, e.g. sour, sweet, creamy...,
     * with the type of glass, e.g. Balloon, Old Fashion...
     *
     * @param name              name of the drink
     * @param flavour           flavour of the cocktail
     * @param glass             type of glass of the cocktail
     * @param volume            volume of drink
     * @param alcoholPercent    alcohol percentage that contains the drink
     */


    /**
     * Contains the alcoholic ingredients
     *
     * @return String of alcoholic ingredients, if none is given, it has a default setup
     */
    public String ingredientsAlcohol() {
        return switch (name) {
            case "Basil Smash" -> "\n - alcoholic: Gin.";
            default -> "\n - alcoholic: The ingredients of the drink are unknown.";
        };
    }

    /**
     * Contains the non-alcoholic ingredients
     *
     * @return String of non-alcoholic ingredients, if none information given, it has a default setup
     */
    public String ingredientsNonAlcohol() {
        return switch (name) {
            case "Basil Smash" -> "\n - non-alcoholic: Lemon, sugar syrup, soda water and ice cubes.";
            default -> "\n - non-alcoholic: The ingredients of the drink are unknown.";
        };
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
                " served in a " + getGlass() + " glass "
                + "and has the following ingredients:" + ingredientsNonAlcohol() + ingredientsAlcohol()
                + "\nMostly it has a volume of " + getVolume()
                + " with an alcohol percentage of " + getAlcoholPercent() + ".";
    }
}