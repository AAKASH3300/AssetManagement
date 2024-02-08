package com.task.asset.persistance.dto;

import com.task.asset.enums.Status;
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
public class FurnituresDTO {

    private Integer id;

    @NotBlank(message = "Vendor code can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "provide a valid vendor code")
    private String itemCode;

    @NotBlank(message = "vendor name can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "provide a valid vendor name")
    private String itemName;

//    @Column(name = "item_image", length = 500)
//    private String itemImage;


    @NotNull
    private Integer subCategoryId;

    @Size(max = 50)
    private String itemBrand;

    @Size(max = 500)
    private String itemDetails;

    @NotNull
    private Integer vendorId;

    @NotNull
    private Date purchaseDate;

    @NotNull
    @Positive
    private Double purchaseCost;

    @NotNull
    @PositiveOrZero
    private Double purchaseQty;

    @NotNull
    private Status status;

    @NotNull
    private Integer createdBy;

    @NotNull
    private Integer lastUpdatedBy;

    @NotNull
    private Date createdDate;

    @NotNull
    private Date lastUpdatedDate;
}
