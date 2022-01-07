package Java.Dio.Exemplo.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("-------------Ordem de inserção--------------");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("--------Ordem de Idade--------------");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("----------Ordem Reversa-------");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparing(Estudante::getIdade)); //Compara os inteiros usando a referencia de idade

        System.out.println("---------Ordem Natural (method reference)-------");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed()); //Compara os inteiros usando a referencia de idade e organiza de forma reversa
        System.out.println("------------Ordem Reversa (Method reference)-----------");
        System.out.println(estudantes);

        Collections.sort(estudantes); //Collections sort funciona pois a classe estudante implementa a interface comparator
        //No método acima a regra de ordenação foi definida na classe estudante dentro do compareTo



        System.out.println("-------------Ordem Collections----------");
        System.out.println(estudantes);

    }
}
