package com.riwi.ecommerce.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    private String lastName;

    private String document;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Bill> bills = new ArrayList<>();
}
