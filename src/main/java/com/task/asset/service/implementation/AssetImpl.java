package com.task.asset.service.implementation;

import com.task.asset.persistance.*;
import com.task.asset.repository.*;
import com.task.asset.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetImpl implements AssetService {

    @Autowired
    private ElectronicsRepository electronicsRepository;
    @Autowired
    private FurnituresRepository furnitureRepository;
    @Autowired
    private ConusmablessRepository consumablesRepository;
    @Autowired
    private AccessoriesRepository accessoriesRepository;
    @Autowired
    private LicenseRepository licenseRepository;

    //--------------------------Create--------------------------

    @Override
    public Electronics createElectronics(Electronics electronics) {
        return electronicsRepository.save(electronics);
    }

    @Override
    public Furnitures createFurnitures(Furnitures furnitures) {
        return furnitureRepository.save(furnitures);
    }

    @Override
    public Consumables createConsumables(Consumables consumables) {
        return consumablesRepository.save(consumables);
    }

    @Override
    public Accessories createAccessories(Accessories accessories) {
        return accessoriesRepository.save(accessories);
    }

    @Override
    public License createLicense(License license) {
        return licenseRepository.save(license);
    }

    //--------------------------List--------------------------

    @Override
    public List<Electronics> getAllElectronics() {
        return electronicsRepository.findAll();
    }

    @Override
    public List<Furnitures> getAllFurnitures() {
        return furnitureRepository.findAll();
    }

    @Override
    public List<Consumables> getAllConsumables() {
        return consumablesRepository.findAll();
    }

    @Override
    public List<Accessories> getAllAccessories() {
        return accessoriesRepository.findAll();
    }

    @Override
    public List<License> getAllLicense() {
        return licenseRepository.findAll();
    }

    //--------------------------GetById--------------------------

    @Override
    public Electronics getElectronicsById(Integer id) {
        return electronicsRepository.findById(id).orElse(null);
    }

    @Override
    public Furnitures getFurnituresById(Integer id) {
        return furnitureRepository.findById(id).orElse(null);

    }

    @Override
    public Consumables getConsumablesById(Integer id) {
        return consumablesRepository.findById(id).orElse(null);

    }

    @Override
    public Accessories getAccessoriesById(Integer id) {
        return accessoriesRepository.findById(id).orElse(null);

    }

    @Override
    public License getLicenseById(Integer id) {
        return licenseRepository.findById(id).orElse(null);

    }

    //--------------------------Update--------------------------
    @Override
    public Electronics updateElectronics(Integer id, Electronics updatedElectronics) {
        if (electronicsRepository.existsById(id)) {
            updatedElectronics.setId(id);
            return electronicsRepository.save(updatedElectronics);
        }
        return null;
    }

    @Override
    public Furnitures updateFurnitures(Integer id, Furnitures updatedFurnitures) {
        if (furnitureRepository.existsById(id)) {
            updatedFurnitures.setId(id);
            return furnitureRepository.save(updatedFurnitures);
        }
        return null;
    }

    @Override
    public Consumables updateConsumables(Integer id, Consumables updatedConsumables) {
        if (consumablesRepository.existsById(id)) {
            updatedConsumables.setId(id);
            return consumablesRepository.save(updatedConsumables);
        }
        return null;
    }

    @Override
    public Accessories updateAccessories(Integer id, Accessories updatedAccessories) {
        if (accessoriesRepository.existsById(id)) {
            updatedAccessories.setId(id);
            return accessoriesRepository.save(updatedAccessories);
        }
        return null;
    }

    @Override
    public License updateLicense(Integer id, License updatedLicense) {
        if (licenseRepository.existsById(id)) {
            updatedLicense.setId(id);
            return licenseRepository.save(updatedLicense);
        }
        return null;
    }

    //--------------------------Delete--------------------------
    @Override
    public void deleteElectronics(Integer id) {
        electronicsRepository.deleteById(id);

    }

    @Override
    public void deleteFurnitures(Integer id) {
        furnitureRepository.deleteById(id);

    }

    @Override
    public void deleteConsumables(Integer id) {
        consumablesRepository.deleteById(id);

    }

    @Override
    public void deleteAccessories(Integer id) {
        accessoriesRepository.deleteById(id);

    }

    @Override
    public void deleteLicense(Integer id) {
        licenseRepository.deleteById(id);

    }


}


