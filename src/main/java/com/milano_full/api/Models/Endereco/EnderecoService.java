// package com.milano_full.api.Models.Endereco;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class EnderecoService {
//     @Autowired
//     private EnderecoRepository enderecoRepository;
    
//     public List<Endereco> listarTodos() {
//         return enderecoRepository.findAll();
//     }
    
//     public Optional<Endereco> buscarPorId(Long id) {
//         return enderecoRepository.findById(id);
//     }
    
//     public Endereco salvar(Endereco endereco) {
//         return enderecoRepository.save(endereco);
//     }
    
//     public void deletar(Long id) {
//         enderecoRepository.deleteById(id);
//     }
// }