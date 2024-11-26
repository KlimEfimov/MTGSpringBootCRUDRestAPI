package com.example.mtgspringbootcrudrestapi.controllers;

import com.example.mtgspringbootcrudrestapi.domain.dto.response.ColorResponseDTO;
import com.example.mtgspringbootcrudrestapi.domain.dto.request.ColorRequestDTO;
import com.example.mtgspringbootcrudrestapi.services.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/color")
@RequiredArgsConstructor
public class ColorController {

    private final ColorService colorService;

    @PostMapping("/save")
    public ColorResponseDTO save(@RequestBody ColorRequestDTO requestColorDTO){
//        System.out.println("This is a ColorController");
        return colorService.save(requestColorDTO);
    }

    @GetMapping("/{id}")
    public ColorResponseDTO get(@PathVariable Long id){
        return colorService.get(id);
    }

    @GetMapping("/all")
    public List<ColorResponseDTO> getAll() {
        return colorService.getAll();
    }




}
