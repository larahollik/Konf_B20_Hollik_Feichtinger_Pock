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

    private CashRegister sell1 = new CashRegister("Tuesday", drinkGinTonic, 11.0, "Marie");
    private CashRegister sell2 = new CashRegister("Saturday", drinkTonicOnly, 5.0, "Herbert");

    @BeforeEach
    void setUp() {
        Liquid gin = new Liquid("gin", 0.2, 45);
        liqGinTonic.add(gin);
        Liquid tonic = new Liquid("tonic", 0.3, 0.00);
        liqGinTonic.add(tonic);
        liqTonicWater.add(tonic);

        cash = new CashRegister("Monday", drinkGinTonic, 10.0, "Franz");

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
        assertEquals("Monday", cash.getDay());
    }

    @Test
    void setDay() {
        cash.setDay("Friday");
        assertEquals("Friday", cash.getDay());
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
        CashRegister sell3 = new CashRegister("Monday", drinkTonicOnly, 5.0, "Lara");
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
    }

    @Test
    void setDrink() {
    }

    @Test
    void getSeller() {
    }

    @Test
    void setSeller() {
    }

    @Test
    void salesNonAlc() {
    }

    @Test
    void salesMildAlc() {
    }

    @Test
    void salesStrongAlc() {
    }

    @Test
    void salesOnDay() {
    }

    @Test
    void salesOfSeller() {
    }

    @Test
    void salesOfPersonOnDay() {
    }
}
