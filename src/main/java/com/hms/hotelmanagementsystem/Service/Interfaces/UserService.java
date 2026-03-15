package com.hms.hotelmanagementsystem.Service.Interfaces;

import com.hms.hotelmanagementsystem.Dto.ProfileUpdateRequestDTO;
import com.hms.hotelmanagementsystem.Dto.UserDTO;
import com.hms.hotelmanagementsystem.Entity.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
