package com.yb;

public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void enginrBoom();
    public  void run(){
        this.start();
        this.enginrBoom();
        this.alarm();
        this.stop();
    }
}