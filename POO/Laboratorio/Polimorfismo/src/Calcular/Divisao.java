package Calcular;

public class Divisao extends Operacao {

    @Override
    public void calcular(float num1, float num2) {
        float valor;

        if (num2 != 0) {
            valor = (num1 / num2);
            this.mostrar("Você dividiu " + num1 + " / " + num2);
            this.mostrar("Resultando em: "+ valor);
        } else {
            this.mostrar("Você dividiu " + num1 + " / "+ num2);
            this.mostrar("Impossível dividir por 0.");
        }
    }
}
