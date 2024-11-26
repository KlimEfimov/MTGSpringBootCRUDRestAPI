package com.example.mtgspringbootcrudrestapi.mappers;

import com.example.mtgspringbootcrudrestapi.domain.dto.response.ColorResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.request.ColorRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.entity.Color;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ColorMapper {

    Color toEntity(ColorRequestDTO requestColorDTO);

    ColorResponseDTO toDto(Color color);

}
