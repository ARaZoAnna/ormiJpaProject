package com.example.orderproject.store.dto;

import com.example.orderproject.store.domain.Store;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class StoreDto {
    @NotNull
    private String store_name;

    @NotNull
    private String store_address;

    @NotNull
    private String store_phone;

    public Store toEntity(){
        return Store.builder()
                .store_name(store_name)
                .store_address(store_address)
                .store_phone(store_phone)
                .build();
    }

    public StoreDto(Store store){
        this.store_name = store.getStore_name();
        this.store_address = store.getStore_address();
        this.store_phone = store.getStore_phone();
    }
}
