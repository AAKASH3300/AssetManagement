package com.task.asset.repository;

import com.task.asset.persistance.Consumables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConusmablessRepository extends JpaRepository<Consumables,Integer> {
}
