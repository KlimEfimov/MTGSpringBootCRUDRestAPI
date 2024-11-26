package com.example.mtgspringbootcrudrestapi.services;

import com.example.mtgspringbootcrudrestapi.domain.dto.response.ColorResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.request.ColorRequestDTO;
import org.jvnet.hk2.annotations.Service;

import java.util.List;


public interface ColorService {

    ColorResponseDTO save(ColorRequestDTO requestColorDTO);

    ColorResponseDTO get(Long id);

    List<ColorResponseDTO> getAll();

}
