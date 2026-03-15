package com.hms.hotelmanagementsystem.Repository;

import com.hms.hotelmanagementsystem.Dto.GuestDTO;
import com.hms.hotelmanagementsystem.Entity.GuestEntity;
import com.hms.hotelmanagementsystem.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}
