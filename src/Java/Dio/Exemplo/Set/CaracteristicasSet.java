package Java.Dio.Exemplo.Set;

public class CaracteristicasSet {

        //possui os métodos padrôes da java.util.collections

        /*HashSet
       ->Quando utilizar: Quando não é necessário manter uma ordenação
       ->Ordenação: Não é ordenado;
       ->Performace: Por não ter repetição de valores e não ser ordenado, é a implementação mais performática;
        */

        /*LinkedHashSet
        ->Quando utilizar: Quando é ecessário mater a ordem de inserção dos elementos
        ->Ordenação: Mantém a ordem de inserção dos elementos;
        ->Performace: É a implementação mais lenta por ser necessário manter a ordem;
        */

        /* TreeSet
       ->Quando Utilizar: Quando é necessário alterar a ordem através do uso de comparators;;
       ->Ordenação: Mantém a ordem e pode ser reordenado;
       ->Performace: É performatico para leitura. Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet
        */
}

