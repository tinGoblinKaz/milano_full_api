package com.milano_full.api.Controllers.Usuario;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.milano_full.api.Models.Usuario.Usuario;
import com.milano_full.api.Models.Usuario.UsuarioRepository;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String exibirLoginForm() {
        return "login"; // a página login.html
    }

    @PostMapping("/login")
    public String processarLogin(@RequestParam String email,
                                 @RequestParam String senha,
                                 Model model) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(email);

        if (usuario.isPresent() && usuario.get().getSenha().equals(senha)) {
            // Login bem-sucedido
            return "redirect:/index"; // redireciona pra página protegida
        }

        model.addAttribute("erro", "Email ou senha inválidos.");
        return "login"; // volta pra tela de login com erro
    }

}
