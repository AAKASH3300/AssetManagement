package com.task.asset.service;

import com.task.asset.persistance.*;


import java.util.List;


public interface AssetService {

    //--------------------------Create--------------------------

    Electronics createElectronics(Electronics electronics);

    Furnitures createFurnitures(Furnitures furnitures);

    Consumables createConsumables(Consumables consumables);

    Accessories createAccessories(Accessories accessories);

    License createLicense(License license);

    //--------------------------List--------------------------

    List<Electronics> getAllElectronics();

    List<Furnitures> getAllFurnitures();

    List<Consumables> getAllConsumables();

    List<Accessories> getAllAccessories();

    List<License> getAllLicense();

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
