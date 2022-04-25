package com.company;

import java.time.LocalDateTime;

public class Holiday {
    int month;
    int day;
    String name;
    String description;
    boolean fedRecog;


    public Holiday(int month, int day, String name, String description, boolean fedRecog) {
        this.month = month;
        this.day = day;
        this.name = name;
        this.description = description;
        this.fedRecog = fedRecog;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public boolean isFedRecog() {
        return fedRecog;
    }

    public void setFedRecog(boolean fedRecog) {
        this.fedRecog = fedRecog;
    }
    public boolean isToday(){
        LocalDateTime now = LocalDateTime.now();
        now.getMonthValue();
        now.getDayOfMonth();
        return now.getMonthValue() == month && now.getDayOfMonth() == day;
    }
    public void celebrate(){
       System.out.println("Yay! Today is " + name);
    }
}

