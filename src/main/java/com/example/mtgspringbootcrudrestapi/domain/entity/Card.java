package com.example.mtgspringbootcrudrestapi.domain.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "card")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString // delete
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String name;


    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private Type type;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

}
