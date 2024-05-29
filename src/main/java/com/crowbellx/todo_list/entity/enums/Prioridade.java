package com.crowbellx.todo_list.entity.enums;

public enum Prioridade {
    URGENTE(1),
    NORMAL(2);

    public final int descricao;

    Prioridade(int descricao){
        this.descricao = descricao;
    }
}
