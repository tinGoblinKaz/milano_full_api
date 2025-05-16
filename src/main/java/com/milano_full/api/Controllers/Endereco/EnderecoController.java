// package com.milano_full.api.Controllers.Endereco;


// import com.milano_full.api.Models.Endereco.Endereco;
// import com.milano_full.api.Models.Endereco.EnderecoService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;


// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/api/enderecos")
// public class EnderecoController {
//     @Autowired
//     private EnderecoService enderecoService;
    
//     @GetMapping
//     public List<Endereco> listarTodos() {
//         return enderecoService.listarTodos();
//     }
    
//     @GetMapping("/{id}")
//     public ResponseEntity<Endereco> buscarPorId(@PathVariable Long id) {
//         Optional<Endereco> endereco = enderecoService.buscarPorId(id);
//         return endereco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//     }
    
//     @PostMapping
//     public Endereco salvar(@RequestBody Endereco endereco) {
//         return enderecoService.salvar(endereco);
//     }
    
//     @PutMapping("/{id}")
//     public ResponseEntity<Endereco> atualizar(@PathVariable Long id, @RequestBody Endereco endereco) {
//         if (!enderecoService.buscarPorId(id).isPresent()) {
//             return ResponseEntity.notFound().build();
//         }
//         endereco.setId(id);
//         return ResponseEntity.ok(enderecoService.salvar(endereco));
//     }
    
//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> deletar(@PathVariable Long id) {
//         if (!enderecoService.buscarPorId(id).isPresent()) {
//             return ResponseEntity.notFound().build();
//         }
//         enderecoService.deletar(id);
//         return ResponseEntity.noContent().build();
//     }
// }