package com.task.asset.repository;

import com.task.asset.persistance.Furnitures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface FurnituresRepository extends JpaRepository<Furnitures,Integer> {
}
