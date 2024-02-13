package com.task.asset.service;

import com.task.asset.exception.CommonException;
import com.task.asset.exception.NoDataPresentException;
import com.task.asset.persistance.*;
import com.task.asset.persistance.dto.*;


import java.util.List;


public interface AssetService {

    //--------------------------Create--------------------------

    ElectronicsDTO createElectronics(ElectronicsDTO electronicModel);

    FurnituresDTO createFurnitures(FurnituresDTO furnitureModel);

    ConsumablesDTO createConsumables(ConsumablesDTO consumables);

    AccessoriesDTO createAccessories(AccessoriesDTO accessories);

    LicenseDTO createLicense(LicenseDTO license);


    //--------------------------List--------------------------

    List<ElectronicsDTO> getAllElectronics() throws NoDataPresentException, CommonException;

    List<FurnituresDTO> getAllFurnitures()throws NoDataPresentException, CommonException;

    List<ConsumablesDTO> getAllConsumables()throws NoDataPresentException, CommonException;

    List<AccessoriesDTO> getAllAccessories()throws NoDataPresentException, CommonException;

    List<LicenseDTO> getAllLicense()throws NoDataPresentException, CommonException;

    //--------------------------GetById--------------------------

    Electronics getElectronicsById(Integer id);

    Furnitures getFurnituresById(Integer id);

    Consumables getConsumablesById(Integer id);

    Accessories getAccessoriesById(Integer id);

    License getLicenseById(Integer id);

    //--------------------------Update--------------------------

    Electronics updateElectronics(Integer id, Electronics updatedElectronics);

    Furnitures updateFurnitures(Integer id, Furnitures updatedFurnitures);

    Consumables updateConsumables(Integer id, Consumables updatedConsumables);

    Accessories updateAccessories(Integer id, Accessories updatedAccessories);

    License updateLicense(Integer id, License updatedLicense);

    //--------------------------Delete--------------------------

    void deleteElectronics(Integer id);

    void deleteFurnitures(Integer id);

    void deleteConsumables(Integer id);

    void deleteAccessories(Integer id);

    void deleteLicense(Integer id);


}
