package com.example.mtgspringbootcrudrestapi;

import com.example.mtgspringbootcrudrestapi.controllers.ColorController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

//@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MtgSpringBootCrudRestApiApplicationTests {

    @Autowired
    private ColorController colorController;

    @Test
    void contextLoads() {
        assertThat(colorController).isNotNull();
    }

}
