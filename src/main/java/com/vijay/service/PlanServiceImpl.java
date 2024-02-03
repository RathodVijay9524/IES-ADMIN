package com.vijay.service;

import com.vijay.repo.PlanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    public PlanRepo planRepo;
}
