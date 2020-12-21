package com.example.demo;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Init Classcical");
    }

    public void doMyDestroy(){
        System.out.println("Desroing classical");
    }

    @Override
    public String getSong() {
        return "Classic music";
    }
}
