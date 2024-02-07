package com.task.asset.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.dto.EmployeeDTO;
import com.task.asset.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.ValidationException;
import java.util.Arrays;
import java.util.List;

class EmployeeControllerTest {

    private final EmployeeService employeeService = mock(EmployeeService.class);
    private final EmployeeController employeeController = new EmployeeController(employeeService);

    @Test
    void testRegisterEmployee() {

        EmployeeDTO employeeDTO = new EmployeeDTO();


        ResponseEntity<EmployeeDTO> responseEntity = employeeController.registerEmployee(employeeDTO);


        verify(employeeService, times(1)).add(any(EmployeeDTO.class));
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(employeeDTO, responseEntity.getBody());
    }

    @Test
    void testGetEmployees() throws CommonException, NoDataPresentException {
        // Given
        EmployeeDTO employeeDTO1 = new EmployeeDTO();
        EmployeeDTO employeeDTO2 = new EmployeeDTO();
        List<EmployeeDTO> employeeDTOList = Arrays.asList(employeeDTO1, employeeDTO2);

        when(employeeService.viewEmployee()).thenReturn(employeeDTOList);

        // When
        ResponseEntity<List<EmployeeDTO>> responseEntity = employeeController.getEmployees();

        // Then
        verify(employeeService, times(1)).viewEmployee();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(employeeDTOList, responseEntity.getBody());
    }
}
