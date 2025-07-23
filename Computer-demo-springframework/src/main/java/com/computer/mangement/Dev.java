package com.computer.mangement;

public class Dev {
    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Dev(){
        System.out.println("Dev Constructor is Running");
    }

    public void build(){
        System.out.println("build is running in the dev");
    }
}
