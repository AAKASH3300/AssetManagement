package com.task.asset.service.implementation;

import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.*;
import com.task.asset.persistance.conversion.*;
import com.task.asset.persistance.dto.*;
import com.task.asset.repository.*;
import com.task.asset.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssetImpl implements AssetService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ElectronicsMapper electronicsMapper;
    @Autowired
    FurnitureMapper furnitureMapper;
    @Autowired
    ConsumablesMapper consumablesMapper;
    @Autowired
    AccessoryMapper accessoryMapper;
    @Autowired
    LicenseMapper licenseMapper;
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
    public ElectronicsDTO createElectronics(ElectronicsDTO electronicModel) {
        Employee employee = employeeRepository.findById(Integer.valueOf(electronicModel.getEmpId())).orElse(null);
        Electronics electronics = electronicsMapper.ModelToEntity(electronicModel, employee);
        electronicsRepository.save(electronics);
        electronicModel = electronicsMapper.convertToModel(electronics);
        return electronicModel;
    }

    @Override
    public FurnituresDTO createFurnitures(FurnituresDTO furnitureModel) {
        Furnitures furnitures = furnitureMapper.convertToEntity(furnitureModel);
        furnitureRepository.save(furnitures);
        return furnitureMapper.convertToModel(furnitures);
    }

    @Override
    public ConsumablesDTO createConsumables(ConsumablesDTO consumablesModel) {
        Consumables consumables = consumablesMapper.convertToEntity(consumablesModel);
        consumablesRepository.save(consumables);
        consumablesModel = consumablesMapper.convertToModel(consumables);
        return consumablesModel;
    }

    @Override
    public AccessoriesDTO createAccessories(AccessoriesDTO accessoriesModel) {
        Accessories accessories = accessoryMapper.convertToEntity(accessoriesModel);
        accessoriesRepository.save(accessories);
        accessoriesModel = accessoryMapper.convertToModel(accessories);
        return accessoriesModel;
    }

    @Override
    public LicenseDTO createLicense(LicenseDTO licenseModel) {
        License license = licenseMapper.convertToEntity(licenseModel);
        licenseRepository.save(license);
        licenseModel = licenseMapper.convertToModel(license);
        return licenseModel;
    }

    //--------------------------List--------------------------

    @Override
    public List<ElectronicsDTO> getAllElectronics() throws NoDataPresentException {
        List<Electronics> electronics = electronicsRepository.findAll();

        List<ElectronicsDTO> electronicsModel = new ArrayList<>();

        if (electronics.isEmpty()) throw new NoDataPresentException("No Electronics records found ..");
        for (Electronics electronic : electronics) {
            electronicsModel.add(electronicsMapper.convertToModel(electronic));
        }

        return electronicsModel;
    }

    @Override
    public List<FurnituresDTO> getAllFurnitures() throws NoDataPresentException {
        List<Furnitures> furnitures = furnitureRepository.findAll();

        List<FurnituresDTO> furnitureModel = new ArrayList<>();

        if (furnitures.isEmpty()) throw new NoDataPresentException("No Furnitures records found ..");
        for (Furnitures furniture : furnitures) {
            furnitureModel.add(furnitureMapper.convertToModel(furniture));
        }

        return furnitureModel;
    }

    @Override
    public List<ConsumablesDTO> getAllConsumables() throws NoDataPresentException {
        List<Consumables> consumables = consumablesRepository.findAll();

        List<ConsumablesDTO> consumablesDTO = new ArrayList<>();

        if (consumables.isEmpty()) throw new NoDataPresentException("No Consumabels records found ..");
        for (Consumables consumable : consumables) {
            consumablesDTO.add(consumablesMapper.convertToModel(consumable));
        }

        return consumablesDTO;
    }

    @Override
    public List<AccessoriesDTO> getAllAccessories() throws NoDataPresentException {
        List<Accessories> accessories = accessoriesRepository.findAll();

        List<AccessoriesDTO> accessoriesDTO = new ArrayList<>();

        if (accessories.isEmpty()) throw new NoDataPresentException("No Accessories records found ..");
        for (Accessories accessory : accessories) {
            accessoriesDTO.add(accessoryMapper.convertToModel(accessory));
        }

        return accessoriesDTO;
    }

    @Override
    public List<LicenseDTO> getAllLicense() throws NoDataPresentException {
        List<License> license = licenseRepository.findAll();

        List<LicenseDTO> licenseDTO = new ArrayList<>();

        if (license.isEmpty()) throw new NoDataPresentException("No License records found ..");
        for (License lic : license) {
            licenseDTO.add(licenseMapper.convertToModel(lic));
        }

        return licenseDTO;
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


