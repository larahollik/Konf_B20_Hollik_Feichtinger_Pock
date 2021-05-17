package at.fhj.iit;

/**
 * subclass juice of superclass SimpleDrink {@link at.fhj.iit.SimpleDrink}
 * represents a Juice
 *
 * @author: Daniela Pock
 * @version v2.0, 17.05.2021
 * @since v1.0
 */

/**
 * represents a non-alcoholic SimpleDrink liquid Juice which can be used in drinks
 */
public class Juice extends SimpleDrink {

    /**
     * main ingredient of the juice (e.g. a fruit, vegetable,...)
     */
    private String mainIngredient;

    /**
     * sugar content of the juice in percent
     */

    private double sugarPercent;

    /**
     * is diluted with water
     */
    private boolean isDilutedWithWater;

    /**
     * Creates a SimpleDrink object with given name and liquid
     * @param name name of drink
     * @param l    only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     * @param mainIngredient main ingredient of the juice
     * @param sugarPercent  sugar content in percent
     * @param isDilutedWithWater juice can be diluted with water
     */

    Juice(String name, Liquid l, String mainIngredient, double sugarPercent, boolean isDilutedWithWater) {
        super(name,l);
        this.mainIngredient = mainIngredient;
        this.sugarPercent = sugarPercent;
        this.isDilutedWithWater = isDilutedWithWater;
    }

    /**
     * getter and setter for attributes of Juice
     */

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public double getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(double sugarPercent) {
        this.sugarPercent = sugarPercent;
    }

    public boolean getIsDilutedWithWater() {
        return isDilutedWithWater;
    }

    public void setIsDilutedWithWater(boolean isDilutedWithWater) {
        this.isDilutedWithWater = isDilutedWithWater;
    }

    @Override
    public double getVolume() {
        if (this.isDilutedWithWater){
            return super.getVolume() * 2;
        } else {
            return super.getVolume();
        }
    }

    @Override
    public boolean isAlcoholic() {
        return super.isAlcoholic();
    }

    @Override
    public double getAlcoholPercent() {
        if (this.isDilutedWithWater ){
            return Math.round(super.getAlcoholPercent() * 100.0 / 2) /100.0;
        } else{
            return super.getAlcoholPercent();
        }
    }

    /**
     * returns the information about an object juice as string
     * @return info as string
     */
    public String informationToString(){
        return "The main ingredient of the juice is: " + this.mainIngredient + ", sugar content in percent: " + this.sugarPercent + "%, is diluted with water: " + this.isDilutedWithWater;
    }
}
