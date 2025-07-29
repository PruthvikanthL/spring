package com.trinum.management.service;

import com.trinum.management.dto.TriNumDto;
import org.springframework.stereotype.Service;

@Service
public class TriNumServiceImplimentation implements TriNumService{
    @Override
    public int doTri(TriNumDto triNumDto) {
        int tri=triNumDto.getNum()*triNumDto.getNum()*triNumDto.getNum();
        return tri;
    }
}
