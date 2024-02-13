package com.task.asset.persistance.conversion;

import com.task.asset.enums.EnumExpiration;
import com.task.asset.enums.EnumOwnership;
import com.task.asset.enums.EnumStatus;
import com.task.asset.persistance.Electronics;
import com.task.asset.persistance.Employee;
import com.task.asset.persistance.Vendor;
import com.task.asset.persistance.dto.ElectronicsDTO;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Timestamp;

@Component
public class ElectronicsMapper {
    public ElectronicsDTO convertToModel(Electronics electronics) {
        ElectronicsDTO model = new ElectronicsDTO();
        model.setId(electronics.getId());
        model.setEleCode(electronics.getEleCode());
//        model.setSubCategoryId(String.valueOf(electronics.getSubCategoryId().getId()));
        model.setEleName(electronics.getEleName());
        model.setEleBrand(electronics.getEleBrand());
        model.setSerialNo(electronics.getSerialNo());
        model.setEleDetails(electronics.getEleDetails());
        // model.setEleImage(electronics.getEleImage()); // Uncomment if needed
        model.setOwnership(String.valueOf(electronics.getOwnership()));
        model.setVendorId(String.valueOf(electronics.getVendorId()));
        model.setPurchaseDate(String.valueOf(electronics.getPurchaseDate()));
        model.setPurchaseCost(String.valueOf(electronics.getPurchaseCost()));
        model.setWarranty(String.valueOf(electronics.getWarranty()));
        model.setWarrantyPeriod(String.valueOf(electronics.getWarrantyPeriod()));
        model.setLastMaintenance(String.valueOf(electronics.getLastMaintenance()));
        model.setNextMaintenance(String.valueOf(electronics.getNextMaintenance()));
        model.setStatus(String.valueOf(electronics.getStatus()));
        model.setCreatedBy(electronics.getCreatedBy());
        model.setLastUpdatedBy(electronics.getLastUpdatedBy());
        model.setCreatedDate(String.valueOf(electronics.getCreatedDate()));
        model.setLastUpdatedDate(String.valueOf(electronics.getLastUpdatedDate()));
        return model;
    }

    public Electronics ModelToEntity(ElectronicsDTO model, Employee employee) {
        Electronics electronics = new Electronics();
        electronics.setEleCode(model.getEleCode());
//        SubCategory subCategory = new SubCategory();
//        subCategory.setId(Integer.valueOf(model.getSubCategoryId()));
////        electronics.setSubCategoryId(subCategory);
        electronics.setEleName(model.getEleName());
        electronics.setEleBrand(model.getEleBrand());
        electronics.setSerialNo(model.getSerialNo());
        electronics.setEleDetails(model.getEleDetails());
//         electronics.setEleImage(model.getEleImage());
        electronics.setOwnership(EnumOwnership.valueCheck(model.getOwnership()));
        Vendor vendor = new Vendor();
        vendor.setId(Integer.valueOf(model.getVendorId()));
        electronics.setVendorId(vendor);
        electronics.setEmpId(employee);
        electronics.setPurchaseDate(Date.valueOf(model.getPurchaseDate()));
        electronics.setPurchaseCost(Double.valueOf(model.getPurchaseCost()));
        electronics.setWarranty(EnumExpiration.valueCheck(model.getWarranty()));
        electronics.setWarrantyPeriod(Integer.valueOf(model.getWarrantyPeriod()));
        electronics.setLastMaintenance(Date.valueOf(model.getLastMaintenance()));
        electronics.setNextMaintenance(Date.valueOf(model.getNextMaintenance()));
        electronics.setStatus(EnumStatus.ACTIVE);
        electronics.setCreatedBy(employee.getFirstname());
        electronics.setLastUpdatedBy(employee.getFirstname());
        electronics.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        electronics.setLastUpdatedDate(new Timestamp(System.currentTimeMillis()));
        return electronics;
    }
}
