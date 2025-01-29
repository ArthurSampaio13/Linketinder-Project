package linketinder

import br.com.linketinder.model.Candidato
import br.com.linketinder.model.Dados
import spock.lang.Specification

class MenuControllerTest extends Specification {
    def "Opção 3 deve adicionar novo model de candidato"() {
        given:
        Dados dados = new Dados()
        dados.inicializarDados()

        Candidato candidato = new Candidato(
                "Teste", "teste@email.com", "11122233344",
                25, "SP", "12345-678", "Descrição", ["Java"]
        )

        when:
        dados.candidatos.add(candidato)

        then:
        dados.candidatos.size() == 6
        dados.candidatos.last().nome == "Teste"
    }
}
