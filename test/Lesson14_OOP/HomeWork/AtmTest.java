package Lesson14_OOP.HomeWork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AtmTest {
    private Atm atm1;
    private Atm atm2;
    private CreditCard creditCard = new CreditCard("Nik", 100.5);
    private DebitCard debitCard = new DebitCard("Mike", 100.5);


    @Before
    public void setUp() throws Exception {
        atm1 = new Atm(creditCard);
        atm2 = new Atm(debitCard);
    }

    @After
    public void tearDown() throws Exception {
        atm1 = null;
        atm2 = null;
    }

    @Test
    public void testGetCash() {
        //actual = atm1.getCash(100.5);
    }

    @Test
    public void testAddMoney() {
    }
}