package app;

import controller.singleton.AgendaController;
import view.AgendaView;

public class Main {
    public static void main(String[] args) {
        AgendaController controller = AgendaController.getInstance();
        AgendaView view = new AgendaView(controller);
        view.mostrarMenu();
    }
}
