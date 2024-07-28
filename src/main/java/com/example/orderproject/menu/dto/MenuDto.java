package com.example.orderproject.menu.dto;

import com.example.orderproject.menu.domain.Menu;
import jakarta.persistence.Column;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuDto {
    @NotNull
    private String menu_name;

    @NotNull
    private String category;

    @NotNull
    private int price;

    @NotNull
    private String details;

    public Menu toEntity(){
        return Menu.builder()
                .menu_name(menu_name)
                .category(category)
                .price(price)
                .details(details)
                .build();
    }

    public MenuDto(Menu menu){
        this.menu_name = menu.getMenu_name();
        this.category = menu.getCategory();
        this.price = menu.getPrice();
        this.details = menu.getDetails();
    }

}
