package com.task.asset.persistance.conversion;

import com.task.asset.enums.EnumExpiration;
import com.task.asset.enums.EnumOwnership;
import com.task.asset.enums.EnumStatus;
import com.task.asset.persistance.Accessories;
import com.task.asset.persistance.dto.AccessoriesDTO;
import org.springframework.stereotype.Component;

@Component
public class AccessoryMapper {
    public static AccessoriesDTO convertToModel(Accessories entity) {
        AccessoriesDTO model = new AccessoriesDTO();
        model.setId(entity.getId());
        model.setAccCode(entity.getAccCode());
        model.setSubCategoryId(entity.getSubCategoryId());
        model.setAccName(entity.getAccName());
        model.setAccBrand(entity.getAccBrand());
        model.setSerialNo(entity.getSerialNo());
        model.setAccDetails(entity.getAccDetails());
        // model.setAccImage(entity.getAccImage()); // Uncomment if needed
        model.setOwnership(EnumOwnership.valueOf(entity.getOwnership().name()));
        model.setVendorId(entity.getVendorId());
        model.setPurchaseDate(entity.getPurchaseDate());
        model.setPurchaseCost(entity.getPurchaseCost());
        model.setWarranty(EnumExpiration.valueOf(entity.getWarranty().name()));
        model.setWarrantyPeriod(entity.getWarrantyPeriod());
        model.setStatus(EnumStatus.valueOf(entity.getStatus().name()));
        model.setCreatedBy(entity.getCreatedBy());
        model.setLastUpdatedBy(entity.getLastUpdatedBy());
        model.setCreatedDate(entity.getCreatedDate());
        model.setLastUpdatedDate(entity.getLastUpdatedDate());
        return model;
    }

    public static Accessories convertToEntity(AccessoriesDTO model) {
        Accessories entity = new Accessories();
        entity.setId(model.getId());
        entity.setAccCode(model.getAccCode());
        entity.setSubCategoryId(model.getSubCategoryId());
        entity.setAccName(model.getAccName());
        entity.setAccBrand(model.getAccBrand());
        entity.setSerialNo(model.getSerialNo());
        entity.setAccDetails(model.getAccDetails());
        // entity.setAccImage(model.getAccImage()); // Uncomment if needed
        entity.setOwnership(EnumOwnership.valueOf(model.getOwnership().name()));
        entity.setVendorId(model.getVendorId());
        entity.setPurchaseDate(model.getPurchaseDate());
        entity.setPurchaseCost(model.getPurchaseCost());
        entity.setWarranty(EnumExpiration.valueOf(model.getWarranty().name()));
        entity.setWarrantyPeriod(model.getWarrantyPeriod());
        entity.setStatus(EnumStatus.valueOf(model.getStatus().name()));
        entity.setCreatedBy(model.getCreatedBy());
        entity.setLastUpdatedBy(model.getLastUpdatedBy());
        entity.setCreatedDate(model.getCreatedDate());
        entity.setLastUpdatedDate(model.getLastUpdatedDate());
        return entity;
    }
}
