package com.sda.bogdan.advanced.InterFace.ex1;

public class Text implements Graphics{
    private String value;


    public Text(String value){
        this.value = value;
    }

    public void draw(){
        System.out.println(value);
    }
}
