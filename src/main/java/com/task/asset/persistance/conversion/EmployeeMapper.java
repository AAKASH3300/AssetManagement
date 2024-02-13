package com.task.asset.persistance.conversion;

import com.task.asset.enums.EnumStatus;
import com.task.asset.persistance.Employee;
import com.task.asset.persistance.dto.EmployeeDTO;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public static Employee convertToEntity(EmployeeDTO employeeModel) {

        Employee employee = new Employee();

        employee.setId(employeeModel.getId());
        employee.setEmpCode(employee.getEmpCode());
        employee.setFirstname(employeeModel.getFirstname());
        employee.setLastname(employeeModel.getLastname());
        employee.setEmail(employeeModel.getEmail());
        employee.setPhone(employeeModel.getPhone());
        employee.setStatus(EnumStatus.valueOf(String.valueOf(EnumStatus.ACTIVE)));
        employee.setCreatedDate(employeeModel.getCreatedDate());
        employee.setLastUpdatedDate(employeeModel.getLastUpdatedDate());

        return employee;
    }

    public static EmployeeDTO convertToModel(Employee employee) {

        EmployeeDTO employeeModel = new EmployeeDTO();

        employeeModel.setId(employee.getId());
        employeeModel.setEmpCode(employee.getEmpCode());
        employeeModel.setFirstname(employee.getFirstname());
        employeeModel.setLastname(employee.getLastname());
        employeeModel.setEmail(employee.getEmail());
        employeeModel.setPhone(employee.getPhone());
        employeeModel.setStatus(EnumStatus.valueOf(String.valueOf(employee.getStatus())));
        employeeModel.setCreatedBy(employee.getEmpCode());
        employeeModel.setLastUpdatedBy(employee.getEmpCode());
        employeeModel.setCreatedDate(employee.getCreatedDate());
        employeeModel.setLastUpdatedDate(employee.getLastUpdatedDate());

        return employeeModel;
    }
}
