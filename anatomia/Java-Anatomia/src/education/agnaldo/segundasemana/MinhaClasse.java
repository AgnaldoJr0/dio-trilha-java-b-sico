package education.agnaldo.segundasemana;
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Agnaldo";
        String segundoNome = "Leal";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat("").concat(segundoNome);
    }

}