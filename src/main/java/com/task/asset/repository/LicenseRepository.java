package com.task.asset.repository;

import com.task.asset.persistance.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends JpaRepository<License,Integer> {
}
