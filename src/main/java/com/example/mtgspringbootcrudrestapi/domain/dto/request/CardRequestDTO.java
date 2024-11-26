package com.example.mtgspringbootcrudrestapi.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

@Setter
@Getter // delete
public class CardRequestDTO {

    @NotNull
    String name;
    List<String> colors;
    @NotNull
    List<String> types;

}
