package com.task.asset.repository;

import com.task.asset.persistance.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Integer> {
}
