package com.task.asset.service;

import com.task.asset.enums.EnumExpiration;
import com.task.asset.enums.EnumOwnership;
import com.task.asset.enums.EnumStatus;
import com.task.asset.persistance.Electronics;
import com.task.asset.persistance.Employee;
import com.task.asset.persistance.conversion.ElectronicsMapper;
import com.task.asset.persistance.dto.ElectronicsDTO;
import com.task.asset.repository.EmployeeRepository;
import com.task.asset.service.implementation.AssetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AssetImplTest {

    @InjectMocks
    AssetImpl asset;

    @Mock
    ElectronicsMapper electronicsMapper;
     ElectronicsDTO electronicsDTO =  new ElectronicsDTO();

Employee employee= new Employee();
    Electronics electronics = new Electronics();
    @Mock
    EmployeeRepository employeeRepository;



    @Before
   public void init(){

        electronicsDTO.setEleCode("Ele_101");
        electronicsDTO.setWarranty("YES");
        electronicsDTO.setEleName("Laptop");
        electronicsDTO.setEleBrand("Lenovo");
        electronicsDTO.setEleDetails("Hi");
        electronicsDTO.setLastMaintenance("2024-02-09");
        electronicsDTO.setNextMaintenance("2024-02-10");
        electronicsDTO.setOwnership("OWN");
        electronicsDTO.setStatus("ACTIVE");
        electronicsDTO.setPurchaseCost("500.00");
        electronicsDTO.setWarrantyPeriod("12");
        electronicsDTO.setCreatedBy("Aakash");
        electronicsDTO.setLastUpdatedBy("Aakash");
        electronicsDTO.setCreatedDate("2024-02-09");
        electronicsDTO.setLastUpdatedDate("2024-02-09");
        electronicsDTO.setSerialNo("1asniednni3n44ninei");
        electronicsDTO.setSubCategoryId("1");
        electronicsDTO.setVendorId("2");
        electronicsDTO.setWarranty("YES");
        electronicsDTO.setEmpId("101");
        electronicsDTO.setPurchaseDate("2024-02-09");


        electronics.setEleCode(electronicsDTO.getEleCode());
        electronics.setWarranty(EnumExpiration.valueOf(electronicsDTO.getWarranty()));
        electronics.setEleName(electronicsDTO.getEleName());
        electronics.setEleBrand(electronicsDTO.getEleBrand());
        electronics.setEleDetails(electronicsDTO.getEleDetails());
        electronics.setLastMaintenance(Date.valueOf(electronicsDTO.getLastMaintenance()));
        electronics.setNextMaintenance(Date.valueOf(electronicsDTO.getNextMaintenance()));
        electronics.setEnumOwnership(EnumOwnership.valueOf(electronicsDTO.getOwnership()));
        electronics.setStatus(EnumStatus.valueOf(electronicsDTO.getStatus()));
        electronics.setPurchaseCost(Double.valueOf(electronicsDTO.getPurchaseCost()));
        electronics.setWarrantyPeriod(Integer.valueOf(electronicsDTO.getWarrantyPeriod()));
        electronics.setCreatedBy(electronicsDTO.getCreatedBy());
        electronics.setLastUpdatedBy(electronicsDTO.getLastUpdatedBy());
        electronics.setCreatedDate(Timestamp.valueOf(electronicsDTO.getCreatedDate()));
        electronics.setLastUpdatedDate(Timestamp.valueOf(electronicsDTO.getLastUpdatedDate()));
        electronics.setSerialNo(electronicsDTO.getSerialNo());
        electronics.setSubCategoryId(electronics.getSubCategoryId());
        //electronics.setVendorId(electronicsDTO.getVendorId());
        electronics.setWarranty(EnumExpiration.valueOf(electronicsDTO.getWarranty()));
       // electronics.setEmpId(electronicsDTO.getEmpId());
        electronics.setPurchaseDate(Date.valueOf(electronicsDTO.getPurchaseDate()));
        employee.setId(1);
    }

    @Test
    public void createElectronicsTest(){
       when(electronicsMapper.ModelToEntity(electronicsDTO,employee)).thenReturn(electronics);
//        atLeastOnce().verify(electronicsRepository.save(electronics));
        when(employeeRepository.findById(Integer.valueOf(electronicsDTO.getEmpId()))).thenReturn(Optional.of(employee));
        when(electronicsMapper.convertToModel(electronics)).thenReturn(electronicsDTO);
        asset.createElectronics(electronicsDTO);
        Assert.assertEquals("ELe_101",electronicsDTO.getEleCode());
    }
}
