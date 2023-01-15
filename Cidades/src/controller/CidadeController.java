package controller;

import model.Cidade;

import java.util.List;

public interface CidadeController {
    void cadastrar(Cidade cidade);
    List<Cidade> listar();

}
