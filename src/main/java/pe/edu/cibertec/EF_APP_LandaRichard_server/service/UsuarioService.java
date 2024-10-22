package pe.edu.cibertec.EF_APP_LandaRichard_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.EF_APP_LandaRichard_server.model.Usuario;
import pe.edu.cibertec.EF_APP_LandaRichard_server.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public Usuario registerUser(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }

    public Usuario findByCodigo(String codigo) {
        return usuarioRepository.findByCodigo(codigo);
    }
}
