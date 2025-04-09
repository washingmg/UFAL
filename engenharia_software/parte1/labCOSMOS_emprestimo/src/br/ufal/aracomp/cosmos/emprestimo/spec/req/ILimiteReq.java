package br.ufal.aracomp.cosmos.emprestimo.spec.req;

import br.ufal.aracomp.cosmos.emprestimo.spec.dt.DTUsuario;

public interface ILimiteReq {
	public double estimarLimite(DTUsuario usuario);
}
