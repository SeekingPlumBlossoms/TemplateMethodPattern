package com.yb;

public class HummrtH2Model extends HummerModel {
   @Override
    public  void start(){
        System.out.println("悍马H2发动...!");
    }
    @Override
    public  void stop(){
        System.out.println("悍马H2停车...!");
    }
    @Override
    public  void alarm(){
        System.out.println("悍马H2鸣笛...!");
    }
    @Override
    public  void enginrBoom(){
        System.out.println("悍马H2引擎声音是这样的...!");

    }
    @Override
    public  void run(){
       this.start();
       this.enginrBoom();
       this.alarm();
       this.stop();
    }
}
