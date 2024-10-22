package pe.edu.cibertec.EF_APP_LandaRichard_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.EF_APP_LandaRichard_server.model.Usuario;
import pe.edu.cibertec.EF_APP_LandaRichard_server.service.UsuarioService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public ResponseEntity<Usuario> registerUser(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.registerUser(usuario), HttpStatus.CREATED);
    }
}
