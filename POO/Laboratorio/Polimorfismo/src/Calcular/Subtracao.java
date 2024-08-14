package Calcular;

public class Subtracao extends Operacao {
    
    @Override
    public void calcular(float num1, float num2) {
        float valor;
            
        valor = num1 * num2;
        System.out.println("Você dividiu " + num1 + " - "+ num2);
        System.out.println("Resultando em: "+ valor);
    }
}
