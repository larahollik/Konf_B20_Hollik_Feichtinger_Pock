package at.fhj.iit;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.*;

public class CashRegisterTest {
    private CashRegister cash;
    private List<Liquid> liqGinTonic = new ArrayList<Liquid>();
    private List<Liquid> liqTonicWater = new ArrayList<Liquid>();
    private Cocktail drinkGinTonic = new Cocktail("Gin Tonic", "sour", "Old Fashioned",
            liqGinTonic, Cocktail.CocktailType.Shortdrink);
    private Cocktail drinkPina = new Cocktail("Pina Colada", "sour", "Old Fashioned",
            liqGinTonic, Cocktail.CocktailType.Shortdrink);
    private Cocktail drinkTonicOnly = new Cocktail("Tonic Water", "sour", "Old Fashioned",
            liqTonicWater, Cocktail.CocktailType.Shortdrink);

    private CashRegister sell1 = new CashRegister("22.04.2021", drinkGinTonic, 11.0, "Marie");
    private CashRegister sell2 = new CashRegister("19.02.2021", drinkTonicOnly, 5.0, "Herbert");

    @BeforeEach
    void setUp() {
        Liquid gin = new Liquid("gin", 0.2, 45);
        liqGinTonic.add(gin);
        Liquid tonic = new Liquid("tonic", 0.3, 0.00);
        liqGinTonic.add(tonic);
        liqTonicWater.add(tonic);

        cash = new CashRegister("12.02.2021", drinkGinTonic, 10.0, "Franz");

        List<CashRegister> sells = new ArrayList<CashRegister>();
        sells.add(sell1);
        sells.add(sell2);
        CashRegister.setSells(sells);
    }

    @Test
    void getArticleNr() {
        assertEquals(1, cash.getArticleNr());
    }


    @Test
    void setArticleNr() {
        cash.setArticleNr(2);
        assertEquals(2, cash.getArticleNr());
    }

    @Test
    void getDay() {
        assertEquals("12.02.2021", cash.getDay());
    }

    @Test
    void setDay() {
        cash.setDay("04.05.2021");
        assertEquals("04.05.2021", cash.getDay());
    }

    @Test
    void getPrice() {
        assertEquals(10.0, cash.getPrice());
    }

    @Test
    void setPrice() {
        cash.setPrice(15.0);
        assertEquals(15.0, cash.getPrice());
    }

    @Test
    void getSells() {
        MatcherAssert.assertThat(CashRegister.getSells(), contains(
                hasProperty("seller", is("Marie")),
                hasProperty("seller", is("Herbert"))
        ));
    }

    @Test
    void setSells() {
        List<CashRegister> sells = new ArrayList<CashRegister>();
        CashRegister sell3 = new CashRegister("12.02.2021", drinkTonicOnly, 5.0, "Lara");
        sells.add(sell1);
        sells.add(sell2);
        sells.add(sell3);
        CashRegister.setSells(sells);

        MatcherAssert.assertThat(CashRegister.getSells(), contains(
                hasProperty("seller", is("Marie")),
                hasProperty("seller", is("Herbert")),
                hasProperty("seller", is("Lara"))
        ));
    }

    @Test
    void getDrink() {
        assertEquals(drinkGinTonic, cash.getDrink());
    }

    @Test
    void setDrink() {
        cash.setDrink(drinkPina);
        assertEquals(drinkPina, cash.getDrink());
    }

    @Test
    void getSeller() {
        assertEquals("Franz", cash.getSeller());
    }

    @Test
    void setSeller() {
        cash.setSeller("Lara");
        assertEquals("Lara", cash.getSeller());
    }

    @Test
    void salesNonAlc() {
        assertEquals(5.0, CashRegister.salesNonAlc());
    }

    @Test
    void salesMildAlc() {
        assertEquals(0.0, CashRegister.salesMildAlc());
    }

    @Test
    void salesStrongAlc() {
        assertEquals(11.0, CashRegister.salesStrongAlc());
    }

    @Test
    void salesOnDay() {
        assertEquals(11.0, CashRegister.salesOnDay("22.04.2021"));
        assertEquals(0.0, CashRegister.salesOnDay("15.03.2021"));
    }

    @Test
    void salesOfSeller() {
        assertEquals(5.0, CashRegister.salesOfSeller("Herbert"));
        assertEquals(11.0, CashRegister.salesOfSeller("Marie"));
    }

    @Test
    void salesOfPersonOnDay() {
        assertEquals(5.0, CashRegister.salesOfPersonOnDay("19.02.2021", "Herbert"));
        assertEquals(0.0, CashRegister.salesOfPersonOnDay("22.04.2021", "Herbert"));
    }
}
