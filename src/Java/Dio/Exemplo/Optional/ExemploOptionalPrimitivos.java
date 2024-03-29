package Java.Dio.Exemplo.Optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {

        System.out.println("***Valor inteiro opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor decimal opcional***");
        OptionalDouble.of(9.4).ifPresent(System.out::println);

        System.out.println("***Valor longo Opcional***");
        OptionalLong.of(25L).ifPresent(System.out::println);
    }
}
