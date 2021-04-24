package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Contains test cases regarding the {@link Juice} class and its methods
 *
 * @author Daniela Pock
 * @version 2.0, 24.04.2021
 * @see Juice
 * @since v2.0
 */

public class JuiceTest {

    private Juice j;

    /**
     * Phase: setup for the upcoming tests
     */
    @BeforeEach
    void setup()
    {
        Liquid juice = new Liquid("applejuice", 0.50, 0.00);
        j = new Juice("applejuice", juice, "apple", 17.5,true);
    }

    /**
     * Phase: Exercise
     * Test for setsD
     */
    @Test
    @DisplayName("setsDTest")
    void setsDTest(){
        Liquid l = new Liquid("liquid2", 0.7, 0.0);
        SimpleDrink sd = new SimpleDrink("liquid2", l);
        j.setsD(sd);
        // Phase: Verify
        assertSame(sd, j.getsD());
    }

    /**
     * Phase: Exercise
     * Test for getMainIngredient
     */
    @Test
    @DisplayName("getMainIngredientTest")
    void getMainIngredientTest(){
        // Phase: Verify
        assertEquals("apple", j.getMainIngredient());
    }

    /**
     * Phase: Exercise
     * Test for setMainIngredient
     */
    @Test
    @DisplayName("setMainIngredientTest")
    void setMainIngredientTest(){
        j.setMainIngredient("orange");
        // Phase: Verify
        assertEquals("orange", j.getMainIngredient());
    }

    /**
     * Phase: Exercise
     * Test for getSugarPercent
     */
    @Test
    @DisplayName("getSugarPercentTest")
    void getSugarPercentTest(){
        // Phase: Verify
        assertEquals(17.5, j.getSugarPercent());
    }

    /**
     * Phase: Exercise
     * Test for setSugarPercent
     */
    @Test
    @DisplayName("setSugarPercentTest")
    void setSugarPercentTest(){
        j.setSugarPercent(12.6);
        // Phase: Verify
        assertEquals(12.6, j.getSugarPercent());
    }

    /**
     * Phase: Exercise
     * Test for getIsDilutedWithWater
     */
    @Test
    @DisplayName("getIsDilutedWithWaterTest")
    void getIsDilutedWithWaterTest(){
        // Phase: Verify
        assertEquals(true, j.getIsDilutedWithWater());
    }

    /**
     * Phase: Exercise
     * Test for setIsDilutedWithWater
     */
    @Test
    @DisplayName("setIsDilutedWithWaterTest")
    void setIsDilutedWithWaterTest(){
        j.setIsDilutedWithWater(false);
        // Phase: Verify
        assertEquals(false, j.getIsDilutedWithWater());
    }

    /**
     * Phase: Exercise
     * Test for informationToString
     */
    @Test
    @DisplayName("informationToStringTest")
    void informationToStringTest(){
        // Phase: Verify
        assertEquals("The main ingredient of the juice is: apple, sugar content in percent: 17.5%, is diluted with water: true",
                j.informationToString(j));
    }

}


