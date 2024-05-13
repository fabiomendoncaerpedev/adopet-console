package br.com.alura.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class Abrigo {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
}
