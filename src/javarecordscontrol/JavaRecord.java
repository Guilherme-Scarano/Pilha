package javarecordscontrol;

public class JavaRecord {

    public static Pilha<Recorde> pilha = new Pilha<>(10);
    public static Pilha<Recorde> pilhaAux = new Pilha<>(10);

    public static void main(String[] args) {
        FormSistema f = new FormSistema();
        f.setVisible(true);
    }
}