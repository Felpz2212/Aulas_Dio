package Java.Dio.Exemplo.Maps;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiaisFifa = new HashMap<String, Integer>(); //Cria um mapa

        //Adiciona os campeões mundiais ao mapa
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Italia", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        //Altera o valor para a chave Brasil
        campeoesMundiaisFifa.put("Brasil", 6); //Método put pode servir para atualizar uma chave se a mesma ja existir

        System.out.println(campeoesMundiaisFifa);

        //Retorna a Aregentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        //Retorna se existe uma chave com o valor frança
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //Remove a chave França
        campeoesMundiaisFifa.remove("França");

        //Retorna se existe uma chave com o valor frança
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //Retorna se existe alguma seleção com 6 titulos
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        //Retorna o tamanho do map
        System.out.println(campeoesMundiaisFifa.size());

        System.out.println(campeoesMundiaisFifa);

        //Navega por todos os itens do mapa
        for (String key : campeoesMundiaisFifa.keySet()){
            System.out.println(key + "--" + campeoesMundiaisFifa.get(key));
        }
    }
}
