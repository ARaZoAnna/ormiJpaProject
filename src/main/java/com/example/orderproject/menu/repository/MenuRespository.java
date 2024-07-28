package com.example.orderproject.menu.repository;

import com.example.orderproject.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRespository extends JpaRepository<Menu, Long> {
    //public Long Save(Menu menu);

    //public List<Menu> findAll();

    //public void deletebyId(Long id);
}
