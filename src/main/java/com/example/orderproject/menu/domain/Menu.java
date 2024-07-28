package com.example.orderproject.menu.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="menu")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="menu_id")
    private int menu_id;

    @Column(name="menu_name")
    private String menu_name;

    @Column(name="category")
    private String category;

    @Column(name="price")
    private int price;

    @Column(name="details")
    private String details;
}
