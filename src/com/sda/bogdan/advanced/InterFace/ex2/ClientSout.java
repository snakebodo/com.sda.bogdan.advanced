package com.sda.bogdan.advanced.InterFace.ex2;

import java.time.LocalDateTime;

public class ClientSout implements DateTimeClient{


    @Override
    public void sendCurrentDateAndTime(LocalDateTime localDateTime) {
        System.out.println("Current date and time is : " + localDateTime);
    }
}
