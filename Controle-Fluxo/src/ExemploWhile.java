import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double ValorDoce = valorAleatorio();
            if (ValorDoce > mesada) 
            ValorDoce = mesada;
            
            System.out.println("Valor do doce: " + ValorDoce + " Adicionado ao carrinho");
            mesada = mesada - ValorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Jõazinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
