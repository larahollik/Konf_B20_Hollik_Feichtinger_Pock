package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing LongDrink implementation")
public class LongDrinkTest {
    private LongDrink longDrink;

    /**
     * inits calculator with CalculatorImpl for each test
     */
    @BeforeEach
    void setup() {
        longDrink = new LongDrink("Basil Smash", "sour", "Hurricane", 0.33,12.0);
    }

    @Test
    @DisplayName("Testing ingredientsAlcohol method")
    void ingredientsAlcoholTest() {
        assertEquals("\n - alcoholic: Gin.", longDrink.ingredientsAlcohol());
    }

    @Test
    @DisplayName("Testing ingredientsNonAlcohol method")
    void ingredientsNonAlcoholTest() {
        assertEquals("\n - non-alcoholic: Lemon, sugar syrup, soda water and ice cubes.", longDrink.ingredientsNonAlcohol());
    }

    @Test
    @DisplayName("Testing toString method")
    void toStringTest() {
        assertEquals("Basil Smash is a sour Longdrink served in a Hurricane glass and has the following ingredients:" +
                "\n - non-alcoholic: Lemon, sugar syrup, soda water and ice cubes." +
                "\n - alcoholic: Gin." +
                "\nMostly it has a volume of 0.33 with an alcohol percentage of 12.0.", longDrink.toString());
    }
}
