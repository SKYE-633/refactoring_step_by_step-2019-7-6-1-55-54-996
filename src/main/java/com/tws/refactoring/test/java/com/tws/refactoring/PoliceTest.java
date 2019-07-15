package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {
    @Test
    public void should_return_false_when_age_is_18(){
        //given
        Police police = new Police();
        Driver driver = new Driver(18);
        //when
        Boolean result=police.checkDriver(driver);
        //then
        assertTrue(result);
    }

}