package com.crowbellx.todo_list.entity;

import com.crowbellx.todo_list.entity.enums.Prioridade;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "todos")
public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    private boolean realizada;
    @Enumerated(EnumType.ORDINAL)
    private Prioridade prioridade;

    public Todo(String nome, String descricao, boolean realizada, Prioridade prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.realizada = realizada;
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }


}
