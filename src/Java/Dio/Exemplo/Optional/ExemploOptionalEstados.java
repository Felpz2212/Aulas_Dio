package Java.Dio.Exemplo.Optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        /*
        ifPresentOrElse, recebe dois argumentos que resulta em uma expressão lambda
         se o valor do optional estiver presente ele retorna o primeiro argumento
         caso esteja vazio retorna o segundo argumento
         No caso acima: System.out::println, () = primeiro argumento
                        System.out.println("Não está presente") = segundo argumento
        */

        Optional<String> optionalNull = Optional.ofNullable(null);
        /*
            Nullable funciona da mesma forma que o of para construção do optional porém com a diferença de que se o
            método of receber um valor null ele retornara um NullPointerException
            Já o Nullable caso receba um valor null como parametro utilizará o método empty para a construção
            assim evitando o erro.
        */

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional lança erro NullPointerException");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}
