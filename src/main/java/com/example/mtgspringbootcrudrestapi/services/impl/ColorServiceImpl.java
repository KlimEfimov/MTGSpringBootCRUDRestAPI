package com.example.mtgspringbootcrudrestapi.services.impl;

import com.example.mtgspringbootcrudrestapi.domain.dto.response.ColorResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.request.ColorRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.entity.Color;
import com.example.mtgspringbootcrudrestapi.mappers.ColorMapper;
import com.example.mtgspringbootcrudrestapi.repositories.ColorRepository;
import com.example.mtgspringbootcrudrestapi.services.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {

    private final ColorMapper colorMapper;
    private final ColorRepository colorRepository;

    @Override
    public ColorResponseDTO save(ColorRequestDTO requestColorDTO) {
//        System.out.println("This is ColorServiceImpl 1");
        Color c = colorMapper.toEntity(requestColorDTO);
//        System.out.println(c);
        Color color = colorRepository.save(c);
//        System.out.println("This is ColorServiceImpl 3");
        return colorMapper.toDto(color);
    }

    @Override
    public ColorResponseDTO get(Long id) {
        Color c = colorRepository.findById(id).orElseThrow();
        return colorMapper.toDto(c);
    }

    @Override
    public List<ColorResponseDTO> getAll() {
        List<Color> colors = colorRepository.findAll();
        return colors.stream().map(colorMapper::toDto).toList();
    }

    private boolean isAlreadySaved(){
        return false;
    }

    private void demo() {

    }


}
