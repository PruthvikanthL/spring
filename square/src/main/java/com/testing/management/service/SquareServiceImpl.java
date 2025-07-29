package com.testing.management.service;

import com.testing.management.dto.SquareDto;
import org.springframework.stereotype.Service;

@Service
public class SquareServiceImpl {
    public int doSquare(SquareDto squareDto){
        int num=squareDto.getNum();
        int squre=num*num;
        return squre;
    }
}
