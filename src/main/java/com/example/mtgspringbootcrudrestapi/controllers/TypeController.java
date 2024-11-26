package com.example.mtgspringbootcrudrestapi.controllers;

import com.example.mtgspringbootcrudrestapi.domain.dto.request.TypeRequestDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.response.TypeResponseDTO;
import com.example.mtgspringbootcrudrestapi.services.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
@RequiredArgsConstructor
public class TypeController {

    private final TypeService typeService;

    @PostMapping("/save")
    public TypeResponseDTO save(@RequestBody TypeRequestDTO typeRequestDTO){
//        System.out.println("This is a ColorController");
        return typeService.save(typeRequestDTO);
    }

    @GetMapping("/{id}")
    public TypeResponseDTO get(@PathVariable Long id) {
        return typeService.get(id);
    }

    @GetMapping("/all")
    public List<TypeResponseDTO> getAll() {
        return typeService.getAll();
    }

}
