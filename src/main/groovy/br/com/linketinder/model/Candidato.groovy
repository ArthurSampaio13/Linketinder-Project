package br.com.linketinder.model

import br.com.linketinder.model.Impl.PessoaImpl

class Candidato extends PessoaImpl {
    String cpf
    int idade
    List<String> competencias

    Candidato(String nome, String email, String cpf, int idade, String estado, String cep, String descricao, List<String> competencias) {
        super(nome, email, estado, cep, descricao)
        this.cpf = cpf
        this.idade = idade
        this.competencias = competencias
    }
}
