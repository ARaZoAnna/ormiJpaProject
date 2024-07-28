package com.example.orderproject.store.repository;

import com.example.orderproject.store.domain.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long> {
    //Optional<Store> findByStoreName(String storeName);
    List<Store> findAll();
}
