package com.computer.mangement;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop constructor is Running");
    }
    @Override
    public void compile() {
        System.out.println("Complie is running the Desktop");
    }
}
