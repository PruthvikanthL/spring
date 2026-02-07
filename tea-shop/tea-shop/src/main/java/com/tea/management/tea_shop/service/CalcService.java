package com.tea.management.tea_shop.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double add(double num1,double num2){
        return num1+num2;
    }
    public double sub(double num1,double num2){
        return num1-num2;
    }
    public double mul(double num1,double num2){
        return num1*num2;
    }
    public double div(double num1,double num2){
        if(num2==0){
            throw new ArithmeticException("Divide by zero not possible");
        }
        return num1/num2;
    }

}
