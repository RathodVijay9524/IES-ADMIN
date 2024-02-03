package com.vijay.service;

import com.vijay.repo.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;


public class AppServiceImpl implements AppService{

    @Autowired
    private AppRepo appRepo;
}
