package com.example.pc_store;

import java.io.Serializable;

public class Product implements Serializable {
    public String name;
    public String type;
    public String manufacturer;
    public String series;
    public int number;
    public String characteristics;
    public String image_url;

    public Product() {

    }

    public Product(String name, String type, String manufacturer, String series, int number, String characteristics, String image_url) {
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.series = series;
        this.number = number;
        this.characteristics = characteristics;
        this.image_url = image_url;
    }
}

