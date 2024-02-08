package com.task.asset.persistance.conversion;

import com.task.asset.enums.Expiration;
import com.task.asset.enums.Status;
import com.task.asset.persistance.Electronics;
import com.task.asset.persistance.dto.ElectronicsDTO;

public class ElectronicsMapper {
    public static ElectronicsDTO convertToModel(Electronics electronics) {
        ElectronicsDTO model = new ElectronicsDTO();
        model.setId(electronics.getId());
        model.setEleCode(electronics.getEleCode());
        model.setSubCategoryId(electronics.getSubCategoryId());
        model.setEleName(electronics.getEleName());
        model.setEleBrand(electronics.getEleBrand());
        model.setSerialNo(electronics.getSerialNo());
        model.setEleDetails(electronics.getEleDetails());
        // model.setEleImage(electronics.getEleImage()); // Uncomment if needed
        model.setOwnership(electronics.getOwnership());
        model.setVendorId(electronics.getVendorId());
        model.setPurchaseDate(electronics.getPurchaseDate());
        model.setPurchaseCost(electronics.getPurchaseCost());
        model.setWarranty(Expiration.valueOf(electronics.getWarranty().name()));
        model.setWarrantyPeriod(electronics.getWarrantyPeriod());
        model.setLastMaintenance(electronics.getLastMaintenance());
        model.setNextMaintenance(electronics.getNextMaintenance());
        model.setStatus(Status.valueOf(electronics.getStatus().name()));
        model.setCreatedBy(electronics.getCreatedBy());
        model.setLastUpdatedBy(electronics.getLastUpdatedBy());
        model.setCreatedDate(electronics.getCreatedDate());
        model.setLastUpdatedDate(electronics.getLastUpdatedDate());
        return model;
    }

    public static Electronics convertToelectronics(ElectronicsDTO model) {
        Electronics electronics = new Electronics();
        electronics.setId(model.getId());
        electronics.setEleCode(model.getEleCode());
        electronics.setSubCategoryId(model.getSubCategoryId());
        electronics.setEleName(model.getEleName());
        electronics.setEleBrand(model.getEleBrand());
        electronics.setSerialNo(model.getSerialNo());
        electronics.setEleDetails(model.getEleDetails());
        // electronics.setEleImage(model.getEleImage()); // Uncomment if needed
        electronics.setOwnership(model.getOwnership());
        electronics.setVendorId(model.getVendorId());
        electronics.setPurchaseDate(model.getPurchaseDate());
        electronics.setPurchaseCost(model.getPurchaseCost());
        electronics.setWarranty(Expiration.valueOf(model.getWarranty().name()));
        electronics.setWarrantyPeriod(model.getWarrantyPeriod());
        electronics.setLastMaintenance(model.getLastMaintenance());
        electronics.setNextMaintenance(model.getNextMaintenance());
        electronics.setStatus(Status.valueOf(model.getStatus().name()));
        electronics.setCreatedBy(model.getCreatedBy());
        electronics.setLastUpdatedBy(model.getLastUpdatedBy());
        electronics.setCreatedDate(model.getCreatedDate());
        electronics.setLastUpdatedDate(model.getLastUpdatedDate());
        return electronics;
    }
}
