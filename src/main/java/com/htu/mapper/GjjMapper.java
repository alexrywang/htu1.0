package com.htu.mapper;

import com.htu.model.Usergjj;

import java.util.List;

public interface GjjMapper {

    Usergjj login(Usergjj usergjj);

    List<Usergjj> findAll();

    List<Usergjj> findByidcard(String khsfzhm);
}