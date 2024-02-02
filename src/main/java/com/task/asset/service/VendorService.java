package com.task.asset.service;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.dto.EmployeeDTO;
import com.task.asset.persistance.dto.VendorDTO;

import java.util.List;

public interface VendorService {
    VendorDTO addVendor(VendorDTO vendorModel);

    List<VendorDTO> viewVendor() throws CommonException, NoDataPresentException;
}
