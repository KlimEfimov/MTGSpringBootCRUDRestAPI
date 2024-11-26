package com.example.mtgspringbootcrudrestapi.services;

import com.example.mtgspringbootcrudrestapi.domain.dto.request.CardRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.CardResponseDTO;

public interface CardService {

    CardResponseDTO get(Long id);

    CardResponseDTO save(CardRequestDTO requestDTO);

    CardResponseDTO update(CardRequestDTO requestDTO);

    Long delete(Long id);

}
