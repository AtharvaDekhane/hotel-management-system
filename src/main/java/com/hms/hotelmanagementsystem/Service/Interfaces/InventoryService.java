package com.hms.hotelmanagementsystem.Service.Interfaces;

import com.hms.hotelmanagementsystem.Dto.HotelPriceDTO;
import com.hms.hotelmanagementsystem.Dto.HotelSearchRequest;
import com.hms.hotelmanagementsystem.Dto.InventoryDTO;
import com.hms.hotelmanagementsystem.Dto.UpdateInventoryRequestDTO;
import com.hms.hotelmanagementsystem.Entity.RoomEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {
    void initializeRoomForAYear(RoomEntity room);

    void deleteAllInventories(RoomEntity room);

    Page<HotelPriceDTO> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDTO> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDTO updateInventoryRequestDto);
}
