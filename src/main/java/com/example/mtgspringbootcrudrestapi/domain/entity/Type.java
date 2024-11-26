package com.example.mtgspringbootcrudrestapi.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

}
