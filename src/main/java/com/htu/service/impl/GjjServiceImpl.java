package com.htu.service.impl;

import com.htu.mapper.GjjMapper;
import com.htu.model.Usergjj;
import com.htu.service.GjjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("gjjService")
public class GjjServiceImpl implements GjjService {

    @Autowired
    private GjjMapper gjjMapper;


    public Usergjj login(Usergjj usergjj) {
        return gjjMapper.login(usergjj);
    }


    public List<Usergjj> findAll() {
        return gjjMapper.findAll();
    }


    public List<Usergjj> findByidcard(String khsfzhm) {
        return gjjMapper.findByidcard(khsfzhm);
    }


}
