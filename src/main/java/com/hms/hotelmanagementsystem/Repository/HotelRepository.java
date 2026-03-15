package com.hms.hotelmanagementsystem.Repository;

import com.hms.hotelmanagementsystem.Entity.HotelEntity;
import com.hms.hotelmanagementsystem.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
    List<HotelEntity> findByOwner(UserEntity user);
}
