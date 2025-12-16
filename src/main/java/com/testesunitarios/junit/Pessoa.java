package com.testesunitarios.junit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDateTime dataDeNascimento;
    public Pessoa(String nome, LocalDateTime dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDateTime getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDateTime dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.dataDeNascimento, LocalDate.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
