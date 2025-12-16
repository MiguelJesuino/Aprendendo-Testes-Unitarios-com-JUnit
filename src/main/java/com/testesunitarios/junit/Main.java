package com.testesunitarios.junit;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Pessoa miguel = new Pessoa("Miguel", LocalDateTime.of(2006, 1, 18, 2, 30, 10));

        System.out.println(miguel.getIdade());
    }
}
