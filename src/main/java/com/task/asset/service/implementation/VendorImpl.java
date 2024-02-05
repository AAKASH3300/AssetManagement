package com.task.asset.service.implementation;


import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.Vendor;
import com.task.asset.persistance.conversion.VendorMapper;
import com.task.asset.persistance.dto.VendorDTO;
import com.task.asset.repository.VendorRepository;
import com.task.asset.service.VendorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorImpl implements VendorService {
    static Logger log = LoggerFactory.getLogger(VendorImpl.class);

    @Autowired
    VendorRepository vendorRepository;

    public VendorDTO addVendor(VendorDTO vendorModel) {

        Vendor vendor = VendorMapper.convertToEntity(vendorModel);


        log.info("vendor details being saved :  {}", vendor);
        vendorRepository.save(vendor);
        vendorModel = VendorMapper.convertToModel(vendor);


        return vendorModel;
    }

    @Override
    public List<VendorDTO> viewVendor() throws CommonException, NoDataPresentException {
        return null;
    }
}
