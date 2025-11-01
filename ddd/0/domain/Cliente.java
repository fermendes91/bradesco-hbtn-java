package com.techcamps.domain;

public class Cliente {
    private final String id;
    private final String nome;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // getters e setters
}