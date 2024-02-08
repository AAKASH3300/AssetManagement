package com.task.asset.persistance.conversion;

import com.task.asset.enums.Status;
import com.task.asset.persistance.Consumables;
import com.task.asset.persistance.dto.ConsumablesDTO;

public class ConsumablesMapper {
    public static ConsumablesDTO convertToModel(Consumables entity) {
        ConsumablesDTO model = new ConsumablesDTO();
        model.setId(entity.getId());
        model.setCsCode(entity.getCsCode());
        model.setSubCategoryId(entity.getSubCategoryId());
        model.setCsName(entity.getCsName());
        // model.setCsImage(entity.getCsImage()); // Uncomment if needed
        model.setCsBrand(entity.getCsBrand());
        model.setCsDetails(entity.getCsDetails());
        model.setPurchaseDate(entity.getPurchaseDate());
        model.setVendorId(entity.getVendorId());
        model.setPurchaseCost(entity.getPurchaseCost());
        model.setPurchaseQty(entity.getPurchaseQty());
        model.setMinimumQty(entity.getMinimumQty());
        model.setNotifyTo(entity.getNotifyTo());
        model.setNotifyWhen(entity.getNotifyWhen());
        model.setStatus(Status.valueOf(entity.getStatus().name()));
        model.setCreatedBy(entity.getCreatedBy());
        model.setLastUpdatedBy(entity.getLastUpdatedBy());
        model.setCreatedDate(entity.getCreatedDate());
        model.setLastUpdatedDate(entity.getLastUpdatedDate());
        return model;
    }

    public static Consumables convertToEntity(Consumables model) {
        Consumables entity = new Consumables();
        entity.setId(model.getId());
        entity.setCsCode(model.getCsCode());
        entity.setSubCategoryId(model.getSubCategoryId());
        entity.setCsName(model.getCsName());
        // entity.setCsImage(model.getCsImage()); // Uncomment if needed
        entity.setCsBrand(model.getCsBrand());
        entity.setCsDetails(model.getCsDetails());
        entity.setPurchaseDate(model.getPurchaseDate());
        entity.setVendorId(model.getVendorId());
        entity.setPurchaseCost(model.getPurchaseCost());
        entity.setPurchaseQty(model.getPurchaseQty());
        entity.setMinimumQty(model.getMinimumQty());
        entity.setNotifyTo(model.getNotifyTo());
        entity.setNotifyWhen(model.getNotifyWhen());
        entity.setStatus(Status.valueOf(model.getStatus().name()));
        entity.setCreatedBy(model.getCreatedBy());
        entity.setLastUpdatedBy(model.getLastUpdatedBy());
        entity.setCreatedDate(model.getCreatedDate());
        entity.setLastUpdatedDate(model.getLastUpdatedDate());
        return entity;
    }
}
