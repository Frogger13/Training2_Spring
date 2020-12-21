package com.example.demo;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music";
    }
    public void doMyInit(){
        System.out.println("Initialisation Rock");
    }
    public void doMyDestroy(){
        System.out.println("Destroying rock ");
    }
}
