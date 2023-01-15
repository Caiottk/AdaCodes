package controller.impl;

import controller.CidadeController;
import model.Cidade;

import java.util.ArrayList;

public class CidadeArmazenamentoVolatilController implements CidadeController {

    private ArrayList<Cidade> cidades;

    @Override
    public void cadastrar(Cidade cidade) {
        cidades.add(cidade);
    }

    @Override
    public List<Cidade> listar() {
        return new ArrayList<>(cidades.);
    }

    @Override
    public void update(Cidade cidade) {

    }
}
