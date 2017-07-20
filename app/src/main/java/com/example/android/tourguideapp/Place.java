package com.example.android.tourguideapp;

/**
 * Created by Demo on 2017-07-20.
 */

public class Place {

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final String NO_PHONE_PROVIDED = "";
    private static final float NO_RATING_PROVIDED = 0.0f;
    private String name;
    private String add;
    private int img=NO_IMAGE_PROVIDED;
    private String phone=NO_PHONE_PROVIDED;
    private float rating = NO_RATING_PROVIDED;


    public Place(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public Place(String name, String add, String phone) {
        this.name = name;
        this.add = add;
        this.phone = phone;
    }

    public Place(String name, String add, int img) {
        this.name = name;
        this.add = add;
        this.img = img;
    }

    public Place(String name, String add, int img, String phone) {

        this.name = name;
        this.add = add;
        this.img = img;
        this.phone = phone;
    }

    public Place(String name, String add, String phone, float rating) {
        this.name = name;
        this.add = add;
        this.img = img;
        this.phone = phone;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }


    public int getImg() {
        return img;
    }

    public String getPhone() {
        return phone;
    }

    public float getRating() {
        return rating;
    }

    public boolean has_img(){
        return img!=NO_IMAGE_PROVIDED;
    }

    public boolean has_phone(){
        return phone!=NO_PHONE_PROVIDED;
    }

    public boolean has_rate() {
        return rating != NO_RATING_PROVIDED;
    }


}
