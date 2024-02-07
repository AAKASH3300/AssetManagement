package com.task.asset.persistance;

import com.task.asset.enums.Expiration;
import com.task.asset.enums.Ownership;
import com.task.asset.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name="tbl_accessories")
public class Accessories {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "acc_code", length = 20)
    private String accCode;

    @Column(name = "sub_category_id")
    private Integer subCategoryId;

    @Column(name = "acc_name", length = 50)
    private String accName;

    @Column(name = "acc_brand", length = 50)
    private String accBrand;

    @Column(name = "serial_no", length = 50)
    private String serialNo;

    @Column(name = "acc_details", length = 500)
    private String accDetails;

//    @Column(name = "acc_image", length = 500)
//    private String accImage;

    @Column(length = 10)
    private Ownership ownership;

    @Column(name = "vendor_id")
    private Integer vendorId;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purchase_cost")
    private Double purchaseCost;

    @Column(length = 10)
    private Expiration warranty;

    @Column(name = "warranty_period")
    private Integer warrantyPeriod;

    @Column(length = 10)
    private Status status;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "last_updated_by")
    private Integer lastUpdatedBy;

    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;

    @Column(name = "last_updated_date")
    @UpdateTimestamp
    private Date lastUpdatedDate;
}
