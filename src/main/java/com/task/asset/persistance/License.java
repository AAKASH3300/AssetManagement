package com.task.asset.persistance;

import com.task.asset.enums.Expiration;
import com.task.asset.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicLong;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor

@Table(name = "tbl_license")
public class License {

    @Column(name = "licCode")
    private static final AtomicLong licCodeSequence = new AtomicLong(100); // Initial value for the sequence
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String licCode;

    @Column(name = "licType")
    private String licType;

    //@Column(name = "licImage")
    //private String licImage;

    @Column(name = "licName")
    private String licName;

    @Column(name = "licDetails")
    private String licDetails;

    @Column(name = "licBrand")
    private String licBrand;

    @Column(name = "licKey")
    private String licKey;

    @Column(name = "totalSeats")
    private Integer totalSeats;

    @Column(name = "vendorId")
    private Integer vendorId;

    @Column(name = "purchaseDate")
    private Timestamp purchaseDate;

    @Column(name = "purchaseCost")
    private Double purchaseCost;
    @Column(name = "expiration")
    private Expiration expiration;
    @Column(name = "expirationPeriod")
    private Integer expirationPeriod;
    @Column(name = "expirationAlert")
    private Integer expirationAlert;
    @Column(name = "status")
    private Status status;
    @Column(name = " createdBy")
    private Integer createdBy;
    @Column(name = "lastUpdatedBy")
    private Integer lastUpdatedBy;
    @CreationTimestamp
    @Column(name = "createdDate")
    private Timestamp createdDate;
    @UpdateTimestamp
    @Column(name = "lastUpdatedDate")
    private Timestamp lastUpdatedDate;

    //    @ManyToOne
//    Vendor vendor;
    public License() {
        generateLicCode();
    }

    private void generateLicCode() {
        this.licCode = "lic_" + licCodeSequence.getAndIncrement();
    }
}

