package com.cursospringboot.cursospringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RestController es una versión especializada del controlador. Incluye las anotaciones @Controller y @ResponseBody
 * y , como resultado, simplifica la implementación del controlador
 */
@RestController
public class UsuarioController {

    @RequestMapping(value = "prueba")
    public List<String> prueba(){
        return List.of("manzana", "banana", "naranja");
    }
}
