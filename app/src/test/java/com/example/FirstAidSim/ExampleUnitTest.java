package com.example.FirstAidSim;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void userCount_isEmpty( ){
        SystemDatabase sysBase = new SystemDatabase();
        assertEquals(0, sysBase.usersStored);
    }

    @Test
    public void userCount_notEmpty( ){
        SystemDatabase sysBase = new SystemDatabase();
        sysBase.createAccount("fn","ln,", 23, "un", "123");
        sysBase.createAccount("aa","bb,", 23, "cc", "12");
        assertEquals(2, sysBase.usersStored);
    }

    @Test
    public void dataBase_search_username( ){
        SystemDatabase sysBase = new SystemDatabase();
        sysBase.createAccount("fn","ln,", 23, "un", "123");
        sysBase.createAccount("aa","bb,", 23, "cc", "12");
        assertEquals(true, sysBase.usernameIsFound("un"));
    }

    @Test
    public void dataBase_password_isValid( ){
        SystemDatabase sysBase = new SystemDatabase();
        sysBase.createAccount("fn","ln,", 23, "un", "123");
        sysBase.createAccount("aa","bb,", 23, "cc", "12");
        assertEquals(true, sysBase.passwordValidation("un", "123"));
    }

    @Test
    public void dataBase_username_caseSensitivity( ){
        SystemDatabase sysBase = new SystemDatabase();
        sysBase.createAccount("first","last,", 23, "AbCdE", "123");
        assertEquals(true, sysBase.usernameIsFound("abcde"));
    }

    @Test
    public void dataBase_password_caseSensitivity( ){
        SystemDatabase sysBase = new SystemDatabase();
        sysBase.createAccount("first","last,", 23, "AbCdE", "PpPpp");
        assertEquals(false, sysBase.passwordValidation("abcde", "ppppp"));
    }
}