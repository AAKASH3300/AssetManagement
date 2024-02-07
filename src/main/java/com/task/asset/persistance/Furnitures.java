package com.task.asset.persistance;

import com.task.asset.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "tbl_furnitures")
public class Furnitures {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "item_code", length = 20)
    private String itemCode;
    @Column(name = "item_name", length = 50)
    private String itemName;

//    @Column(name = "item_image", length = 500)
//    private String itemImage;

    @Column(name = "sub_category_id")
    private Integer subCategoryId;

    @Column(name = "item_brand", length = 50)
    private String itemBrand;

    @Column(name = "item_details", length = 500)
    private String itemDetails;

    @Column(name = "vendor_id")
    private Integer vendorId;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purchase_cost")
    private Double purchaseCost;

    @Column(name = "purchase_qty")
    private Double purchaseQty;

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
