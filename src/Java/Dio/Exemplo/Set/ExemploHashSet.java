package Java.Dio.Exemplo.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        //Não Garante Ordem de Inserção

        Set<Double> notasAlunos = new HashSet<>(); //Cria o set

        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        //Retorna a Quantidade de itens no set
        System.out.println(notasAlunos.size());

        //Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        System.out.println("Utilizando iterator");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Utilizando for each");
        for (Double nota : notasAlunos){
            System.out.println("---->" + nota);
        }

        notasAlunos.clear();

        //Retorna se o set está vazio ou não;
        System.out.println(notasAlunos.isEmpty());

    }
}
