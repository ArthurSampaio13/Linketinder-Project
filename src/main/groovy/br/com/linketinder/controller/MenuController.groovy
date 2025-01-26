package br.com.linketinder.controller

import br.com.linketinder.model.Candidato
import br.com.linketinder.model.Dados
import br.com.linketinder.model.Empresa
import br.com.linketinder.view.Menu

class MenuController {
    Dados model
    Menu view

    MenuController(Dados model, Menu view) {
        this.model = model
        this.view = view
        model.inicializarDados()
    }

    Scanner scanner = new Scanner(System.in)

    void iniciar() {
        while (true) {
            view.exibirMenu()
            try {
                def opcao = scanner.nextLine().toInteger()

                switch (opcao) {
                    case 1:
                        view.listarCandidatos(model.candidatos)
                        break
                    case 2:
                        view.listarEmpresas(model.empresas)
                        break
                    case 3:
                        Candidato novoCandidato = view.cadastrarNovoCandidato()
                        model.candidatos.add(novoCandidato)
                        println "Candidato cadastrado com sucesso!"
                        break
                    case 4:
                        Empresa novaEmpresa = view.cadastrarNovaEmpresa()
                        model.empresas.add(novaEmpresa)
                        println "Empresa cadastrada com sucesso!"
                        break
                    case 5:
                        println "Saindo do programa. Até mais!"
                        System.exit(0)
                        break
                    default:
                        println "Opção inválida! Tente novamente.\n"
                }
            } catch (Exception e) {
                println "Vocẽ digitou algo não númerico, tente novamente."
            }
        }
    }
}
