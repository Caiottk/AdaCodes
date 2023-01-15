package view;

import model.Cidade;

import java.util.Scanner;

public class CidadeView {
    private CidadeController controller;
    private Scanner sc;

    public CidadeView(
            CidadeController controller,
            Scanner sc
    ) {
        this.controller = controller;
        this.sc= sc;
    }

    public void cadastrar() {
        Cidade cidade = new Cidade();

        System.out.println("Informe o nome da cidade:");
        String nome = sc.nextLine();
        cidade.setNome(nome);

        System.out.println("Informe o estado:");
        String estado = sc.nextLine();
        cidade.setEstado(estado);

        controller.cadastrar(cidade);
    }

    public void listar() {
        List<Cidade> cidades = controller.listar();
        System.out.println("| Número | Nome        | Data nasc.       | CPF      |");
        for (int index = 0; index < pessoas.size(); index++) {
            System.out.print("| " + (index + 1) + "      ");
            exibirPessoa(pessoas.get(index));
        }
    }

}
