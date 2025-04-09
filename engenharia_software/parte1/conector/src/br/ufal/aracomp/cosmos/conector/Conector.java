package br.ufal.aracomp.cosmos.conector;

import br.ufal.aracomp.cosmos.emprestimo.spec.dt.DTUsuario;
import br.ufal.aracomp.cosmos.emprestimo.spec.req.ILimiteReq;
import br.ufal.aracomp.cosmos.limite.spec.dt.DTCliente;
import br.ufal.aracomp.cosmos.limite.spec.prov.ILimiteOps;

public class Conector implements ILimiteReq {
    
    private final ILimiteOps limiteOps;

    public Conector(ILimiteOps limiteOps) {
        this.limiteOps = limiteOps;
    }

    @Override
    public double estimarLimite(DTUsuario usuario) {
        try {
            double rendimento = Double.parseDouble(usuario.rendimentos());
            DTCliente cliente = new DTCliente(rendimento);
            return limiteOps.calcularLimite(cliente);
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter rendimento: " + e.getMessage());
            return 0;
        }
    }
}
