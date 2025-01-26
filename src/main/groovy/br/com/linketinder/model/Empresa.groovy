package br.com.linketinder.model

import br.com.linketinder.model.Impl.PessoaImpl

class Empresa extends PessoaImpl {
    String cnpj
    String pais
    List<String> competencias

    Empresa(String nome, String email, String cnpj, String pais, String estado, String cep, String descricao, List<String> competencias) {
        super(nome, email, estado, cep, descricao)
        this.cnpj = cnpj
        this.pais = pais
        this.competencias = competencias
    }
}
