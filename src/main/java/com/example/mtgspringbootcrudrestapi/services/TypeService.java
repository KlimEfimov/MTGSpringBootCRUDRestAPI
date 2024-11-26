package com.example.mtgspringbootcrudrestapi.services;

import com.example.mtgspringbootcrudrestapi.domain.dto.request.ColorRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.request.TypeRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.ColorResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.TypeResponseDTO;

import java.util.List;

public interface TypeService {

    TypeResponseDTO save(TypeRequestDTO typeRequestDTO);

    TypeResponseDTO get(Long id);

    List<TypeResponseDTO> getAll();

}
