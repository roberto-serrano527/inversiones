package mx.com.racoon.msvcusuarios.msvc.usuarios.services;

import mx.com.racoon.msvcusuarios.msvc.usuarios.models.entities.Usuario;
import mx.com.racoon.msvcusuarios.msvc.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository repository;

    @Override
    @Transactional
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Usuario> listar() {
        return (List<Usuario>) repository.findAll();
    }
}
