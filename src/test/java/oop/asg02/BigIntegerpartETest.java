package oop.asg02;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 15/07/2014
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public class BigIntegerpartETest {
    @Test
    public void testcompareTo()
    {
        BigInteger bigInt1 = new BigInteger("11111111111111111111")   ;
        BigInteger bigInt2 = new BigInteger("0011111111111111111111")    ;
        int compare = bigInt1.compareTo(bigInt2);
        assertEquals(0,compare)    ;
    }

    @Test
    public void testCompare() {
        BigInteger n1=new BigInteger("111111111111111111111");
        BigInteger n2=new BigInteger("111111111111111111112");
        BigInteger n3=new BigInteger("111111111111111111111");
        BigInteger n4=new BigInteger("111111111111111111110");
        int a=n1.compareTo(n2);
        int b=n1.compareTo(n3);
        int c=n1.compareTo(n4);
        assertEquals(-1,a);
        assertEquals(0,b);
        assertEquals(1,c);
    }

    @Test
    public void testClone () {
        BigInteger bigInt1 = new BigInteger ("111112461111122111111");
        BigInteger bigInt2 = bigInt1.clone();
        assertNotSame (bigInt1, bigInt2);
        assertEquals (bigInt1, bigInt2);
    }

    @Test
    public void testClone2 () {
        BigInteger bigInt1 = new BigInteger (1234567890);
        BigInteger bigInt2 = bigInt1.clone();
        assertNotSame (bigInt1, bigInt2);
        assertEquals (bigInt1, bigInt2);
    }

    @Test
    public void testCompareTo_DifferentLength_Bigger () {
        BigInteger bigInt1 = new BigInteger ("1884638881");
        BigInteger bigInt2 = new BigInteger ("16674657445636");

        assertEquals (1, bigInt2.compareTo (bigInt1));
    }

    @Test
    public void testCompareTo_DifferentLength_Smaller () {
        BigInteger bigInt1 = new BigInteger ("1884638881");
        BigInteger bigInt2 = new BigInteger ("16674657445636");

        assertEquals (-1, bigInt1.compareTo (bigInt2));
    }

    @Test
    public void testCompareTo_SameLength () {
        BigInteger bigInt1 = new BigInteger ("1884638881");
        BigInteger bigInt2 = new BigInteger ("4667465744");

        assertEquals (-1, bigInt1.compareTo (bigInt2));
        assertEquals (1, bigInt2.compareTo (bigInt1));
    }

    @Test
    public void testCompareTo_Equal () {
        BigInteger bigInt1 = new BigInteger ("12345678901234567890");
        BigInteger bigInt2 = new BigInteger ("12345678901234567890");

        assertEquals (0, bigInt1.compareTo (bigInt2));
        assertEquals (0, bigInt2.compareTo (bigInt1));
    }
}

