package com.example.farahnaz.myapplication.common.Helper.Model;

/**
 * Created by Farahnaz on 22/06/2019.
 */

public class Wind {
    public double speed;
    public double deg;

    public Wind(double speed,double deg){
        this.speed=speed;
        this.deg=deg;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
