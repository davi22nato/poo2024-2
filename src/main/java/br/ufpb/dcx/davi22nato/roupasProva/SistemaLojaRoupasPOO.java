package br.ufpb.dcx.davi22nato.roupasProva;

import java.util.HashMap;
import java.util.Map;

public class SistemaLojaRoupasPOO implements SistemaLojaRoupas {
    private Map<String, Roupa> roupasMap;


    public SistemaLojaRoupasPOO() {
        this.roupasMap = new HashMap<>();
    }

    @Override
    public void cadastraRoupa(String codigoRoupa, String descricao, Tamanho tamanho, int quantidade) throws RoupaJaExisteException {
        if (this.roupasMap.containsKey(codigoRoupa)) {
            throw new RoupaJaExisteException("Roupa já cadastrada: " + codigoRoupa);
        } else {
            Roupa roupa = new Roupa(codigoRoupa, descricao, tamanho, quantidade);
            this.roupasMap.put(codigoRoupa, roupa);
        }
    }

    public Roupa pesquisaRoupa(String codigoRoupa) throws roupaInexistenteExcepition {
        if (this.roupasMap.get(codigoRoupa) == null) {
            throw new roupaInexistenteException("Roupa com o codigo" + codigoRoupa + "Não existe");
        } else {
            return this.roupasMap.get(codigoRoupa);
        }
    }
    public int pesquisaQuantidadeDeRoupasNoEstoque(String codigoRoupa) throws RoupaInexistenteException{
        if(!this.roupasMap.containsKey(codigoRoupa)){
            throw new RoupaInexistenteException("Roupa inexistente");
        } else {
            return this.roupasMap.get(quantidade);
        }
    }
}

