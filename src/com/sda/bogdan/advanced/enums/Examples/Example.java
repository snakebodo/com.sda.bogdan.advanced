package com.sda.bogdan.advanced.enums.Examples;

public enum Example {

    SHOW_DATE(1, "Show date"),
    SHOW_TIME(2, "Show time");

    private final int option;
    private final String displayValue;

    Example(int option, String displayValue) {
        this.option = option;
        this.displayValue = displayValue;
    }

    public int getOption() {
        return option;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}