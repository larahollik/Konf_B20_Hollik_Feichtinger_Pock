package at.fhj.iit;

import java.util.Date;

/**
 * represents a simple drink liquid which can be used in drinks
 */
public class SimpleDrink extends Drink implements Article{

    /**
     * uses only one liquid
     */
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     */
    SimpleDrink(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Simple Drink called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }

    /**
     * calculates the price of a Simple Drink based on volume and alcoholPercent
     * per 1% alc costs 0.2€
     * per 1l vol costs 3€
     *
     * @return price of the article in form of a price
     */
    @Override
    public double calcPrice() {
        return (getVolume()*3.0) + (getAlcoholPercent()*0.2);
    }

    /**
     * adds the new sold SimpleDrink to a list of all sells
     *
     * @param day      day of the sell
     * @param seller   last name of the seller
     */
    @Override
    public void addArticle(String day, String seller) {
        CashRegister.getSells().add(new CashRegister(day, this, calcPrice(), seller));
    }

}
