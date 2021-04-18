package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Drink {
    /**
     * a enum of possible Cocktail types, so it's easier to classify the Cocktail.
     */
    public enum CocktailType {
        Shortdrink,
        Londrink,
        Sour,
        Tropical_Drink,
        Dessert_Cocktail,
        Aperitif,
        Alcoholfree_Drink;
    }
    /**
     * a list of possible Cocktail decorations, because each Cocktail type gets differently decorated.
     */
    private List<String> decorations = new ArrayList<String>();
    /**
     *volume of the Cocktail in liter.
     */
    private double volume;
    /**
     * alcoholPercent of the Cocktail (in percent eg. 28)
     */
    private double alcoholPercent;
    /**
     * flavour of the Cocktail, to identify the taste and giving a reference to the Cocktail type.
     */
    private String flavour;
    /**
     * type of the glass, because every Cocktail type is served in a different glass.
     */
    private String glass;
    /**
     * a cocktailType, so it's easier to classify the Cocktail.
     */
    private CocktailType cocktailType;

    /**
     * Creates a Cocktail object with given name from the superclass Drink, e.g. Pina Colada, Mojito,
     * with the identified flavour, e. g. sour, sweet, creamy...,
     * with the type of glass, e. g. Balloon, Old Fashioned...
     *
     * @param name          name of the drink
     * @param flavour       flavour of the Cocktail
     * @param glass         type of glass of the Cocktail
     */
    public Cocktail(String name, String flavour, String glass, double volume, double alcoholPercent) {
        super(name);
        this.flavour = flavour;
        this.glass = glass;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Getter for flavour
     * @return flavour of Cocktail
     */
    public String getFlavour() {
        return flavour;
    }

    /**
     * Setter for flavour
     * @param flavour new flavour
     */
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    /**
     * Getter for the type of glass
     * @return glass of Cocktail
     */
    public String getGlass() {
        return glass;
    }

    /**
     * Setter for glass
     * @param glass new glass
     */
    public void setGlass(String glass) {
        this.glass = glass;
    }

    /**
     * Getter for the cocktailType
     * @return cocktailType
     */
    public CocktailType getCocktailType() {
        return cocktailType;
    }

    /**
     * Setter for cocktailType
     * @param cocktailType new cocktailType
     */
    public void setCocktailType(CocktailType cocktailType) {
        this.cocktailType = cocktailType;
    }


    /**
     * Calculates and returns volume of drink
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return this.volume;
    }
    /**
     * Setter for volume
     * @param volume new volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Calculates and returns the alcohol percentage
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        return this.alcoholPercent;
    }
    /**
     * Setter for alcoholPercent
     * @param alcoholPercent new alcoholPercent
     */    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gives information if drink is alcoholic or not
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(alcoholPercent >0.0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds a deco-item to the decorations list.
     */
    public void addDecoration(String deco) {
        this.decorations.add(deco);
    }

    /**
     * Get all decoration-items in a single String.
     */
    public String getAllDecorations() {
        String result = "";

        for (String item : decorations) {
            result += (item + ",");
        }

        return result;
    }

    /**
     * Checks the flavour of a Cocktail and prints out the taste.
     */
    public void printTastingFlavour() {

        switch (flavour) {
            case "sweet":
                System.out.println("This Cocktail tastes sweet!");
                break;
            case "bitter":
                System.out.println("This Cocktail tastes bitter!");
                break;
            case "fruity":
                System.out.println("This Cocktail tastes fruity!");
                break;
            case "sour":
                System.out.println("This Cocktail tastes sour!");
                break;
            case "creamy":
                System.out.println("This Cocktail tastes creamy!");
                break;
            default:
                System.out.println("You must enter a valid flavour!");
                break;
        }

    }

    /**
     * Checks the glass type of a served Cocktail and prints the right one.
     */
    public void printGlassType() {

        switch (glass) {
            case "Balloon":
                System.out.println("This is a Balloon glass.");
                break;
            case "Highball":
                System.out.println("This is a Highball glass.");
                break;
            case "Hurricane":
                System.out.println("This is a Hurricane glass.");
                break;
            case "Martini":
                System.out.println("This is a Martini glass.");
                break;
            case "Old Fashioned":
                System.out.println("This is a Old Fashioned glass.");
                break;
            case "Creamer":
                System.out.println("This is a Creamer glass.");
            default:
                System.out.println("You must enter a valid glass type!");
                break;
        }

    }

    /**
     * Prints the message about the information of the current Cocktail.
     * @return String with the current Cocktail information about the flavour, the cocktailType, the name, the alcoholPercent,
     * the glass and the decoration.
     */
    public String printCocktailMessage() {
        return "A " + flavour +" "+ cocktailType + " called " + name + " with " + getAlcoholPercent() + " percent alcohol by volume, "+volume + " liter of volume and served in a " + glass + " glass " +
                "decorated with a " + getAllDecorations();
    }


}



