package br.com.linketinder.view

import br.com.linketinder.model.Candidato
import br.com.linketinder.model.Empresa

class Menu {
    Scanner scanner = new Scanner(System.in)

    void exibirMenu() {
        println "********* Seja bem-vindo ao Linketiner *********"
        println "1. Listar Candidatos"
        println "2. Listar Empresas"
        println "3. Cadastrar Novo Candidato"
        println "4. Cadastrar Nova Empresa"
        println "5. Sair"
        print "Escolha uma opção: "
    }
    void listarCandidatos(List<Candidato> candidatos) {
        println "\nCandidatos Cadastrados:"
        candidatos.each { c ->
            println "************************************************\n" +
                    "Nome: ${c.nome}, \n" +
                    "E-mail: ${c.email}, \n" +
                    "CPF: ${c.cpf}, \n" +
                    "Idade: ${c.idade}, \n" +
                    "Estado: ${c.estado}, \n" +
                    "Competências: ${c.competencias.join(', ')}\n" +
                    "************************************************\n"
        }
        println ""
    }

    void listarEmpresas(List<Empresa> empresas) {
        println "\nEmpresas Cadastradas:"
        empresas.each { e ->
            println "************************************************\n" +
                    "Nome: ${e.nome}, \n" +
                    "E-mail Corporativo: ${e.email}, \n" +
                    "CNPJ: ${e.cnpj}, \n" +
                    "País: ${e.pais}, \n" +
                    "Estado: ${e.estado}, \n" +
                    "Competências: ${e.competencias.join(', ')}\n" +
                    "************************************************\n"
        }
        println ""
    }

    Candidato cadastrarNovoCandidato() {
        println "\nCadastro de Novo Candidato:"
        print "Nome: "
        String nome = scanner.nextLine()
        print "E-mail: "
        String email = scanner.nextLine()
        print "CPF: "
        String cpf = scanner.nextLine()
        print "Idade: "
        int idade = scanner.nextInt()
        scanner.nextLine()
        print "Estado: "
        String estado = scanner.nextLine()
        print "CEP: "
        String cep = scanner.nextLine()
        print "Descrição Pessoal: "
        String descricao = scanner.nextLine()
        print "Competências (separadas por vírgula): "
        List<String> competencias = scanner.nextLine()?.split(',').collect { it.trim() }

        return new Candidato(nome, email, cpf, idade, estado, cep, descricao, competencias)
    }

    Empresa cadastrarNovaEmpresa() {
        println "\nCadastro de Nova Empresa:"
        print "Nome: "
        String nome = scanner.nextLine()
        print "E-mail Corporativo: "
        String email = scanner.nextLine()
        print "CNPJ: "
        String cnpj = scanner.nextLine()
        print "País: "
        String pais = scanner.nextLine()
        print "Estado: "
        String estado = scanner.nextLine()
        print "CEP: "
        String cep = scanner.nextLine()
        print "Descrição da Empresa: "
        String descricao = scanner.nextLine()
        print "Competências Esperadas (separadas por vírgula): "
        List<String> competencias = scanner.nextLine()?.split(',').collect { it.trim() }

        return new Empresa(nome, email, cnpj, pais, estado, cep, descricao, competencias)
    }
}
