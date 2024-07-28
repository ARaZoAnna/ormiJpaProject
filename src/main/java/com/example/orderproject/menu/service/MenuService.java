package com.example.orderproject.menu.service;

import com.example.orderproject.menu.domain.Menu;
import com.example.orderproject.menu.dto.MenuDto;
import com.example.orderproject.menu.repository.MenuRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    private final MenuRespository menuRespository;

    @Autowired
    public MenuService(MenuRespository menuRespository) {
        this.menuRespository = menuRespository;
    }

    //메뉴 저장
    public void save(MenuDto menuDto) {
        Menu menu = menuDto.toEntity();
        menuRespository.save(menu);
    }

    public List<MenuDto> findAll() {
        List<Menu> menuList = menuRespository.findAll();
        List<MenuDto> menuDtoList = new ArrayList<>();
        for (Menu menu : menuList) {
            MenuDto menuDto = new MenuDto(menu);
            menuDtoList.add(menuDto);
        }
        return menuDtoList;
    }

    public void delete(Long id) {
        menuRespository.deleteById(id);
    }

    public Optional<MenuDto> update(Long id, MenuDto menuDto) {
        Optional<Menu> menu = menuRespository.findById(id);
        if (menu.isPresent()) {
            Menu menuToUpdate = menu.get();
            menuToUpdate.setMenu_name(menuDto.getMenu_name());
            menuToUpdate.setCategory(menuDto.getCategory());
            menuToUpdate.setPrice(menuDto.getPrice());
            menuToUpdate.setDetails(menuDto.getDetails());
        }
        return Optional.ofNullable(menuDto);
    }


}
