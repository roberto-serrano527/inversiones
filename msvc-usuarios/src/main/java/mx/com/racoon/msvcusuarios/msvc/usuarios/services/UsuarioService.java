package mx.com.racoon.msvcusuarios.msvc.usuarios.services;

import mx.com.racoon.msvcusuarios.msvc.usuarios.models.entities.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Usuario guardar(Usuario usuario);

    Optional<Usuario> buscarPorId(Long id);

    Iterable<Usuario> listar();
}
