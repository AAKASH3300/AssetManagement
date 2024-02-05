package com.task.asset.service;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.dto.LicenseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LicenseService {

    LicenseDTO addLicense(LicenseDTO licenseModel);

    List<LicenseDTO> listLicense() throws CommonException, NoDataPresentException;
}
