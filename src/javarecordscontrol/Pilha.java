package javarecordscontrol;

import java.util.Arrays;
import java.util.Comparator;

public class Pilha<T> {
    private int topo;
    private T[] elementos;

    public Pilha(int tamanho){
        elementos =(T[]) new Object[tamanho];
        this.topo = -1;
    }

    public boolean isFull(){
        return topo == elementos.length - 1;
    }

    public boolean isEmpty(){
        return topo == -1;
    }

    public boolean push(T novoDado){
        if(!this.isFull()){
            elementos[++topo] = novoDado;
            return true;
        }
        return false;
    }

    public T pop(){
        T retorno = elementos[topo];
        topo--;
        return retorno;
    }

    public int size(){
        return topo + 1;
    }

    public T peek(){
        return elementos[topo];
    }

    @Override
    public String toString() {
    if (isEmpty()) {
        return "Pilha vazia";
    }

    StringBuilder retorno = new StringBuilder();
    // Ordenar a pilha antes de exibir os registros
    sort();
    for (int i = 0; i <= topo; i++) {
        retorno.append(elementos[i]).append("\n");
    }
    retorno.append("-----------");
    return retorno.toString();
}

    public void clear() {
        topo = -1;
        elementos = (T[]) new Object[elementos.length];
    }

    public void sort() {
        Arrays.sort(elementos, 0, topo + 1, Comparator.comparingDouble(o -> ((Recorde) o).getTempo()));
    }
}
