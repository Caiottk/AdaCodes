import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Mercado {

    private ArrayList<Vendedor> vendedores;
    private String nome;
    private String local;
    private double vendas;

    private final DecimalFormat df = new DecimalFormat("0.00");

    private double meta;

    public Mercado(String nome, String local, ArrayList<Vendedor> vendedores, double meta) {
        this.vendedores = vendedores;
        this.nome = nome;
        this.local = local;
        this.meta = meta;
        vendas = getVendas();
    }

    public String getLocal() {
        return local;
    }

    public String getNome() {
        return nome;
    }

    public double getVendas() {
        vendas = 0.0;
        for (int i = 0; i < vendedores.size(); i++) {
            vendas += vendedores.get(0).getVendaValor();
        }
        return vendas;
    }

    public double getMeta() {
        return meta;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    @Override
    public String toString() {
        return "Mercado{"
                + "nome do Mercado = "
                + nome
                + '\''
                + ", local = "
                + local
                + '\n'
                + "vendedores: "
                +'\n'
                + vendedores
                + ", valor das vendas totais  = "
                + df.format(vendas)
                + "}";
    }
}
