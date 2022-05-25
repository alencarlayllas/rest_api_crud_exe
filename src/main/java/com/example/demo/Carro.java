package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/// Carro vai usar @Entity pois é uma entidade que vai ser salvo no banco.
@Entity
///Data class lombok (para facilitar)
@Data
/// Colocando construtor com parâmentros e sem parâmetros com lombok:
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String macra;
    String modelo;
    Integer ano;
}
