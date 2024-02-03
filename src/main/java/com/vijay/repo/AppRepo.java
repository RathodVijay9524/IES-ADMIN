package com.vijay.repo;


import com.vijay.entities.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepo extends JpaRepository<AppEntity,Long> {
}
