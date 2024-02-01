package com.task.asset;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.Employee;
import com.task.asset.persistance.dto.EmployeeDTO;
import com.task.asset.repository.EmployeeRepository;
import com.task.asset.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
     EmployeeService employeeService = new EmployeeService() {
        @Override
        public EmployeeDTO add(EmployeeDTO employeeModel) {
            return null;
        }

        @Override
        public List<EmployeeDTO> viewEmployee() throws CommonException, NoDataPresentException {
            return null;
        }
    };

    public EmployeeServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testViewEmployeeWithNoDataPresentException() {
        // Arrange
        when(employeeRepository.findAll()).thenReturn(new ArrayList<>());

        // Act & Assert
        assertThrows(NoDataPresentException.class, () -> {
            employeeService.viewEmployee();
        });
    }

    @Test
    void testViewEmployee() throws CommonException, NoDataPresentException {
        // Arrange
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee());


        when(employeeRepository.findAll()).thenReturn(employees);

        // Act
        List<EmployeeDTO> result = employeeService.viewEmployee();

        // Assert
        assertNotNull(result);
        assertEquals(employees.size(), result.size());

    }
}
