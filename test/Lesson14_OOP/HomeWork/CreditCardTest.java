package Lesson14_OOP.HomeWork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CreditCardTest {
    private CreditCard creditCard;
    private static final double MONEY = 100.5;
    private static final double CURRENCY = 2.6;
    private static final double CASH = 200.5;

    @Before
    public void setUp() throws Exception {
        creditCard = new CreditCard("Alex", 100.5);
    }

    @After
    public void tearDown() throws Exception {
        creditCard = null;
    }

    @Test
    public void testAddMoneyToCard() {
        BigDecimal actual = creditCard.addMoneyToCard(MONEY);
        BigDecimal expected = BigDecimal.valueOf(201.0);
        assertEquals(actual, expected);
    }

    @Test
    public void testGetBalanceInAnotherCurrency() {
        BigDecimal actual = creditCard.getBalanceInAnotherCurrency(CURRENCY);
        BigDecimal expected = BigDecimal.valueOf(38.65385);
        assertEquals(actual, expected);
    }

    @Test
    public void getCashFromCard() {
        BigDecimal actual = creditCard.getCashFromCard(CASH);
        BigDecimal expected = BigDecimal.valueOf(-100.0);
        assertEquals(actual, expected);
    }
}