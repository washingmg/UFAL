package br.ufal.aracomp.cosmos.main;

import br.ufal.aracomp.cosmos.conector.Conector;
import br.ufal.aracomp.cosmos.emprestimo.impl.ComponentFactory;
import br.ufal.aracomp.cosmos.emprestimo.spec.dt.DTUsuario;
import br.ufal.aracomp.cosmos.emprestimo.spec.prov.IEmprestimoOps;
import br.ufal.aracomp.cosmos.emprestimo.spec.prov.IManager;
import br.ufal.aracomp.cosmos.limite.spec.prov.ILimiteOps;

public class Main {
	public static void main(String[] args) {
		// Configuração arquitetural
		
		// Instanciar componente emprestimo
		IManager componenteEmprestimo = ComponentFactory.createInstance();
		
		// Instanciar componente emprestimo
		br.ufal.aracomp.cosmos.limite.spec.prov.IManager componenteLimite = 
		br.ufal.aracomp.cosmos.limite.impl.ComponentFactory.createInstance();
		
		ILimiteOps limiteOps;
		limiteOps = (ILimiteOps) componenteLimite.getProvidedInterface("ILimiteOps");
		
		// Instância do conector
		Conector conn = new Conector(limiteOps);
		
		componenteEmprestimo.setRequiredInterface("ILimiteReq", conn);
		
		// Execução do sistema
		IEmprestimoOps objetoEmprestimoOps = (IEmprestimoOps) componenteEmprestimo.getProvidedInterface("IEmprestimoOps");
		DTUsuario usuario = new DTUsuario("1352.4");
		System.out.println("Limite de Emprestimo " + objetoEmprestimoOps.liberarEmprestimoAutomatico(usuario));
		

		
	}
}
