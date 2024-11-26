package com.example.mtgspringbootcrudrestapi.domain.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ColorResponseDTO {

    private Long id;

    private String name;



}
