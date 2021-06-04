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
 * Contains test cases regarding the {@link LongDrink} class and its methods
 *
 * @author Viktoria Feichtinger, Daniela Pock
 * @version 3.0, 04.06.2021
 * @see LongDrink
 * @since v2.0
 */
@DisplayName("Testing new methods in LongDrink")
public class LongDrinkTest {

    private LongDrink longDrink;

    /**
     * Phase: Setup for upcoming tests
     */
    @BeforeEach
    void setup() {
        List<Liquid> liquids2 = new ArrayList<Liquid>();
        Liquid vodka = new Liquid("vodka", 0.1, 40);
        liquids2.add(vodka);
        Liquid orangeJuice = new Liquid("orange juice", 0.3, 0.00);
        liquids2.add(orangeJuice);
        longDrink = new LongDrink("Vodka Orange", "sweet", liquids2 );
    }

    @Test
    @DisplayName("Testing longDrink.addArticle(String day, String seller)")
    void longDrinkAddArticle(){
        longDrink.addArticle("18.05.2021", "Feichtinger");
        MatcherAssert.assertThat(CashRegister.getSells(), contains(
                hasProperty("drink", is(longDrink))
        ));
    }

    @Test
    @DisplayName("Testing longDrink.calcPrice()")
    void longDrinkCalcPrice(){
        assertEquals(6.634, longDrink.calcPrice());
    }

    @AfterEach
    void backToStart(){
        CashRegister.setSells(new ArrayList<CashRegister>());
    }


//    /**
//     * Phase: Exercise
//     * Test for ingredientsAlcohol method
//     */
//    @Test
//    @DisplayName("Testing ingredientsAlcohol method")
//    void ingredientsAlcoholTest() {
//        // Phase: Verify
//        assertEquals("\n - alcoholic: Gin.", longDrink.ingredientsAlcohol());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for ingredientsNonAlcohol method
//     */
//    @Test
//    @DisplayName("Testing ingredientsNonAlcohol method")
//    void ingredientsNonAlcoholTest() {
//        // Phase: Verify
//        assertEquals("\n - non-alcoholic: Lemon, sugar syrup, soda water and ice cubes.", longDrink.ingredientsNonAlcohol());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for toString method
//     */
//    @Test
//    @DisplayName("Testing toString method")
//    void toStringTest() {
//        // Phase: Verify
//        assertEquals("Basil Smash is a sour Longdrink served in a Hurricane glass and has the following ingredients:" +
//                "\n - non-alcoholic: Lemon, sugar syrup, soda water and ice cubes." +
//                "\n - alcoholic: Gin." +
//                "\nMostly it has a volume of 0.33 with an alcohol percentage of 12.0.", longDrink.toString());
//    }
}