package com.example.mtgspringbootcrudrestapi.domain.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TypeResponseDTO {

    private Long id;

    private String name;

}
