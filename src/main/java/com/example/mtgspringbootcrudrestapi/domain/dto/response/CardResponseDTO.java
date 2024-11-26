package com.example.mtgspringbootcrudrestapi.domain.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CardResponseDTO {
    private Long id;

    private String name;

    private ColorResponseDTO colorResponseDTO;

    private TypeResponseDTO typeResponseDTO;
}
