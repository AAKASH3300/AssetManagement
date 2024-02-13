package com.task.asset.persistance.conversion;

import com.task.asset.enums.EnumStatus;
import com.task.asset.persistance.License;
import com.task.asset.persistance.dto.LicenseDTO;
import org.springframework.stereotype.Component;

@Component
public class LicenseMapper {
    public static License convertToEntity(LicenseDTO licenseModel) {

        License license = new License();

        license.setId(licenseModel.getId());
        license.setLicCode(licenseModel.getLicCode());
        license.setLicType(licenseModel.getLicType());
        //license.setLicImage(licenseModel.getLicImage());
        license.setLicName(licenseModel.getLicName());
        license.setLicDetails(licenseModel.getLicDetails());
        license.setLicBrand(licenseModel.getLicBrand());
        license.setLicKey(licenseModel.getLicKey());
        license.setTotalSeats(licenseModel.getTotalSeats());
        license.setVendorId(licenseModel.getVendorId());
        license.setPurchaseDate(licenseModel.getPurchaseDate());
        license.setPurchaseCost(licenseModel.getPurchaseCost());
        license.setExpiration(licenseModel.getExpiration());
        license.setExpirationPeriod(licenseModel.getExpirationPeriod());
        license.setExpirationAlert(licenseModel.getExpirationAlert());
        license.setCreatedDate(licenseModel.getCreatedDate());
        license.setLastUpdatedDate(licenseModel.getLastUpdatedDate());
        license.setStatus(EnumStatus.valueOf(String.valueOf(EnumStatus.ACTIVE)));
        license.setCreatedDate(licenseModel.getCreatedDate());
        license.setLastUpdatedDate(licenseModel.getLastUpdatedDate());
        return license;
    }

    public static LicenseDTO convertToModel(License license) {
        LicenseDTO licenseDTO = new LicenseDTO();
        licenseDTO.setId(license.getId());
        licenseDTO.setLicCode(license.getLicCode());
        licenseDTO.setLicType(license.getLicType());
        //licenseDTO.setLicImage(license.getLicImage());
        licenseDTO.setLicName(license.getLicName());
        licenseDTO.setLicDetails(license.getLicDetails());
        licenseDTO.setLicBrand(license.getLicBrand());
        licenseDTO.setLicKey(license.getLicKey());
        licenseDTO.setTotalSeats(license.getTotalSeats());
        licenseDTO.setVendorId(license.getVendorId());
        licenseDTO.setPurchaseDate(license.getPurchaseDate());
        licenseDTO.setPurchaseCost(license.getPurchaseCost());
        licenseDTO.setExpiration(license.getExpiration());
        licenseDTO.setExpirationPeriod(license.getExpirationPeriod());
        licenseDTO.setExpirationAlert(license.getExpirationAlert());
        licenseDTO.setStatus(EnumStatus.valueOf(String.valueOf(license.getStatus())));
        licenseDTO.setCreatedBy(license.getCreatedBy());
        licenseDTO.setLastUpdatedBy(license.getLastUpdatedBy());
        licenseDTO.setCreatedDate(license.getCreatedDate());
        licenseDTO.setLastUpdatedDate(license.getLastUpdatedDate());
        return licenseDTO;
    }
}
