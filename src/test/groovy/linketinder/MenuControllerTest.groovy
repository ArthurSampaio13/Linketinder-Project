package groovy.br.com.linketinder

import br.com.linketinder.controller.MenuController
import br.com.linketinder.model.Candidato
import br.com.linketinder.model.Dados
import br.com.linketinder.view.Menu
import spock.lang.Specification

class MenuControllerTest extends Specification {
    def "Opção 3 deve adicionar novo model de candidato"() {
        given:
        Dados model = new Dados()
        Menu menu = Mock()
        MenuController controller = new MenuController(model, menu)
        controller.@scanner = new Scanner("3\n5\n")

        Candidato candidato = new Candidato(
                "Candidato Teste",
                "teste@email.com",
                "123456789",
                10,
                "PE",
                "55555555",
                "Candidato Teste",
                ["Java", "Python"]
        )

        when:
        controller.iniciar()

        then:
        2 * menu.exibirMenu()
        1 * menu.cadastrarNovoCandidato() >> candidato
        model.candidatos.size() == 6
        model.candidatos.last() == candidato
    }
}
