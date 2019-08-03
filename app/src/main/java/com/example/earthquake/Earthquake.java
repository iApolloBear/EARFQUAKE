package com.example.earthquake;

public class Earthquake {
    private double elevel;
    private String ename;
    private long edate;
    private String url;

    public Earthquake(double level, String city, long date, String address){
        elevel = level;
        ename = city;
        edate = date;
        url = address;
    }

    public double getLevel() {
        return elevel;
    }

    public String getName() {
        return ename;
    }

    public long getDate() {
        return edate;
    }

    public String getUrl() {
        return url;
    }
}
