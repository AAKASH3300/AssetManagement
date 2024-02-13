package com.task.asset.persistance.dto;

import com.task.asset.enums.EnumStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Data
@Getter
@Setter
public class ConsumablesDTO {

    private Integer id;
    @NotBlank(message = "Vendor code can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "provide a valid vendor code")
    private String csCode;

    private Integer subCategoryId;
    @NotBlank(message = "vendor name can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "provide a valid vendor name")
    private String csName;

//    @Column(name = "cs_image", length = 500)
//    private String csImage;

    private String csBrand;

    private String csDetails;

    private Date purchaseDate;

    private Integer vendorId;

    private Double purchaseCost;

    private Double purchaseQty;

    private Integer minimumQty;

    private Integer notifyTo;

    private String notifyWhen;

    private EnumStatus status;

    private Integer createdBy;

    private Integer lastUpdatedBy;


    private Date createdDate;

    private Date lastUpdatedDate;
}
