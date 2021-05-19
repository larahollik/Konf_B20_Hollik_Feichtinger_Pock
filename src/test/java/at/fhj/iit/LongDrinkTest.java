//package at.fhj.iit;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * Contains test cases regarding the {@link LongDrink} class and its methods
// *
// * @author Viktoria Feichtinger
// * @version 2.0, 20.04.2021
// * @see LongDrink
// * @since v2.0
// */
//@DisplayName("Testing LongDrink implementation")
//public class LongDrinkTest {
//
//    private LongDrink longDrink;
//
//    /**
//     * Phase: Setup for upcoming tests
//     */
//    @BeforeEach
//    void setup() {
//        longDrink = new LongDrink("Basil Smash", "sour", "Hurricane", 0.33,12.0);
//    }
//
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
//}