package com.task.asset.persistance;

import com.task.asset.enums.EnumStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "tbl_consumables")
public class Consumables {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "cs_code", length = 20)
    private String csCode;

    @Column(name = "sub_category_id")
    private Integer subCategoryId;

    @Column(name = "cs_name", length = 50)
    private String csName;

//    @Column(name = "cs_image", length = 500)
//    private String csImage;

    @Column(name = "cs_brand", length = 50)
    private String csBrand;

    @Column(name = "cs_details", length = 500)
    private String csDetails;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "vendor_id")
    private Integer vendorId;

    @Column(name = "purchase_cost")
    private Double purchaseCost;

    @Column(name = "purchase_qty")
    private Double purchaseQty;

    @Column(name = "minimum_qty")
    private Integer minimumQty;

    @Column(name = "notify_to")
    private Integer notifyTo;

    @Column(name = "notify_when", length = 50)
    private String notifyWhen;

    @Column(length = 10)
    private EnumStatus status;

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
