package com.task.asset.service.implementation;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.Employee;
import com.task.asset.persistance.conversion.EmployeeMapper;
import com.task.asset.persistance.dto.EmployeeDTO;
import com.task.asset.repository.EmployeeRepository;
import com.task.asset.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeImpl implements EmployeeService {

    static Logger log = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public EmployeeDTO add(EmployeeDTO employeeModel) {

        Employee employee = EmployeeMapper.convertToEntity(employeeModel);


        log.info("customer details being saved :  {}", employee);
        employeeRepository.save(employee);
        employeeModel = EmployeeMapper.convertToModel(employee);

        return employeeModel;
    }

    @Override
    public List<EmployeeDTO> viewEmployee() throws CommonException, NoDataPresentException {

        List<Employee> employees = employeeRepository.findAll();

        List<EmployeeDTO> customerModels = new ArrayList<>();

        if(employees.isEmpty()) throw new NoDataPresentException("No Employee records found ..");
        for(Employee employee: employees){
            customerModels.add(EmployeeMapper.convertToModel(employee));
        }

        return customerModels;
    }
}
