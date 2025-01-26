package br.com.linketinder.model.Impl

import br.com.linketinder.model.Pessoa

abstract class PessoaImpl implements Pessoa{
    String nome
    String email
    String estado
    String cep
    String descricao

    PessoaImpl(String nome, String email, String estado, String cep, String descricao) {
        this.nome = nome
        this.email = email
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
    }

    @Override
    String getNome() {
        return nome
    }

    @Override
    String getEmail() {
        return email
    }

    @Override
    String getEstado() {
        return estado
    }

    @Override
    String getCep() {
        return cep
    }

    @Override
    String getDescricao() {
        return descricao
    }
}
