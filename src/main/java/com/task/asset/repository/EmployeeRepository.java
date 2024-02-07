package com.task.asset.repository;

import com.task.asset.persistance.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select tbl_employee.id from Employee tbl_employee where tbl_employee.email=:email")
    public Integer checkUser(String email);
}
