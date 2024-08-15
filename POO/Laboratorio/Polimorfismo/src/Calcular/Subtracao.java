package Calcular;

public class Subtracao extends Operacao {
    
    @Override
    public void calcular(float num1, float num2) {
        float valor;
            
        valor = num1 - num2;
        this.mostrar("Você dividiu " + num1 + " - "+ num2);
        this.mostrar("Resultando em: "+ valor);
    }
}
