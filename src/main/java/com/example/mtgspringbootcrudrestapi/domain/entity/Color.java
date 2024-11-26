package com.example.mtgspringbootcrudrestapi.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "color")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString //delete
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @UniqueElements
    @Column(unique=true)
    private String name;

}
