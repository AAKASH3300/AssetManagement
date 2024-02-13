package com.task.asset.persistance.conversion;

import com.task.asset.enums.EnumStatus;
import com.task.asset.persistance.Furnitures;
import com.task.asset.persistance.dto.FurnituresDTO;
import org.springframework.stereotype.Component;

@Component
public class FurnitureMapper {
    public static FurnituresDTO convertToModel(Furnitures entity) {
        FurnituresDTO model = new FurnituresDTO();
        model.setId(entity.getId());
        model.setItemCode(entity.getItemCode());
        model.setItemName(entity.getItemName());
        model.setSubCategoryId(entity.getSubCategoryId());
        model.setItemBrand(entity.getItemBrand());
        model.setItemDetails(entity.getItemDetails());
        model.setVendorId(entity.getVendorId());
        model.setPurchaseDate(entity.getPurchaseDate());
        model.setPurchaseCost(entity.getPurchaseCost());
        model.setPurchaseQty(entity.getPurchaseQty());
        model.setStatus(EnumStatus.valueOf(entity.getStatus().name()));
        model.setCreatedBy(entity.getCreatedBy());
        model.setLastUpdatedBy(entity.getLastUpdatedBy());
        model.setCreatedDate(entity.getCreatedDate());
        model.setLastUpdatedDate(entity.getLastUpdatedDate());
        return model;
    }

    public static Furnitures convertToEntity(FurnituresDTO model) {
        Furnitures entity = new Furnitures();
        entity.setId(model.getId());
        entity.setItemCode(model.getItemCode());
        entity.setItemName(model.getItemName());
        entity.setSubCategoryId(model.getSubCategoryId());
        entity.setItemBrand(model.getItemBrand());
        entity.setItemDetails(model.getItemDetails());
        entity.setVendorId(model.getVendorId());
        entity.setPurchaseDate(model.getPurchaseDate());
        entity.setPurchaseCost(model.getPurchaseCost());
        entity.setPurchaseQty(model.getPurchaseQty());
        entity.setStatus(EnumStatus.valueOf(model.getStatus().name()));
        entity.setCreatedBy(model.getCreatedBy());
        entity.setLastUpdatedBy(model.getLastUpdatedBy());
        entity.setCreatedDate(model.getCreatedDate());
        entity.setLastUpdatedDate(model.getLastUpdatedDate());
        return entity;
    }
}
