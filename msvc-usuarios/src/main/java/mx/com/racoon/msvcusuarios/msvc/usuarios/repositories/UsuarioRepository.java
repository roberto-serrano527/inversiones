package mx.com.racoon.msvcusuarios.msvc.usuarios.repositories;

import mx.com.racoon.msvcusuarios.msvc.usuarios.models.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
