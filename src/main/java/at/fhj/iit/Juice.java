/**
 * subclass juice of superclass SimpleDrink
 * represents a Juice
 * Author: Daniela Pock
 * last Change: 14.03.2021
 */

package at.fhj.iit;
/**
 * represents a non-alcoholic SimpleDrink liquid Juice which can be used in drinks
 */
public class Juice extends SimpleDrink {

    /**
     * is made of one simple Drink and may be diluted with water
     */
    protected SimpleDrink sD;

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
     *  @param name name of drink
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
        l.setAlcoholPercent(0);
    }

    /**
     * getter and setter for attributes of Juice
     */

    public SimpleDrink getsD() {
        return sD;
    }

    public void setsD(SimpleDrink sD) {
        this.sD = sD;
    }

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

    /**
     * returns the information about an object juice as string
     *
     * @param j object juice
     * @return info as string
     */
    public static String informationToString(Juice j){
        return "Main ingredient: " + j.mainIngredient + ", sugar content in percent: " + j.sugarPercent + ", is diluted with water: " + j.isDilutedWithWater;
    }
}
