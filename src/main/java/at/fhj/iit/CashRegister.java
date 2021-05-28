package at.fhj.iit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CashRegister {
    private int articleNr = 0;
    private Drink drink;
    private double price;
    private String seller;
    private Date day;

    private static List<CashRegister> sells = new ArrayList<CashRegister>();

    /**
     *
     * @param day     day of a sell
     * @param drink   sold Drink
     * @param price   price of the drink
     * @param seller  seller of the drink
     */
    public CashRegister(Date day, Drink drink, double price, String seller) {
        this.articleNr++;
        this.day = day;
        this.drink = drink;
        this.price = price;
        this.seller = seller;
    }

    /**
     *
     * Getters and setters of attributes of CashRegister
     */

    public int getArticleNr() {
        return articleNr;
    }

    public void setArticleNr(int articleNr) {
        this.articleNr = articleNr;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<CashRegister> getSells() {
        return sells;
    }

    public static void setSells(List<CashRegister> sells) {
        CashRegister.sells = sells;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    // Report methods
    /**
     * calculates the sum of sales of all non alcoholic sold drinks
     *
     * @return sum of sales of non alcoholic drinks
     */
    public static double salesNonAlc(){
        double sales = 0;
        for(int i = 0; i< sells.size(); i++){
            if(!sells.get(i).getDrink().isAlcoholic()){
                sales += sells.get(i).getPrice();
            }
        }
        return sales;
    }


    /**
     * calculates the sum of sales of all mild alcoholic sold drinks
     * mild means alcPercent <= 16%
     *
     * @return sum of sales of mild alcoholic drinks
     */
    public static double salesMildAlc(){
        double sales = 0;
        for (int i = 0; i< sells.size(); i++){
            if(sells.get(i).getDrink().getAlcoholPercent() <= 16){
                sales += sells.get(i).getPrice();
            }
        }
        return sales;
    }

    /**
     * calculates the sum of sales of all strong alcoholic sold drinks
     * mild means alcPercent > 16%
     *
     * @return sum of sales of strong alcoholic drinks
     */
    public static double salesStrongAlc(){
        double sales = 0;
        for (int i = 0; i < sells.size(); i++){
            if(sells.get(i).getDrink().getAlcoholPercent() > 16){
                sales += sells.get(i).getPrice();
            }
        }
        return sales;
    }

    /**
     * calculates the sum of sales of a certain day
     *
     * @return sum of sales on a certain day
     */
    public static double salesOnDay(Date day){
        double sales = 0;
        for (int i = 0; i< sells.size(); i++){
            if(sells.get(i).getDay() == day){
                sales += sells.get(i).getPrice();
            }
        }
        return sales;
    }

    /**
     * calculates the sum of all sales of a certain seller
     *
     * @param seller   last name of the seller
     * @return         sum of sales of a certain seller
     */
    public static double salesOfSeller(String seller){
        double sales = 0;
        for (int i = 0; i< sells.size(); i++){
            if(sells.get(i).getSeller().equals(seller)){
                sales += sells.get(i).getPrice();
            }
        }
        return sales;
    }

    /**
     * calculates the sum of all sales of a certain seller on a certain day
     *
     * @param day      day of the sells
     * @param seller   last name of the seller
     * @return         sum of sales on a certain day of a certain seller
     */
    public static double salesOfPersonOnDay(Date day, String seller){
        double sales = 0;
        for (int i = 0; i< sells.size(); i++){
            if(sells.get(i).getDay() == day && sells.get(i).getSeller().equals(seller)){
                sales += sells.get(i).getPrice();
            }
        }
        return sales;
    }
}
