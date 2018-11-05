package com.fernandopaniagua.ejercicio5;

public class Contador extends Thread {
    private static int acumulador = 0;
    private String id;
    private int limite;
    public Contador(String _id, int _limite){
        this.id = _id;
        this.limite = _limite;
    }

    @Override
    public void run() {
        for (int i = 0; i < limite; i++) {
            //COMIENZO DE SECCIÓN CRÍTICA
            acumulador++;
            //FIN DE SECCIÓN CRÍTICA
        }
        //COMIENZO DE SECCIÓN CRÍTICA (NO NOS IMPORTA)
        System.out.println("Ha terminado " + id + ":" + acumulador);
        //FIN DE SECCIÓN CRÍTICA
    }
    
    
}
