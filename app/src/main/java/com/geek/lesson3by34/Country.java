package com.geek.lesson3by34;

public class Country {

    private int img_iv;
    private String country_tv;
    private String text_tv;

    public Country(int img_iv, String country_tv, String text_tv) {
        this.img_iv = img_iv;
        this.country_tv = country_tv;
        this.text_tv = text_tv;
    }

    public int getImg_iv() {
        return img_iv;
    }

    public void setImg_iv(int img_iv) {
        this.img_iv = img_iv;
    }

    public String getCountry_tv() {
        return country_tv;
    }

    public void setCountry_tv(String country_tv) {
        this.country_tv = country_tv;
    }

    public String getText_tv() {
        return text_tv;
    }

    public void setText_tv(String text_tv) {
        this.text_tv = text_tv;
    }
}
