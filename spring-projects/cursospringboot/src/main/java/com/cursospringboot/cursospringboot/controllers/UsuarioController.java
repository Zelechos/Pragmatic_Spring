package com.cursospringboot.cursospringboot.controllers;

import com.cursospringboot.cursospringboot.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @RestController es una versión especializada del controlador. Incluye las anotaciones @Controller y @ResponseBody
 * y , como resultado, simplifica la implementación del controlador
 */
@RestController
public class UsuarioController {

    // Metodo get de REST - Para responder un solo usuario en base al ID
    @RequestMapping(value = "usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario user = new Usuario();
        user.setId(id);
        user.setName("Alex");
        user.setLastname("Aphocraphex");
        user.setEmail("aphocraphex@gmail.com");
        user.setPassword("hacker123");
        user.setPhone("21354365");
        return user;
    }


    // Metodo get de REST - Para responder todos los usuarios de la API
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> users = new ArrayList<>();

        Usuario user = new Usuario();
        user.setId(2L);
        user.setName("Alex");
        user.setLastname("Aphocraphex");
        user.setEmail("aphocraphex@gmail.com");
        user.setPassword("hacker123");
        user.setPhone("21354365");

        Usuario user1 = new Usuario();
        user1.setId(3L);
        user1.setName("ether");
        user1.setLastname("Aphocraphex");
        user1.setEmail("aphocraphex@gmail.com");
        user1.setPassword("hacker123");
        user1.setPhone("21354365");

        Usuario user2 = new Usuario();
        user2.setId(4L);
        user2.setName("hacker");
        user2.setLastname("Aphocraphex");
        user2.setEmail("aphocraphex@gmail.com");
        user2.setPassword("hacker123");
        user2.setPhone("21354365");

        users.add(user);
        users.add(user1);
        users.add(user2);

        return users;
    }



}
