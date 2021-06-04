package at.fhj.iit;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Contains test cases regarding the {@link Cocktail} class and its methods
 *
 * @author Lara Hollik, Daniela Pock
 * @version 3.0, 04.06.2021
 * @see Cocktail
 * @since v2.0
 */

@DisplayName("Testing new methods in Cocktail")
public class CocktailTest {
    private Cocktail cocktail;

    @BeforeEach
    void setup() {
        List<Liquid> liquids = new ArrayList<Liquid>();
        Liquid gin = new Liquid("gin", 0.2, 45);
        liquids.add(gin);
        Liquid tonic = new Liquid("tonic", 0.3, 0.00);
        liquids.add(tonic);

        cocktail = new Cocktail("Gin Tonic", "sour", "Old Fashioned", liquids, Cocktail.CocktailType.Shortdrink);
        cocktail.addDecoration("lemon");
    }

    @Test
    @DisplayName("Testing cocktail.addArticle(String day, String seller)")
    void cocktailAddArticle(){
        cocktail.addArticle("18.05.2021", "Feichtinger");
        MatcherAssert.assertThat(CashRegister.getSells(), contains(
                hasProperty("drink", is(cocktail))
        ));
    }


    @Test
    @DisplayName("Testing cocktail.calcPrice()")
    void cocktailCalcPrice(){
        assertEquals(8.6, cocktail.calcPrice());
    }

    @AfterEach
    void backToStart(){
        CashRegister.setSells(new ArrayList<CashRegister>());
    }



//    @Test
//    @DisplayName("Testing getFlavour method")
//    void getFlavourTest() {
//        assertEquals("creamy", cocktail.getFlavour());
//    }
//
//    @Test
//    @DisplayName("Testing setFlavour method")
//    void setFlavourTest() {
//        cocktail.setFlavour("spicy");
//        assertEquals("spicy", cocktail.getFlavour());
//    }
//
//    @Test
//    @DisplayName("Testing getGlass method")
//    void getGlassTest() {
//        assertEquals("Hurricane", cocktail.getGlass());
//    }
//
//    @Test
//    @DisplayName("Testing setGlass method")
//    void setGlassTest() {
//        cocktail.setGlass("Hurricane");
//        assertEquals("Hurricane", cocktail.getGlass());
//    }
//
//    @Test
//    @DisplayName("Testing getCocktailType and setCocktailType method")
//    void getAndSetCocktailTypeTest() {
//        Cocktail.CocktailType[] cockenums = Cocktail.CocktailType.values();
//
//        for (Cocktail.CocktailType type : cockenums) {
//            cocktail.setCocktailType(type);
//            assertEquals(type, cocktail.getCocktailType());
//        }
//    }
//
//    @Test
//    @DisplayName("Testing getVolume method")
//    void getVolumeTest() {
//        assertEquals(0.300, cocktail.getVolume());
//    }
//
//    @Test
//    @DisplayName("Testing setVolume method")
//    void setVolumeTest() {
//        cocktail.setVolume(0.300);
//        assertEquals(0.300, cocktail.getVolume());
//    }
//
//    @Test
//    @DisplayName("Testing getAlcoholPercent method")
//    void getAlcoholPercentTest() {
//        assertEquals(28.0, cocktail.getAlcoholPercent());
//    }
//
//    @Test
//    @DisplayName("Testing setAlcoholPercent method")
//    void setAlcoholPercentTest() {
//        cocktail.setAlcoholPercent(28.0);
//        assertEquals(28.0, cocktail.getAlcoholPercent());
//    }
//
//    @Test
//    @DisplayName("Testing isAlcoholic method")
//    void isAlcoholicTest() {
//        cocktail.setAlcoholPercent(1.0);
//        assertTrue(cocktail.isAlcoholic());
//
//        cocktail.setAlcoholPercent(0.0);
//        assertFalse(cocktail.isAlcoholic());
//
//        cocktail.setAlcoholPercent(-1.0);
//        assertFalse(cocktail.isAlcoholic());
//    }
//
//    @Test
//    @DisplayName("Testing addDecoration and getAllDecorations method")
//    void addDecorationAndGetAllDecorationsTest() {
//        cocktail.addDecoration("pineapple");
//        assertEquals("pineapple", cocktail.getAllDecorations());
//
//        cocktail.addDecoration("watermelon");
//        assertEquals("pineapple, watermelon", cocktail.getAllDecorations());
//    }
//
//    @Test
//    @DisplayName("Testing printTastingFlavourMessage")
//    void printFlavourMessageTest() {
//        List<String> flavourList = Arrays.asList("sweet", "bitter", "fruity", "sour", "creamy", "salty");
//        for (String item : flavourList) {
//            switch (item) {
//                case "sweet":
//                    cocktail.setFlavour(item);
//                    assertEquals("This Cocktail tastes sweet!", cocktail.printTastingFlavourMessage());
//                    break;
//
//                case "bitter":
//                    cocktail.setFlavour(item);
//                    assertEquals("This Cocktail tastes bitter!", cocktail.printTastingFlavourMessage());
//                    break;
//
//                case "fruity":
//                    cocktail.setFlavour(item);
//                    assertEquals("This Cocktail tastes fruity!", cocktail.printTastingFlavourMessage());
//                    break;
//
//                case "sour":
//                    cocktail.setFlavour(item);
//                    assertEquals("This Cocktail tastes sour!", cocktail.printTastingFlavourMessage());
//                    break;
//
//                case "creamy":
//                    cocktail.setFlavour(item);
//                    assertEquals("This Cocktail tastes creamy!", cocktail.printTastingFlavourMessage());
//                    break;
//
//                default:
//                    cocktail.setFlavour(item);
//                    assertEquals("You must enter a valid flavour!", cocktail.printTastingFlavourMessage());
//                    break;
//            }
//        }
//    }
//
//    @Test
//    @DisplayName("Testing printGlassTypeMessage")
//    void printGlassTypeMessageTest() {
//        List<String> glassList = Arrays.asList("Balloon", "Highball", "Hurricane", "Martini", "Old Fashioned", "Creamer", "Cage");
//        for (String item : glassList) {
//            switch (item) {
//                case "Balloon":
//                    cocktail.setGlass(item);
//                    assertEquals("This is a Balloon glass.", cocktail.printGlassTypeMessage());
//                    break;
//
//                case "Highball":
//                    cocktail.setGlass(item);
//                    assertEquals("This is a Highball glass.", cocktail.printGlassTypeMessage());
//                    break;
//
//                case "Hurricane":
//                    cocktail.setGlass(item);
//                    assertEquals("This is a Hurricane glass.", cocktail.printGlassTypeMessage());
//                    break;
//
//                case "Martini":
//                    cocktail.setGlass(item);
//                    assertEquals("This is a Martini glass.", cocktail.printGlassTypeMessage());
//                    break;
//
//                case "Old Fashioned":
//                    cocktail.setGlass(item);
//                    assertEquals("This is a Old Fashioned glass.", cocktail.printGlassTypeMessage());
//                    break;
//
//                case "Creamer":
//                    cocktail.setGlass(item);
//                    assertEquals("This is a Creamer glass.", cocktail.printGlassTypeMessage());
//                    break;
//
//                default:
//                    cocktail.setGlass(item);
//                    assertEquals("You must enter a valid glass type!", cocktail.printGlassTypeMessage());
//                    break;
//            }
//        }
//    }
//
//    @Test
//    @DisplayName("Testing printCocktailMessage method")
//    void printCocktailMessageTest() {
//        cocktail.setCocktailType(Cocktail.CocktailType.Dessert_Cocktail);
//        cocktail.addDecoration("pineapple");
//        assertEquals("A creamy Dessert_Cocktail called Pina Colada with 28.0 percent alcohol by volume, 0.3 liter of volume and served in a Hurricane glass decorated with a pineapple", cocktail.printCocktailMessage());
}







