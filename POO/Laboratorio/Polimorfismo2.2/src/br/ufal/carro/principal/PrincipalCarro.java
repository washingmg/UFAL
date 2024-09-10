package br.ufal.carro.principal;

import br.ufal.carro.*;

public class PrincipalCarro {
    public static void main(String[] args) {
        
        Tanque tanque1 = new Tanque(50); 
        IMotor motorFlex = new MotorFlex();
        Carro carroFlex = new Carro("Jetta GLI", "Vermelho", motorFlex, tanque1);

        carroFlex.abastecer(40);
        carroFlex.ligar();
        carroFlex.acelerar(10); 

		System.out.println("-------------------------------------");

        Tanque tanque2 = new Tanque(50); 
        IMotor motorDiesel = new MotorDiesel();
        Carro carroDiesel = new Carro("F-250", "Preta", motorDiesel, tanque2);

        carroDiesel.abastecer(40);
        carroDiesel.ligar();
        carroDiesel.acelerar(10); 
		carroDiesel.desligar();

    }
}
