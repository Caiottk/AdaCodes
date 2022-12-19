import java.util.Random;

public class Comprador {
    protected static double pagamento() {
        Random rd = new Random();
        return rd.nextDouble() * 1000;
    }
}
