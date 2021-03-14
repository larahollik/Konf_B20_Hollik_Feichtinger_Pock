/**
 * LongDrink - subclass LongDrink of superclass Cocktail
 * represents a long dink
 * Author:      Viktoria Feichtinger
 * Last Change: 14.03.2021
 */

package at.fhj.iit;

public class LongDrink extends Cocktail {

    /**
     * Creates a Cocktail object with given name from the superclass Drink, e.g. Pina Colada, Mojito,
     * with the identified flavour, e. g. sour, sweet, creamy...,
     * with the type of glass, e. g. Balloon, Old Fashioned...
     *
     * @param name    name of the drink
     * @param flavour flavour of the Cocktail
     * @param glass   type of glass of the Cocktail
     */
    public LongDrink(String name, String flavour, String glass) {
        super(name, flavour, glass);
    }

    /**
     * @return alcoholic ingredients
     */
    public String ingredientsAlcohol() {
        return switch (name) {
            case "Basil Smash" -> "\n - alcoholic: Gin.";
            default -> "\n - alcoholic: The ingredients of the drink are unknown.";
        };
    }

    /**
     * @return non-alcoholic ingredients
     */
    public String ingredientsNonAlcohol() {
        return switch (name) {
            case "Basil Smash" -> "\n - alcoholic: Lemon, sugar syrup, soda water and ice cubes.";
            default -> "\n - alcoholic: The ingredients of the drink are unknown.";
        };
    }


    /**
     * classification of the CocktailType that are valid for all object from that class
     */
    private final CocktailType cocktailType = CocktailType.Londrink;

    public String toString() {
        return name + " is a " + getFlavour() + " " + cocktailType +
                " served in a " + getGlass() + " glass "
                + "and has the following ingredients: " + ingredientsNonAlcohol() + ingredientsAlcohol();
    }

}