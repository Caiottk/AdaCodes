import java.util.ArrayList;

public class Regulador {
    protected static void aplicar(ArrayList<Mercado> mercados) {
        for (Mercado mercado : mercados) {
            ArrayList<Vendedor> vendedores = mercado.getVendedores();
            double meta = mercado.getMeta();
            for (Vendedor vendedor : vendedores) {
                double vendaVendedor = vendedor.getVendaValor();
                if (vendaVendedor >= meta) {
                    vendedor.setBonificacao(0.1 * vendaVendedor);
                }
            }
        }
    }
}
