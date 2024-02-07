package com.task.asset.persistance;


import com.task.asset.enums.Expiration;
import com.task.asset.enums.Ownership;
import com.task.asset.enums.Status;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "tbl_electronics")
public class Electronics {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "ele_code", length = 20)
    private String eleCode;

    @Column(name = "sub_category_id")
    private Integer subCategoryId;

    @Column(name = "ele_name", length = 50)
    private String eleName;

    @Column(name = "ele_brand", length = 50)
    private String eleBrand;

    @Column(name = "serial_no", length = 50)
    private String serialNo;

    @Column(name = "ele_details", length = 1000)
    private String eleDetails;

//    @Column(name = "ele_image", length = 500)
//    private String eleImage;

    @Column(name = "ownership", length = 10)
    private Ownership ownership;

    @Column(name = "vendor_id")
    private Integer vendorId;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purchase_cost")
    private Double purchaseCost;

    @Column(name = "warranty", length = 5)
    private Expiration warranty;

    @Column(name = "warranty_period")
    private Integer warrantyPeriod;

    @Column(name = "last_maintenance")
    private Date lastMaintenance;

    @Column(name = "next_maintenance")
    private Date nextMaintenance;

    @Column(name = "status", length = 10)
    private Status status;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "last_updated_by")
    private Integer lastUpdatedBy;

    @Column(name = "created_date")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "last_updated_date")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;

}


