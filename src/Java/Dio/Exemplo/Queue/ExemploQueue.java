package Java.Dio.Exemplo.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {

        //Queue = Segue o conceito de fifo = first in first out;

        Queue<String> filaDebanco = new LinkedList<>();

        filaDebanco.add("Felipe");
        filaDebanco.add("Fabiano");
        filaDebanco.add("Paulo");
        filaDebanco.add("Sérgio");
        filaDebanco.add("Roberto");

        System.out.println(filaDebanco);

        //métodos semelhantes a List vindo da interface Collections, ex: add, remove etc;

        String clienteASerAtendido = filaDebanco.poll(); //método poll, retorna o primeiro valor da fila e o remove em seguida, se a lista estiver vazia retorna null

        System.out.println(clienteASerAtendido);
        System.out.println(filaDebanco);

        //método peek, retona o primeiro valor da lista porém não remove, se a lista estiver vazia retorna null
        //método element, retorna o primeiro valor da lista porém não remove, se a lista estiver vazia retorna uma exceção
    }
}
