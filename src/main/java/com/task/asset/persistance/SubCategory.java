package com.task.asset.persistance;

import com.task.asset.enums.EnumStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
@Getter
@Setter
@Table(name="tbl_subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="id")
    private int id;

    @Column(name = "sub_category_name", length = 50)
    private String subCategoryName;

    @Column(name="status",length = 10)
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
