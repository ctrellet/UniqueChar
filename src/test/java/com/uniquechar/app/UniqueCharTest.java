package com.uniquechar.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Unit test for UniqueChar.
 */
public class UniqueCharTest{

    public UniqueChar uc = new UniqueChar();

    @Test
    // String of unique chars
    public void uniqueCharsABCD() {
        //assert
        assertTrue(uc.isUniqueChar("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    // String of unique chars
    public void noUniqueCharsABAD() {
        //assert
        assertTrue(!uc.isUniqueChar("ABAD"));
    }
}
