package mx.com.racoon.msvcusuarios.msvc.usuarios.controllers;

import mx.com.racoon.msvcusuarios.msvc.usuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService service;


}
