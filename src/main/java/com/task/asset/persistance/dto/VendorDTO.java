package com.task.asset.persistance.dto;

import com.task.asset.enums.EnumStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Component
@Data
@Getter
@Setter
public class VendorDTO {

    @NotBlank
    Integer id;

    @NotBlank(message = "Vendor code can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "provide a valid vendor code")
    String vendorCode;

    @NotBlank(message = "vendor name can not be empty ..")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "provide a valid vendor name")
    String vendorName;

    @NotBlank(message = "Email cannot be empty ..")
    @Pattern(regexp = "^(.+)@(.+)$", message = "Provide a valid email address ..")
    String email;

    @NotBlank(message = "Invalid Phone number: Empty number")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    String phone;

    @NotBlank(message = "Address should not be empty")
    @Size(min = 1, max = 30, message = "Invalid Address: Must be of 3 - 30 characters")
    String address;

    @Size(min = 0, max = 400, message = "Notes can be null or must be of 400 characters")
    String notes;

    EnumStatus status;

    int createdBy;

    int lastUpdatedBy;

    Timestamp createdDate;

    Timestamp lastUpdatedDate;
}
