package com.example.orderproject.menu.controller;

import com.example.orderproject.menu.dto.MenuDto;
import com.example.orderproject.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/create")
    public void createMenu() {
        menuService.findAll();
    }

    @GetMapping("/findAll")
    public List<MenuDto> findAll() {
        return menuService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMenu(@PathVariable long id) {
        menuService.delete(id);
    }

    @PostMapping("/update/{id}")
    public void updateMenu(@PathVariable long id,@RequestBody MenuDto menuDto) {
        menuService.update(id, menuDto);
    }
}
