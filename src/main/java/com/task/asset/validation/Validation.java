package com.task.asset.validation;

import com.task.asset.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Validation {

    @Autowired
    EmployeeRepository employeeRepository;

    public boolean checkExistEmail(String email) {
        boolean userFlag = false;

        Integer id = employeeRepository.checkUser(email);
        if (id != null && id > 0) {
            userFlag = true;
        }
        return userFlag;
    }

//    public boolean checkExistUser(String username) {
//        boolean usernameFlag = false;
//
//        String user = employeeRepository.checkUserName(username);
//        if (user != null) {
//            usernameFlag = true;
//        }
//        return usernameFlag;
//    }

//    public boolean AddValidation(@NotNull EmployeeDTO employeeDTO) throws CommonException {
//
//        if (checkExistEmail(employeeDTO.getEmail())) {
//            Employee employee = employeeRepository.getUserRecord(signInDTO.getEmail());
//            if (employee.getPassword().equals(signInDTO.getPassword())) {
//                return true;
//            } else {
//                throw new UserCredentialException("Password Mismatched");
//            }
//        } else {
//            throw new UserNotFoundException("Given email not exists");
//        }
//    }
}
