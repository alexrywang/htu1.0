package com.htu.service;


import com.htu.model.Usergjj;

import java.util.List;

public interface GjjService {

    Usergjj login(Usergjj usergjj);

    List<Usergjj> findAll();

    List<Usergjj> findByidcard(String khsfzhm);
}
