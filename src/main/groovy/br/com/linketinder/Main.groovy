package br.com.linketinder

import br.com.linketinder.controller.MenuController
import br.com.linketinder.model.Dados
import br.com.linketinder.view.Menu

static void main(String[] args) {
    // Arthur Lopes

    Dados model = new Dados()
    Menu view = new Menu()
    MenuController controller = new MenuController(model, view)
    controller.iniciar()
}