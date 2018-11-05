package com.fernandopaniagua.ejercicio5;

public class Ejecutador {
    /*
        CON UN NÚMERO SUFICIENTE DE HILOS Y DE MÁXIMO POR HILOS 
        PODREMOS OBSERVAR QUE EL RESULTADO FINAL NO ES EL ESPERADO
        DEBIDO A UNA CONDICIÓN DE CARRERA.
    */
    private static final long NUM_HILOS = 10;
    private static final int MAXIMO_POR_HILO = 100000;
    public static void main(String[] args) {
        for(int i=0;i<NUM_HILOS;i++){
            new Contador(Integer.toString(i),MAXIMO_POR_HILO).start();
        }
    }
}
