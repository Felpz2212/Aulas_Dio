package Java.Dio.Exemplo.Set;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        //Preserva a ordem de inserção

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>(); //Cria o set

        //Adiciona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //Remove o numero do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retorna a Quantodade de itens do set
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os itens do iterator
        System.out.println("Utilizando iterator");

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Utilizando for each");

        for(Integer num : sequenciaNumerica){
            System.out.println(num);
        }

        //Retorna se o set esta vazio ou nao;

        System.out.println(sequenciaNumerica.isEmpty());
    }
}
