package com.sda.bogdan.advanced.InterFace.ex2;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class ClientSerr implements DateTimeClient{
    @Override
    public void sendCurrentDateAndTime(LocalDateTime localDateTime) {
        System.err.println("Current date and time is : " + localDateTime);
    }
}
