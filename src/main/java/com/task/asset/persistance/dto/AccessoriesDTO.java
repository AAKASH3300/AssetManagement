package com.task.asset.persistance.dto;

import com.task.asset.enums.EnumExpiration;
import com.task.asset.enums.EnumOwnership;
import com.task.asset.enums.EnumStatus;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
@Getter
@Setter
public class AccessoriesDTO {

    private Integer id;
    @NotBlank(message = "Accessories code can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Provide a valid Accessories code")
    private String accCode;

    @NotBlank
    private Integer subCategoryId;

    @NotBlank(message = "Accessories name can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Provide a valid Accessories name")
    private String accName;


    @Size(max = 20)
    @NotBlank
    private String accBrand;

    @Size(max = 50)
    @NotBlank
    private String serialNo;

    @Size(max = 500)
    @NotBlank
    private String accDetails;

    private EnumOwnership Ownership;

    @NotNull
    private Integer vendorId;

    @NotNull
    private Date purchaseDate;

    @NotNull
    @Positive
    private Double purchaseCost;

    private EnumExpiration warranty;

    @PositiveOrZero
    private Integer warrantyPeriod;

    private EnumStatus status;

    @NotNull
    private Integer createdBy;

    @NotNull
    private Integer lastUpdatedBy;

    @NotNull
    private Date createdDate;

    @NotNull
    private Date lastUpdatedDate;

}
