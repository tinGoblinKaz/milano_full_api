// package com.milano_full.api.Models.Endereco;


// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import java.util.List;

// import com.milano_full.api.Models.Produto.Produto;

// @Entity
// public class Endereco {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
    
//     private String rua;
//     private String cidade;
//     private String estado;
//     private String cep;
    
//     @OneToMany(mappedBy = "endereco")
//     private List<Produto> produtos;
    
//     // Getters e Setters
//     public Long getId() {
//         return id;
//     }
    
//     public void setId(Long id) {
//         this.id = id;
//     }
    
//     public String getRua() {
//         return rua;
//     }
    
//     public void setRua(String rua) {
//         this.rua = rua;
//     }
    
//     public String getCidade() {
//         return cidade;
//     }
    
//     public void setCidade(String cidade) {
//         this.cidade = cidade;
//     }
    
//     public String getEstado() {
//         return estado;
//     }
    
//     public void setEstado(String estado) {
//         this.estado = estado;
//     }
    
//     public String getCep() {
//         return cep;
//     }
    
//     public void setCep(String cep) {
//         this.cep = cep;
//     }
    
//     public List<Produto> getProdutos() {
//         return produtos;
//     }
    
//     public void setProdutos(List<Produto> produtos) {
//         this.produtos = produtos;
//     }
// }