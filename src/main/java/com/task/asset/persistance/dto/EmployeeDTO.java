package com.task.asset.persistance.dto;

import com.task.asset.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.sql.Date;

public class EmployeeDTO {
    private int id;
    private String empCode;
    @NotBlank(message = "Please enter the Firstname!")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$",message = "Special characters not allowed !")
    @Size(min = 3,max = 20,message = "Your firstname size should be between 3 and 20 and should not have special characters!")
    private String firstname;
    @NotBlank(message = "Please enter the Firstname!")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$",message = "Special characters not allowed !")
    @Size(min = 3,max = 20,message = "Your firstname size should be between 3 and 20 and should not have special characters!")
    private String lastname;
    @NotBlank(message = "Please enter your email!")
    @Pattern(regexp = "^(.+)+@(.+)$", message = "Inappropriate email!")
    private String email;
    @NotBlank(message = "Please enter your Phone number !")
    @Pattern(regexp = "^\\d{10}$", message = "Inappropriate phone number!")
    private String phone;
    @NotBlank(message = "Please enter password!")
    @Size(min = 8,max = 20,message = "Your password size should be between 8 and 20!")
    private String password;
    private Status status;
    private String createdBy;
    private String lastUpdatedBy;
    private Date createdDate;
    private Date lastUpdatedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
