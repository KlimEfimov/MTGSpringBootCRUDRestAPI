package com.example.mtgspringbootcrudrestapi.controllers;

import com.example.mtgspringbootcrudrestapi.domain.dto.response.CardResponseDTO;
import com.example.mtgspringbootcrudrestapi.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/card")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;


    @GetMapping("/{id}")
    public CardResponseDTO get(@PathVariable Long id) {
        System.out.println("This is CardController");
        return cardService.get(id);
    }




}
