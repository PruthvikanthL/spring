package com.computer.mangement;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Constructor is running");
    }
    public void compile(){
        System.out.println("compile is running in the laptop");
    }
}
