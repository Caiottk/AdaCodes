import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String[] vendedores1 = new String[]{
            "Gino Verri-Antonello",
            "Raimondo Petrocelli",
            "Filippa Toninelli",
            "Aria Comboni",
            "Pasquale Mocenigo-Marino",
            "Dott. Ermes Giolitti",
            "Fredo Combi",
            "Carlo Casale-Finetti",
            "Sig. Ruggero Ruggieri",
            "Anita Randazzo",
    };

    private static final String[] vendedores2 = new String[]{
            "Sig.Ciro Carli",
            "Marissa Dossi",
            "Dott.Sabatino Seddio",
            "Paola Verri",
            "Lazzaro Ajello",
            "Loredana Gangemi",
            "Antonina Grassi",
            "Allegra Saffi",
            "Liliana Strangio",
            "Giada Almagià"
    };

    private static final String[] vendedores3 = new String[]{
            "Liana Sismondi",
            "Donatello Monduzzi-Morrocco",
            "Giulietta Tasca",
            "Amanda Branciforte",
            "Elena Abate",
            "Sig.ra Alina Baroffio",
            "Delfino Rocca-Gottardi",
            "Nino Mozart-Sforza",
            "Francesca Zecchini",
            "Sig. Vincenzo Camiscione"
    };

    private static ArrayList<Mercado> mercados = new ArrayList<>();


    public static void main(String[] args) {
        mercados.add(new Mercado("Mercado do Jalin", "Capadocia", criaListaVendedores(vendedores1), 300.0));
        mercados.add(new Mercado("Mercado do Volin", "Bodrum", criaListaVendedores(vendedores2), 500.0));
        mercados.add(new Mercado("Mercado do Rabeii", "Bergama", criaListaVendedores(vendedores1), 700.0));
        Regulador.aplicar(mercados);
        for (Mercado mercado : mercados) {
            System.out.println(mercado);
        }
    }

    public static ArrayList<Vendedor> criaListaVendedores(String[] vendedores) {
        ArrayList<Vendedor> sellers = new ArrayList<>();
        for (String vendedor : vendedores) {
            sellers.add(new Vendedor(vendedor));
        }
        return sellers;
    }
}