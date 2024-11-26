package com.example.mtgspringbootcrudrestapi.services.impl;

import com.example.mtgspringbootcrudrestapi.domain.dto.request.TypeRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.ColorResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.TypeResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.entity.Color;
import com.example.mtgspringbootcrudrestapi.domain.entity.Type;
import com.example.mtgspringbootcrudrestapi.mappers.TypeMapper;
import com.example.mtgspringbootcrudrestapi.repositories.TypeRepository;
import com.example.mtgspringbootcrudrestapi.services.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService {

    private final TypeMapper typeMapper;
    private final TypeRepository typeRepository;

    @Override
    public TypeResponseDTO save(TypeRequestDTO typeRequestDTO) {
        Type t = typeMapper.toEntity(typeRequestDTO);
        Type type = typeRepository.save(t);
        return typeMapper.toDto(type);
    }

    @Override
    public TypeResponseDTO get(Long id) {
        Type t = typeRepository.findById(id).orElseThrow();
        return typeMapper.toDto(t);
    }

    @Override
    public List<TypeResponseDTO> getAll() {
        List<Type> types = typeRepository.findAll();
        return types.stream().map(typeMapper::toDto).toList();
    }
}
