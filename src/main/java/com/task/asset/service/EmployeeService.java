package com.task.asset.service;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.dto.EmployeeDTO;


import java.util.List;

public interface EmployeeService {

    EmployeeDTO add(EmployeeDTO employeeModel);

    List<EmployeeDTO> viewEmployee() throws CommonException, NoDataPresentException;
}
