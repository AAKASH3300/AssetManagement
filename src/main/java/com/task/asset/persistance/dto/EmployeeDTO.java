package com.task.asset.persistance.dto;

import com.task.asset.enums.Status;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class EmployeeDTO {
    private int id;
    private String empCode;
    @NotBlank(message = "Please enter the Firstname!")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Special characters not allowed !")
    @Size(min = 3, max = 20, message = "Your firstname size should be between 3 and 20 and should not have special characters!")
    private String firstname;
    @NotBlank(message = "Please enter the Firstname!")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Special characters not allowed !")
    @Size(min = 3, max = 20, message = "Your firstname size should be between 3 and 20 and should not have special characters!")
    private String lastname;
    @NotBlank(message = "Please enter your email!")
    @Email(message = "Inappropriate email!")
    private String email;
    @NotBlank(message = "Please enter your Phone number !")
    @Pattern(regexp = "^\\d{10}$", message = "Inappropriate phone number!")
    private String phone;
    @NotBlank(message = "Please enter password!")
    @Size(min = 8, max = 20, message = "Your password size should be between 8 and 20!")
    private String password;
    private Status status;
    private String createdBy;
    private String lastUpdatedBy;
    private Date createdDate;
    private Date lastUpdatedDate;


}
