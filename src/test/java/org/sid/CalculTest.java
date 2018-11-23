package org.sid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculTest {

    private Calcul calcul;

    @Before
    public void setUp() throws Exception {
        calcul=new Calcul();
    }

    @Test
    public void produitTest() {
        double a=8;
        double b=7;
        double expected=56;
        double result=calcul.produit(a,b);
        Assert.assertTrue(expected==result);

    }
}