package com.task.asset.persistance;

import com.task.asset.enums.EnumStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Data
@Table(name="tbl_vendor")

public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    int id;
    @Column(name = "vendor_code")
    String vendorCode;
    @Column(name = "vendor_name")
    String vendorName;
    @Column(name = "email")
    String email;
    @Column(name = "phone")
    String phone;
    @Column(name = "address")
    String address;
    @Column(name = "notes")
    String notes;
    @Column(name = "status")
    EnumStatus status;
    @Column(name = "created_by")
    int createdBy;
    @Column(name = "last_updated_by")
    int lastUpdatedBy;
    @Column(name = "created_date")
    @CreationTimestamp
    Timestamp createdDate;
    @Column(name = "last_updated_date")
    @UpdateTimestamp
    Timestamp lastUpdatedDate;
}