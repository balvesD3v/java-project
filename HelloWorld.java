public class HelloWorld {
    // Todo conteudo é aqui dentro
    public static void main(String[] args) {
        long dadoDoTipoInt = 10;
        String retornoString = "IS lONG";

        if (dadoDoTipoInt == 10)  {
            System.out.println(retornoString);
        } else {
            System.out.println("ISN'T LONG");
        }

        int valor = 0;
        while (valor < dadoDoTipoInt) {
            valor += 1;
            System.out.println("valor " + valor);
        }

    }
}
