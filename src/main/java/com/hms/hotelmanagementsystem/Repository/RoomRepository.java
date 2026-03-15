package com.hms.hotelmanagementsystem.Repository;

import com.hms.hotelmanagementsystem.Entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Long> {
}
