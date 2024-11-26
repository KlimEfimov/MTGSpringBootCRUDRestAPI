package com.example.mtgspringbootcrudrestapi.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@JsonIgnoreProperties(ignoreUnknown = true)

@Setter
@Getter // delete
public class ColorRequestDTO {

    @NotNull
//    @Size(min = 1, max = 30)
//    @Pattern(regexp = REGEX_FIRSTNAME)
    String name;

}
