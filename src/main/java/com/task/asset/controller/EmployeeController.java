package com.task.asset.controller;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.dto.EmployeeDTO;
import com.task.asset.service.EmployeeService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
@SecurityRequirement(name = "bearerAuth")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("add")
    public ResponseEntity<EmployeeDTO> registerEmployee(@Valid @RequestBody EmployeeDTO employee) throws CommonException{

        employeeService.add(employee);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("viewEmployees")
    public ResponseEntity<List<EmployeeDTO>> getEmployees() throws CommonException, NoDataPresentException {

        return new ResponseEntity<>(employeeService.viewEmployee(), HttpStatus.OK);
    }

}
