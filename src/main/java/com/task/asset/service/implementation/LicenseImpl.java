package com.task.asset.service.implementation;

import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.License;
import com.task.asset.persistance.conversion.LicenseMapper;
import com.task.asset.persistance.dto.LicenseDTO;
import com.task.asset.repository.LicenseRepository;
import com.task.asset.service.LicenseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LicenseImpl implements LicenseService {

    static Logger log = LoggerFactory.getLogger(LicenseImpl.class);

    @Autowired
    LicenseRepository licenseRepository;
    @Override
    public LicenseDTO addLicense(LicenseDTO licenseModel) {

        License license = LicenseMapper.convertToEntity(licenseModel);


        log.info("License details being saved :  {}", license);
        licenseRepository.save(license);
        licenseModel = LicenseMapper.convertToModel(license);

        return licenseModel;
    }

    @Override
    public List<LicenseDTO> listLicense() throws NoDataPresentException {

        List<License> license =licenseRepository.findAll();

        List<LicenseDTO> licenseModel = new ArrayList<>();

        if (license.isEmpty()) throw new NoDataPresentException("No License records found ..");
        for (License license1 : license) {
            licenseModel.add(LicenseMapper.convertToModel(license1));
        }

        return licenseModel;
    }
}
