package com.task.asset.persistance.conversion;

import com.task.asset.enums.Status;
import com.task.asset.persistance.Employee;
import com.task.asset.persistance.dto.EmployeeDTO;

public class EmployeeMapper {

    public static Employee convertToEntity(EmployeeDTO employeeModel) {

        Employee employee = new Employee();


        employee.setFirstname(employeeModel.getFirstname());
        employee.setLastname(employeeModel.getLastname());
        employee.setEmail(employeeModel.getEmail());
        employee.setPhone(employeeModel.getPhone());
        employee.setPassword(employeeModel.getPassword());
        employee.setStatus(Status.ACTIVE);
        employee.setCreatedDate(employeeModel.getCreatedDate());
        employee.setLastUpdatedDate(employeeModel.getLastUpdatedDate());

        return employee;
    }

    public static EmployeeDTO convertToModel(Employee employee) {

        EmployeeDTO employeeModel = new EmployeeDTO();

        employeeModel.setEmpCode(employee.getEmpCode());
        employeeModel.setFirstname(employee.getFirstname());
        employeeModel.setLastname(employee.getLastname());
        employeeModel.setEmail(employee.getEmail());
        employeeModel.setPhone(employee.getPhone());
        employeeModel.setPassword(employee.getPassword());
        employeeModel.setCreatedBy(employee.getCreatedBy());
        employeeModel.setLastUpdatedBy(employee.getLastUpdatedBy());
        employeeModel.setCreatedDate(employee.getCreatedDate());
        employeeModel.setLastUpdatedDate(employee.getLastUpdatedDate());

        return employeeModel;
    }
}
