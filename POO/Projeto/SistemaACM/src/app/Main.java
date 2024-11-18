package app;

import controller.singleton.AgendamentoController;
import view.AgendamentoView;

public class Main {
    public static void main(String[] args) {
        AgendamentoController controller = AgendamentoController.getInstance();
        AgendamentoView view = new AgendamentoView(controller);
        view.mostrarMenu();
    }
}
