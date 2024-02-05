package com.task.asset.controller;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.dto.LicenseDTO;
import com.task.asset.service.LicenseService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/license")
@SecurityRequirement(name = "bearerAuth")

public class LicenseController {

    @Autowired
    LicenseService licenseService;

    @GetMapping(path="/list")
    public ResponseEntity<List<LicenseDTO>> listLicense() throws CommonException, NoDataPresentException {
        return new ResponseEntity<>(licenseService.listLicense(), HttpStatus.OK);
    }

    @PostMapping(path="/create")
    public ResponseEntity<LicenseDTO> addLicense(@Valid @RequestBody LicenseDTO license){

        licenseService.addLicense(license);
        return  new ResponseEntity<>(license,HttpStatus.OK);
    }

    @PutMapping(path="/update/{licId}")
    public ResponseEntity<String> updateLicense(@PathVariable String licId){
        return  ResponseEntity.ok("Success" + licId);
    }

    @DeleteMapping(path="/delete/{licId}")
    public ResponseEntity<String> deleteLicense(@PathVariable String licId){
        return  ResponseEntity.ok("Success" + licId);
    }

}
