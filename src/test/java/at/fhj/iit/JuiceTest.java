//package at.fhj.iit;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * Contains test cases regarding the {@link Juice} class and its methods
// *
// * @author Daniela Pock
// * @version 2.0, 17.05.2021
// * @see Juice
// * @since v2.0
// */
//
//public class JuiceTest {
//
//    private Juice j;
//
//    /**
//     * Phase: setup for the upcoming tests
//     */
//    @BeforeEach
//    void setup()
//    {
//        Liquid juice = new Liquid("applejuice", 0.25, 2.00);
//        j = new Juice("applejuice", juice,  17.5,false);
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for getSugarPercent
//     */
//    @Test
//    @DisplayName("getSugarPercentTest")
//    void getSugarPercentTest(){
//        // Phase: Verify
//        assertEquals(17.5, j.getSugarPercent());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for setSugarPercent
//     */
//    @Test
//    @DisplayName("setSugarPercentTest")
//    void setSugarPercentTest(){
//        j.setSugarPercent(12.6);
//        // Phase: Verify
//        assertEquals(12.6, j.getSugarPercent());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for getIsDilutedWithWater
//     */
//    @Test
//    @DisplayName("getIsDilutedWithWaterTest")
//    void getIsDilutedWithWaterTest(){
//        // Phase: Verify
//        assertFalse(j.getIsDilutedWithWater());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for setIsDilutedWithWater
//     */
//    @Test
//    @DisplayName("setIsDilutedWithWaterTest")
//    void setIsDilutedWithWaterTest(){
//        j.setIsDilutedWithWater(false);
//        // Phase: Verify
//        assertFalse(j.getIsDilutedWithWater());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for informationToString
//     */
//    @Test
//    @DisplayName("informationToStringTest")
//    void informationToStringTest(){
//        // Phase: Verify
//
//        assertEquals("The juice is a applejuice, sugar content in percent: 17.5%, \nis diluted with water: false and is alcoholic.",
//                j.informationToString());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test 1 for getVolume() of Juice
//     * for Juice not Diluted with Water
//     */
//    @Test
//    @DisplayName("getVolume() of Juice ifNotDilutedWithWater Test")
//    void getVolumeOfJuiceTestNotDiluted(){
//        // Phase: Verify
//        assertEquals(0.25, j.getVolume());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test 2 for getVolume() of Juice
//     * for Juice diluted with water
//     */
//    @Test
//    @DisplayName("getVolume() of Juice ifDilutedWithWater Test")
//    void getVolumeOfJuiceTestDiluted(){
//        j.setIsDilutedWithWater(true);
//        // Phase: Verify
//        assertEquals(0.5, j.getVolume());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for isAlcoholic() of Juice
//     * for nonAlcoholic Juice
//     */
//    @Test
//    @DisplayName("isAlcoholic() of Juice NonAlcoholic Test")
//    void isAlcoholicOfJuiceNonAlcoholicTest(){
//        // create Juice with 0 alcoholPercent
//        Liquid juice2 = new Liquid("orangejuice", 0.25, 0.00);
//        j = new Juice("orangejuice", juice2, 20.0, true);
//        // Phase: Verify
//        assertFalse(j.isAlcoholic());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for isAlcoholic() of Juice
//     * for Alcoholic Juice
//     */
//    @Test
//    @DisplayName("isAlcoholic() of Juice Alcoholic Test")
//    void isAlcoholicOfJuiceAlcoholicTest(){
//        // Phase: Verify
//        assertTrue(j.isAlcoholic());
//    }
//
//
//    /**
//     * Phase: Exercise
//     * Test for getAlcoholPercent() of Juice
//     * if not diluted with water
//     */
//    @Test
//    @DisplayName("getAlcoholPercent() of Juice Not Diluted Test")
//    void getAlcoholPercentOfJuiceNotDilutedTest(){
//        // Phase: Verify
//        assertEquals(2.00, j.getAlcoholPercent());
//    }
//
//    /**
//     * Phase: Exercise
//     * Test for getAlcoholPercent() of Juice
//     * if diluted with water
//     */
//    @Test
//    @DisplayName("getAlcoholPercent() of Juice Diluted Test")
//    void getAlcoholPercentOfJuiceDilutedTest(){
//        j.setIsDilutedWithWater(true);
//        // Phase: Verify
//        assertEquals(1.00, j.getAlcoholPercent());
//    }
//}
//
//
//
