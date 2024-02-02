package com.task.asset.persistance.conversion;

import com.task.asset.enums.Status;
import com.task.asset.persistance.Vendor;
import com.task.asset.persistance.dto.VendorDTO;

public class VendorMapper {
    public static Vendor convertToEntity(VendorDTO vendorModel) {

        Vendor vendor = new Vendor();

        vendor.setVendorCode(vendorModel.getVendorCode());
        vendor.setVendorName(vendorModel.getVendorName());
        vendor.setEmail(vendorModel.getEmail());
        vendor.setPhone(vendorModel.getPhone());
        vendor.setStatus(Status.ACTIVE);
        vendor.setCreatedDate(vendorModel.getCreatedDate());
        vendor.setLastUpdatedDate(vendorModel.getLastUpdatedDate());
        return vendor;
    }

    public static VendorDTO convertToModel(Vendor vendor){

        VendorDTO vendorModel = new VendorDTO();

        vendorModel.setVendorCode(vendor.getVendorCode());
        vendorModel.setVendorName(vendor.getVendorName());
        vendorModel.setEmail(vendor.getEmail());
        vendorModel.setPhone(vendor.getPhone());
        vendorModel.setCreatedBy(vendor.getCreatedBy());
        vendorModel.setLastUpdatedBy(vendor.getLastUpdatedBy());
        vendorModel.setCreatedDate(vendor.getCreatedDate());
        vendorModel.setLastUpdatedDate(vendor.getLastUpdatedDate());


        return vendorModel;
    }
}
