package com.task.asset.repository;

import com.task.asset.persistance.Accessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface AccessoriesRepository extends JpaRepository<Accessories,Integer> {
}
