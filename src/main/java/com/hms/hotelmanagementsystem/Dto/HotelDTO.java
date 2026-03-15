package com.hms.hotelmanagementsystem.Dto;

import com.hms.hotelmanagementsystem.Entity.HotelContactInfo;
import lombok.Data;

@Data
public class HotelDTO {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
