import java.text.DecimalFormat;
import java.util.Random;

public class Vendedor {
    private String nome;
    private double vendaValor;
    private double bonificacao;

    private Mercado mercado;

    private final DecimalFormat df = new DecimalFormat("0.00");

    public Vendedor(String nome) {
        this.nome = nome;
        this. vendaValor = Comprador.pagamento();
    }

    public double getVendaValor(){
        return vendaValor;
    }

    public void setBonificacao(double bonificacao){
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "nome = "
                + nome
                + ", bonificação = "
                + df.format(bonificacao)
                +'\n'
                ;
    }
}
