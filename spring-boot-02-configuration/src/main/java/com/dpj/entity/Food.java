package com.dpj.entity;

public class Food {

    private String rice;
    private String meat;

    public Food() {
    }

    public Food(String rice, String meat) {
        this.rice = rice;
        this.meat = meat;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
