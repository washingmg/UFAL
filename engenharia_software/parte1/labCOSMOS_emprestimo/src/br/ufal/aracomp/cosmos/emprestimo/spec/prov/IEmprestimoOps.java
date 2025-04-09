package br.ufal.aracomp.cosmos.emprestimo.spec.prov;

import br.ufal.aracomp.cosmos.emprestimo.spec.dt.DTUsuario;

public interface IEmprestimoOps {
	public double liberarEmprestimoAutomatico(DTUsuario client);
}
