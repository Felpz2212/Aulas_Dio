package Java.Dio.Exemplo.Set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        //No caso a seguir a ordenação e árvore foi feita de forma alfabética

        TreeSet<String> treeCapitais = new TreeSet<>(); //Cria o set;

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no dinal da árvore;
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a rimeira capital no final da árvore removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);
    }
}
