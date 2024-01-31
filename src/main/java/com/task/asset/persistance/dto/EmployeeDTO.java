package com.task.asset.persistance.dto;

import java.sql.Date;

public class EmployeeDTO {
    private int id;
    private String empCode;
    private  String firstname;
    private  String lastname;
    private  String email;
    private  String phone;
    private  String password;
    private  String status;
    private  String createdBy;
    private  String lastUpdatedBy;
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

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
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
