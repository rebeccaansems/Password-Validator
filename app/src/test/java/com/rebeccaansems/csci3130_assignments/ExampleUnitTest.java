package com.rebeccaansems.csci3130_assignments;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void passwordIsPassword(){
        assertEquals(MainActivity.passwordValidator(("password")), false);
    }

    @Test
    public void passwordIsShort(){
        assertEquals(MainActivity.passwordValidator(("pass")), false);
    }

    @Test
    public void passwordIsGood(){
        assertEquals(MainActivity.passwordValidator(("ThisIsGoodPassword")), true);
    }
}