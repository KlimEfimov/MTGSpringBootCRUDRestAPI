package com.example.mtgspringbootcrudrestapi.mappers;

import com.example.mtgspringbootcrudrestapi.domain.dto.request.CardRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.CardResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardMapper {

    Card toEntity(CardRequestDTO cardRequestDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "color.id", target = "colorResponseDTO.id")
    @Mapping(source = "color.name", target = "colorResponseDTO.name")
    @Mapping(source = "type.id", target = "typeResponseDTO.id")
    @Mapping(source = "type.name", target = "typeResponseDTO.name")
    CardResponseDTO toDto(Card card);

}
