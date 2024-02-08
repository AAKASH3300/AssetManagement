package com.task.asset.persistance.dto;

import com.task.asset.enums.Expiration;
import com.task.asset.enums.Status;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.sql.Timestamp;

@Component
@Data
@Getter
@Setter
public class LicenseDTO {
    private Integer id;


    @Size(max = 20)
    @NotBlank(message = "Vendor code can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "provide a valid vendor code")
    private String licCode;

    @NotBlank
    @Size(max = 50)
    private String licType;

    //@Size(max = 500)
    //private String licImage;

    @NotBlank(message = "vendor name can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "provide a valid vendor name")
    @Size(max = 50)
    private String licName;

    @Size(max = 500)
    private String licDetails;

    @NotBlank
    @Size(max = 50)
    private String licBrand;

    @NotBlank
    @Size(max = 50)
    private String licKey;

    @NotNull
    @PositiveOrZero
    private Integer totalSeats;

    @NotNull
    @PositiveOrZero
    private Integer vendorId;

    @PastOrPresent
    private Timestamp purchaseDate;

    @NotNull
    @PositiveOrZero
    private Double purchaseCost;

    @Size(max = 10)
    private Expiration expiration;

    @PositiveOrZero
    private Integer expirationPeriod;

    @PositiveOrZero
    private Integer expirationAlert;

    @NotBlank
    @Size(max = 10)
    private Status status;

    @NotNull
    @Positive
    private Integer createdBy;

    @NotNull
    @Positive
    private Integer lastUpdatedBy;

    @PastOrPresent
    private Timestamp createdDate;

    @PastOrPresent
    private Timestamp lastUpdatedDate;
}
