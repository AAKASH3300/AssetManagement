package com.task.asset.controller;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.*;
import com.task.asset.service.AssetService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/assets")
@SecurityRequirement(name = "bearerAuth")
public class AssetController {

    @Autowired
    private AssetService assetService;

    //-----------------------------------------Create-----------------------------------------
    @PostMapping("/{category}")
    public Object createAsset(@PathVariable String category, @RequestBody Object asset) {
        switch (category) {
            case "electronics":
                return assetService.createElectronics((Electronics) asset);
            case "furnitures":
                return assetService.createFurnitures((Furnitures) asset);
            case "consumables":
                return assetService.createConsumables((Consumables) asset);
            case "accessories":
                return assetService.createAccessories((Accessories) asset);
            case "license":
                return assetService.createLicense((License) asset);
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

    //-----------------------------------------List-----------------------------------------

    @GetMapping("/{category}")
    public List<?> getAllAssets(@PathVariable String category) throws CommonException, NoDataPresentException {
        switch (category) {
            case "electronics":
                return assetService.getAllElectronics();
            case "furnitures":
                return assetService.getAllFurnitures();
            case "consumables":
                return assetService.getAllConsumables();
            case "accessories":
                return assetService.getAllAccessories();
            case "license":
                return assetService.getAllLicense();
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

    //-----------------------------------------GetById-----------------------------------------

    @GetMapping("/{category}/{id}")
    public Object getAssetById(@PathVariable String category, @PathVariable Integer id) {
        switch (category) {
            case "electronics":
                return assetService.getElectronicsById(id);
            case "furnitures":
                return assetService.getFurnituresById(id);
            case "consumables":
                return assetService.getConsumablesById(id);
            case "accessories":
                return assetService.getAccessoriesById(id);
            case "license":
                return assetService.getLicenseById(id);
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

    //-----------------------------------------Update-----------------------------------------

    @PutMapping("/{category}/{id}")
    public Object updateAsset(@PathVariable String category, @PathVariable Integer id, @RequestBody Object updatedAsset) {
        switch (category) {
            case "electronics":
                return assetService.updateElectronics(id, (Electronics) updatedAsset);
            case "furnitures":
                return assetService.updateFurnitures(id, (Furnitures) updatedAsset);
            case "consumables":
                return assetService.updateConsumables(id, (Consumables) updatedAsset);
            case "accessories":
                return assetService.updateAccessories(id, (Accessories) updatedAsset);
            case "license":
                return assetService.updateLicense(id, (License) updatedAsset);
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

    //-------------------------------Delete-----------------------------------------

    @DeleteMapping("/{category}/{id}")
    public void deleteAsset(@PathVariable String category, @PathVariable Integer id) {
        switch (category) {
            case "electronics":
                assetService.deleteElectronics(id);
                break;
            case "furnitures":
                assetService.deleteFurnitures(id);
                break;
            case "consumables":
                assetService.deleteConsumables(id);
                break;
            case "accessories":
                assetService.deleteAccessories(id);
                break;
            case "license":
                assetService.deleteLicense(id);
                break;
            default:
                throw new IllegalArgumentException("Invalid category: " + category);
        }
    }
}


