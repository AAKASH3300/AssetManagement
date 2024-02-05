package com.task.asset.service;

 import static org.junit.jupiter.api.Assertions.*;
        import static org.mockito.Mockito.*;

 import com.task.asset.exception.CommonException;
 import com.task.asset.exception.NoDataPresentException;
 import com.task.asset.persistance.Employee;
 import com.task.asset.persistance.conversion.EmployeeMapper;
 import com.task.asset.persistance.dto.EmployeeDTO;
 import com.task.asset.repository.EmployeeRepository;
 import com.task.asset.service.implementation.EmployeeImpl;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.extension.ExtendWith;
 import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeImpl employeeService;

    @Test
    void testAddEmployee() {
        // Given
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpCode(employeeDTO.getEmpCode());

        Employee employee = EmployeeMapper.convertToEntity(employeeDTO);

        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        // When
        EmployeeDTO result = employeeService.add(employeeDTO);

        // Then
        assertNotNull(result);
        assertEquals(employeeDTO.getEmpCode(), result.getEmpCode());
        verify(employeeRepository, times(2)).save(any(Employee.class));
    }

    @Test
    void testViewEmployee() throws CommonException, NoDataPresentException {
        // Given
        Employee employee1 = new Employee();
        employee1.setEmpCode("emp_123");

        Employee employee2 = new Employee();
        employee2.setEmpCode("emp_456");

        List<Employee> employeeList = Arrays.asList(employee1, employee2);

        when(employeeRepository.findAll()).thenReturn(employeeList);

        // When
        List<EmployeeDTO> result = employeeService.viewEmployee();

        // Then
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("emp_123", result.get(0).getEmpCode());
        assertEquals("emp_456", result.get(1).getEmpCode());
        verify(employeeRepository, times(1)).findAll();
    }
}

