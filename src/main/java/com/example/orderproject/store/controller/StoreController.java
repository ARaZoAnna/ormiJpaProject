package com.example.orderproject.store.controller;

import com.example.orderproject.store.dto.StoreDto;
import com.example.orderproject.store.service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/create")
    public void createStore(@RequestBody StoreDto storeDto) {
        storeService.save(storeDto);
    }

    @GetMapping("/findAll")
    public List<StoreDto> findAll() {
        return storeService.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteStore(@RequestBody StoreDto storeDto) {
        storeService.delete(storeDto);
    }

    @PutMapping("/update/{id}")
    public void updateStore(@PathVariable long id, @RequestBody StoreDto storeDto) {
        storeService.update(id, storeDto);
    }
}
