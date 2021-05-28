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
public class Juice extends SimpleDrink implements Article{

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
     * @param sugarPercent  sugar content in percent
     * @param isDilutedWithWater juice can be diluted with water
     */

    Juice(String name, Liquid l, double sugarPercent, boolean isDilutedWithWater) {
        super(name,l);
        this.sugarPercent = sugarPercent;
        this.isDilutedWithWater = isDilutedWithWater;
    }

    /**
     * getter and setter for attributes of Juice
     */

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
        if(isAlcoholic()){
            return "The juice is a : "  + name + ", sugar content in percent: " + this.sugarPercent + ", \n" +
                    "is diluted with water: " + this.isDilutedWithWater + " and is alcoholic.";
        }
        return "The juice is a : "  + name + ", sugar content in percent: " + this.sugarPercent + ", \n" +
                "is diluted with water: " + this.isDilutedWithWater + " and is non-alcoholic.";
    }

    @Override
    public double calcPrice() {
        // pro 0,01 l kostet ein Saft 0.002
        // pro 1% kostet ein Saft 0.1€
        // wenn wasser dabei -> um die Hälfte billiger
        if (isDilutedWithWater){
            return ((getVolume()*0.002) + (getAlcoholPercent()*0.1))/2.0;
        }
        return (getVolume()*0.002) + (getAlcoholPercent()*0.1);
    }

}
