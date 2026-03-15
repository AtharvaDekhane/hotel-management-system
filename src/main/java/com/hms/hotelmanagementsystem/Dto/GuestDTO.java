package com.hms.hotelmanagementsystem.Dto;

import com.hms.hotelmanagementsystem.Enum.Gender;
import lombok.Data;

@Data
public class GuestDTO {
    private Long id;
    private String name;
    private Gender gender;
    private Integer age;
}
