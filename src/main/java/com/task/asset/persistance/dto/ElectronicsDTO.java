package com.task.asset.persistance.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ElectronicsDTO {


    private Integer id;

    private String eleCode;

//    private String subCategoryId;

    private String eleName;

    private String eleBrand;

    private String serialNo;

    private String eleDetails;

//    private String eleImage;

    private String ownership;

    private String vendorId;

    private String purchaseDate;

    private String purchaseCost;

    private String warranty;

    private String warrantyPeriod;

    private String lastMaintenance;

    private String nextMaintenance;

    private String empId;

    private String status;

    private String createdBy;

    private String lastUpdatedBy;

    private String createdDate;

    private String lastUpdatedDate;

}