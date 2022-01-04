package Java.Dio.Exemplo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Felipe");
        nomes.add("Fabiano");
        nomes.add("Zé");
        nomes.add("Vitinho");

        System.out.println(nomes);

        Collections.sort(nomes); //Biblioteca collections utilizando o metodo sort para organizar em ordem alfabética a lista nome

        System.out.println(nomes);

        nomes.set(2, "Pedro"); //troca o nome na segunda posição por pedro, começando a contagem a partir do 0 = 0, 1, 2

        System.out.println(nomes);

        //método remove, recebe como parametro o indice ou objeto do que será removido ex: nomes.remove(1); ou nomes.remove("Fabiano");

        //método get, recebe como parametro um indice da lista e retorna o valor do indice dentro de uma variável ex: nomes.get(2);

        //método size, retorna qual o tamanho atual da lista dentro de uma váriavel ex: int tamanho = nomes.size();

        //método contains, verifica se o elemento passado como parametro existe ou não na lista retorna um tipo booleano dentro de uma váriavel ex: boolean contem = nomes.contain("Anderson")
    }
}
