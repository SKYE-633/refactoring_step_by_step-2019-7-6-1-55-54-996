package com.tws.refactoring;

public class Police {

    public static final int limit = 18;

    public boolean checkDriver(Driver driver) {
        if(driver.age >= limit) return true;
        else return false;
    }


}

