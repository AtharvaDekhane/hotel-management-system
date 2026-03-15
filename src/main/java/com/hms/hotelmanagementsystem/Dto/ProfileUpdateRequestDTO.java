package com.hms.hotelmanagementsystem.Dto;

import com.hms.hotelmanagementsystem.Enum.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDTO {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
