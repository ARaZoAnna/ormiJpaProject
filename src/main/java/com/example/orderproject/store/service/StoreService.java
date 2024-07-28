package com.example.orderproject.store.service;

import com.example.orderproject.store.domain.Store;
import com.example.orderproject.store.dto.StoreDto;
import com.example.orderproject.store.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public void save(StoreDto storeDto) {
        Store store = storeDto.toEntity();
        storeRepository.save(store);
    }

    public List<StoreDto> findAll(){
        List<Store> storeList = storeRepository.findAll();
        List<StoreDto> storeDtoList = new ArrayList<>();
        for (Store store : storeList) {
            StoreDto storeDto = new StoreDto(store);
            storeDtoList.add(storeDto);
        }
        return storeDtoList;
    }

    public void delete(StoreDto storeDto) {
        Store store = storeDto.toEntity();
        storeRepository.delete(store);
    }

    public Optional<StoreDto> update(Long id, StoreDto storeDto) {
        Optional<Store> store = storeRepository.findById(id);
        if (store.isPresent()) {
            Store storeToUpdate = store.get();
            storeToUpdate.setStore_name(storeDto.getStore_name());
            storeToUpdate.setStore_address(storeDto.getStore_address());
            storeToUpdate.setStore_phone(storeDto.getStore_phone());
        }
        return Optional.ofNullable(storeDto);
    }

}
