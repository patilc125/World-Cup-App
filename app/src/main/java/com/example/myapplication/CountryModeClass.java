package com.example.myapplication;

public class CountryModeClass {

    private String country_name,country_win;
    private int flagimage;

    public CountryModeClass(String country_name, String country_win, int flagimage) {
        this.country_name = country_name;
        this.country_win = country_win;
        this.flagimage = flagimage;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_win() {
        return country_win;
    }

    public void setCountry_win(String country_win) {
        this.country_win = country_win;
    }

    public int getFlagimage() {
        return flagimage;
    }

    public void setFlagimage(int flagimage) {
        this.flagimage = flagimage;
    }
}
