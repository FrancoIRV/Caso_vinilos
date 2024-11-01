import com.avance1.*;
import  java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        ListaVinilos coleccion = new ListaVinilos(new ArrayList<Vinilo>());
        Menu.ejecutarOpcion(coleccion);

    }
}
