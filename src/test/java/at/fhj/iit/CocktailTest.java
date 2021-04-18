package at.fhj.iit;

import at.fhj.iit.Cocktail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testing Cocktail implementation")
public class CocktailTest {
    private Cocktail cocktail;

    /**
     * inits Calculator with CalculatorImpl for EACH test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        cocktail = new Cocktail("Pina Colada", "creamy", "Hurricane", 0.300, 28.0);

    }

    @Test
    @DisplayName("Testing getFlavour method")
    void getFlavourTest() {
        assertEquals("creamy", cocktail.getFlavour());
    }

    @Test
    @DisplayName("Testing setFlavour method")
    void setFlavourTest() {
        cocktail.setFlavour("spicy");
        assertEquals("spicy", cocktail.getFlavour());
    }

    @Test
    @DisplayName("Testing getGlass method")
    void getGlassTest() {
        assertEquals("Hurricane", cocktail.getGlass());
    }

    @Test
    @DisplayName("Testing setGlass method")
    void setGlassTest() {
        cocktail.setGlass("Hurricane");
        assertEquals("Hurricane", cocktail.getGlass());
    }

    @Test
    @DisplayName("Testing getCocktailType and setCocktailType method")
    void getAndSetCocktailTypeTest() {
        Cocktail.CocktailType[] cockenums = Cocktail.CocktailType.values();

        for (Cocktail.CocktailType type : cockenums) {
            cocktail.setCocktailType(type);
            assertEquals(type, cocktail.getCocktailType());
        }

    }

    @Test
    @DisplayName("Testing getVolume method")
    void getVolumeTest() {
        assertEquals(0.300, cocktail.getVolume());
    }

    @Test
    @DisplayName("Testing setVolume method")
    void setVolumeTest() {
        cocktail.setVolume(0.300);
        assertEquals(0.300, cocktail.getVolume());
    }

    @Test
    @DisplayName("Testing getAlcoholPercent method")
    void getAlcoholPercentTest() {
        assertEquals(28.0, cocktail.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing setAlcoholPercent method")
    void setAlcoholPercentTest() {
        cocktail.setAlcoholPercent(28.0);
        assertEquals(28.0, cocktail.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing isAlcoholic method")
    void isAlcoholicTest() {
        cocktail.setAlcoholPercent(1.0);
        assertTrue(cocktail.isAlcoholic());

        cocktail.setAlcoholPercent(0.0);
        assertFalse(cocktail.isAlcoholic());

        cocktail.setAlcoholPercent(-1.0);
        assertFalse(cocktail.isAlcoholic());
    }

    @Test
    @DisplayName("Testing addDecoration and getAllDecorations method")
    void addDecorationAndGetAllDecorationsTest() {
        cocktail.addDecoration("pineapple");
        assertEquals("pineapple", cocktail.getAllDecorations());

        cocktail.addDecoration("watermelon");
        assertEquals("pineapple, watermelon", cocktail.getAllDecorations());
    }
}







