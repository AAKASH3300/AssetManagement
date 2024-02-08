package com.task.asset.persistance.dto;

import com.task.asset.enums.Expiration;
import com.task.asset.enums.Ownership;
import com.task.asset.enums.Status;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDateTime;

@Component
@Data
@Getter
@Setter
public class ElectronicsDTO {

    private Integer id;

    @NotBlank(message = "Vendor code can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "provide a valid vendor code")
    private String eleCode;

    @NotBlank
    private Integer subCategoryId;

    @NotBlank(message = "vendor name can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "provide a valid vendor name")
    private String eleName;

    @NotBlank
    private String eleBrand;

    @Size(max = 50)
    @NotBlank
    private String serialNo;

    @Size(max = 500)
    private String eleDetails;

    private Ownership ownership;

    @NotNull
    private Integer vendorId;

    @NotNull
    private Date purchaseDate;

    @NotNull
    @Positive
    private Double purchaseCost;

    private Expiration warranty;

    @PositiveOrZero
    private Integer warrantyPeriod;

    private Date lastMaintenance;

    private Date nextMaintenance;

    private Status status;

    @NotNull
    private Integer createdBy;

    @NotNull
    private Integer lastUpdatedBy;

    @NotNull
    private LocalDateTime createdDate;

    @NotNull
    private LocalDateTime lastUpdatedDate;
}
