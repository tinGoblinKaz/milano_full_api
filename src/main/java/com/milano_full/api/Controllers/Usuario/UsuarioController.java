package com.milano_full.api.Controllers.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.milano_full.api.Models.Usuario.Usuario;
import com.milano_full.api.Models.Usuario.UsuarioRepository;

import jakarta.transaction.Transactional;

@Controller
@RequestMapping("/")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/teste")
    @Transactional
    public String cadastrar(@ModelAttribute Usuario usuario){
        usuarioRepository.save(usuario);
        return "redirect:/teste";
    }
    @GetMapping("/teste")
    public String Visualizar(Model model){
        model.addAttribute("usuario", new Usuario());
        return "teste";
    }

}
