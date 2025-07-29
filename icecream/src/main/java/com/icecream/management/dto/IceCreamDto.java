package com.icecream.management.dto;

public class IceCreamDto {
    private String name;
    private String flavour;
    private int quantity;
    private boolean takeAway;
    private boolean addOns;
    private String coupon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }

    public boolean isAddOns() {
        return addOns;
    }

    public void setAddOns(boolean addOns) {
        this.addOns = addOns;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }
}
