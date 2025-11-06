package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private int [] arreglo;

    public MetodosBusqueda(){
        this.arreglo = new int[] {10,11,-2,5,6,8,15,22};
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);

        //Buscar 5
        int resul1 = buaquedaLineal(5);
        showConsole.printResult(resul1,5);

        //Buscar -2
        int resul2 = busquedaLinealWhile(-2);
        showConsole.printResult(resul2,-2);

        //Buscar 20
        int resul3 = busquedaLinealWhile(20);
        showConsole.printResult(resul3,20);

        // Buscar 10
        Integer resul4 = busquedaLinealObj(10);
        showConsole.printResult2(resul4,10);
     }

    //Retorna la posicion del valor buscado
    // si no encontro retorna -1
    public int buaquedaLineal(int value){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return i;
            }
        }
        return-1;
    }

    public int busquedaLinealWhile(int value){
        int contador = 0;
        while ( contador < arreglo.length) { 
             if (arreglo[contador] == value) {
                return contador;
            }
            contador++;

        }
        return -1;
    }

    public Integer busquedaLinealObj(int value){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return i;
            }
        }
        return null ;
    }
}
