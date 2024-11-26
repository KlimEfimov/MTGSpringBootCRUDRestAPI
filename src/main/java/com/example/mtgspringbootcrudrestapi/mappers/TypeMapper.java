package com.example.mtgspringbootcrudrestapi.mappers;

import com.example.mtgspringbootcrudrestapi.domain.dto.request.TypeRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.TypeResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.entity.Type;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeMapper {

    Type toEntity(TypeRequestDTO typeRequestDTO);

    TypeResponseDTO toDto(Type color);

}
