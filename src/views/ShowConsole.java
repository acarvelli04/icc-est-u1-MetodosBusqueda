package views;
import models.Persona;
//import com.sun.jdi.Value;

public class ShowConsole {

    public ShowConsole(){

    }

    public void printArray(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
            
        }
        System.out.println();
    
    }

    public void printResult(int resul1,int value) {
        if (resul1==-1) {
            System.out.println("Error--> No se encontro el numero: " + value);
        }else{
            System.out.println("Se encontro el numero" + value +  " en la posicion: " + (resul1+1));
        }
    }

    public void printResult2(Integer resul4,int value){
        if (resul4==null) {
            System.out.println("Error--> No se encontro el numero: " + value);
        }else{
            System.out.println("Se encontro el numero" + value +  " en la posicion: " + (resul4+1));
        }
    }

    public void showPersonResult(Persona resultadoPer,String name){
        if (resultadoPer == null) {
            System.out.println("Error--> No se encontro la persona " + name);
        } else {
            System.out.println("Se encontro la persona: " + name);

        }
    }

    public void showPersonResult2(Persona resultadoPer,int age){
        if (resultadoPer == null) {
            System.out.println("Error--> No se encontro la persona " + age);
        } else {
            System.out.println("Se encontro la persona: " + age);

        }
    }

    public void showPersonResult3(Persona resultadoPer,int value, boolean valorNombre){
        if (resultadoPer == null) {
            System.out.println("Error--> No se encontro la persona con el valor: " + value);
        } else {
            if (valorNombre) {
                System.out.println("Se encontro la persona con el valor en el nombre: " + value + " La persona es: " + resultadoPer.getName());
            } else {
                System.out.println("Se encontro la persona con el valor en la edad: " + value);
            }

        }
    }


}
