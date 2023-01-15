package controller;

public class CidadeControllerFactory {
    public CidadeController criar(CidadeArmazenamentoTipo tipo) {
        if (tipo == CidadeArmazenamentoTipo.VOLATIL) {
            return new CidadeArmazenamentoVolatilController();
        } else {
            throw new RuntimeException("Nenhuma implementação disponível");
        }
    }
}
