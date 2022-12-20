package com.sda.bogdan.advanced.inheritance.ex4;

public enum WeekDays {
    MONDAY(true, "Moday"),
    TUESDAY(true, "Tuesday"),
    WEDNESDAY(true, "Wednesday"),
    THURSDAY(true, "Thursday"),
    FRIDAY(true, "Friday"),
    SATURDAY(false, "Saturday"),
    SUNDAY(false, "Sunday");
    private final String day;

    private final boolean isWeekday;


    WeekDays(boolean isWeekday,String day){

        this.isWeekday = isWeekday;
        this.day=day;

    }

    public boolean isWeekday() {
        return isWeekday;

    }

    public boolean isHoliday() {
        return !isWeekday;
    }

    @Override
    public String toString() {
        return "weekdays{" +
                "isWeekday=" + isWeekday + day+
                '}';
    }
}
