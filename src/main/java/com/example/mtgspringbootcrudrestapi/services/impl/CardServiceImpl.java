package com.example.mtgspringbootcrudrestapi.services.impl;

import com.example.mtgspringbootcrudrestapi.domain.dto.request.CardRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.CardResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.entity.Card;
import com.example.mtgspringbootcrudrestapi.mappers.CardMapper;
import com.example.mtgspringbootcrudrestapi.repositories.CardRepository;
import com.example.mtgspringbootcrudrestapi.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    private final CardMapper cardMapper;


    @Override
    public CardResponseDTO get(Long id) {
        System.out.println("This is CardService1");
        Card card = cardRepository.findById(id).orElseThrow(() -> {
            final String message = "No card with id " + id;
            return new RuntimeException(message);
        });
        System.out.println("This is CardService2");
        System.out.println(card);
        return cardMapper.toDto(card);
    }

    @Override
    public CardResponseDTO save(CardRequestDTO requestDTO) {
        Card card = new Card();

//        cardRepository.save();
        return null;
    }

    @Override
    public CardResponseDTO update(CardRequestDTO requestDTO) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }
}
