package pe.edu.cibertec.EF_APP_LandaRichard_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.EF_APP_LandaRichard_server.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCodigo(String codigo);
}
