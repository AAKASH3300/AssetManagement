package com.task.asset.persistance;


import com.task.asset.enums.EnumExpiration;
import com.task.asset.enums.EnumOwnership;
import com.task.asset.enums.EnumStatus;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

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

//    @ManyToOne
//    @JoinColumn(name = "sub_category_id", referencedColumnName = "id")
//    private SubCategory subCategoryId;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "ownership", length = 10)
    private EnumOwnership Ownership;

    @ManyToOne
    @JoinColumn(name = "vendor_id", referencedColumnName = "id")
    private Vendor vendorId;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purchase_cost")
    private Double purchaseCost;

    @Enumerated(EnumType.STRING)
    @Column(name = "warranty", length = 5)
    private EnumExpiration warranty;

    @Column(name = "warranty_period")
    private Integer warrantyPeriod;

    @Column(name = "last_maintenance")
    private Date lastMaintenance;

    @Column(name = "next_maintenance")
    private Date nextMaintenance;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 10)
    private EnumStatus status;

    @ManyToOne
    @JoinColumn(name = "emp_id", referencedColumnName = "id")
    private Employee empId;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "last_updated_by")
    private String lastUpdatedBy;

    @Column(name = "created_date")
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "last_updated_date")
    @UpdateTimestamp
    private Timestamp lastUpdatedDate;


}


