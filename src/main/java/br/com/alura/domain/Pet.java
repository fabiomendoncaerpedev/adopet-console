package br.com.alura.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Pet {
    private Long id;
    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private float peso;
}
