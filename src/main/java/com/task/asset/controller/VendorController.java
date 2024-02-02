package com.task.asset.controller;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.Vendor;
import com.task.asset.service.VendorService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/vendor")
@SecurityRequirement(name = "bearerAuth")
public class VendorController {
//
//    @Autowired
//    VendorService vendorService;
//
//    @PostMapping("add")
//    public Vendor postDetails(@RequestBody Vendor vendor){
//
//        return vendorService.addVendor(vendor);
//    }
//    @GetMapping("list")
////    public List<Vendor> getDetails(Vendor vendor) throws CommonException, NoDataPresentException {
////
////        return vendorService.viewVendor();
////    }
}
