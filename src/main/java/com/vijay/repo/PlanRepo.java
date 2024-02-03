package com.vijay.repo;

import com.vijay.entities.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepo extends JpaRepository<PlanEntity, Integer> {
}
