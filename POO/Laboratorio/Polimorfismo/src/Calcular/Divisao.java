package Calcular;

public class Divisao extends Operacao {

    @Override
    public void calcular(float num1, float num2) {
        float valor;

        if (num2 != 0) {
            valor = (num1 / num2);
            System.out.println("Você dividiu " + num1 + " / " + num2);
            System.out.println("Resultando em: "+ valor);
        } else {
            System.out.println("Você dividiu " + num1 + " / "+ num2);
            System.out.println("Impossível dividir por 0.");
        }
    }
}
