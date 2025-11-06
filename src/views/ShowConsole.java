package views;

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
}
