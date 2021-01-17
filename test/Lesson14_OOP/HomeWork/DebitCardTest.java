package Lesson14_OOP.HomeWork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DebitCardTest {
    private DebitCard debitCard;
    private static final double BALANCE = 100.5;
    private static final double CASH1 = 50.5;
    private static final double CASH2 = 200;

    @Before
    public void setUp() throws Exception {
        debitCard = new DebitCard("Alex", BALANCE);
    }

    @After
    public void tearDown() throws Exception {
        debitCard = null;
    }

    @Test
    public void testGetCashFromCard() throws InsufficientFundsException {
        BigDecimal actual = debitCard.getCashFromCard(CASH1);
        BigDecimal expected = BigDecimal.valueOf(50.0);
        assertEquals(actual, expected);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testInsufficientFundsOnBalance() throws InsufficientFundsException {
        debitCard.getCashFromCard(CASH2);
    }
}