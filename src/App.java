
import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda mBusqueda1 = new MetodosBusqueda();
        ShowConsole showConsole = new ShowConsole();
        mBusqueda1.buaquedaLineal( 5);

        
        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };

        String name = "Juan";
        Persona resultadoPer = mBusqueda1.busPersonByName(personas,name);
        showConsole.showPersonResult(resultadoPer, name);

        // Busqueda edad impar y mayor a 25
        Persona resultPersona2 = mBusqueda1.findPersonaByAgeAndImpar(personas,25);
        showConsole.showPersonResult2(resultadoPer, 25);

        
        Persona resulPersona3 =mBusqueda1.findPersonaByValueName(personas, 498);
    }
}
