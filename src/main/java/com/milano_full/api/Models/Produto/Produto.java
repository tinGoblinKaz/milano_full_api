// package com.milano_full.api.Models.Produto;


// import com.milano_full.api.Models.Endereco.Endereco;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToOne;

// @Entity
// public class Produto {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
    
//     private String nome;
//     private String descricao;
//     private Double preco;
    
//     @ManyToOne
//     private Endereco endereco;
    
//     // Getters e Setters
//     public Long getId() {
//         return id;
//     }
    
//     public void setId(Long id) {
//         this.id = id;
//     }
    
//     public String getNome() {
//         return nome;
//     }
    
//     public void setNome(String nome) {
//         this.nome = nome;
//     }
    
//     public String getDescricao() {
//         return descricao;
//     }
    
//     public void setDescricao(String descricao) {
//         this.descricao = descricao;
//     }
    
//     public Double getPreco() {
//         return preco;
//     }
    
//     public void setPreco(Double preco) {
//         this.preco = preco;
//     }
    
//     public Endereco getEndereco() {
//         return endereco;
//     }
    
//     public void setEndereco(Endereco endereco) {
//         this.endereco = endereco;
//     }
// }