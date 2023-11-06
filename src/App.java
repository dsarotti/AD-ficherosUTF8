import java.io.File;

/**
 * Demostración del ejercicio de acceso a ficheros con UTF-8
 */
public class App {
    private static String ruta ="src\\f1.txt";
    private static String textoAEscribir="España, espantapájaros";
    
    public static void main(String[] args) throws Exception {
        System.out.println("El texto a escribir será \"" + textoAEscribir + "\"");

        //Escritura de un fichero con UTF8
        System.out.println("PRUEBA: ESCRITURA CON UTF-8");
        try{
            File f = new File(ruta);
            AccesoFicheros.escribirConUTF8(f,textoAEscribir);
        }catch (NullPointerException e){
            System.out.println("Ha ocurrido un error al inicializar el fichero");
        }
        System.out.println("--------------------------------------");

        //Lectura de un fichero con UTF8
        System.out.println("PRUEBA: LECTURA CON UTF8");
        leerUtf8();
        System.out.println("--------------------------------------");

        //Lectura de un fichero sin UTF8
        System.out.println("PRUEBA: LECTURA SIN UTF8");
        leerSinUtf8();
        System.out.println("--------------------------------------");

        //Espera pulsación de teclado para continuar.
        System.out.println("pulsa una tecla para continuar");
        System.in.read();

        //Escritura de un fichero sin UTF8
        System.out.println("PRUEBA: ESCRITURA SIN UTF8");
        try{
            File f = new File(ruta);
            AccesoFicheros.escribirSinUTF8(f,textoAEscribir);
        }catch (NullPointerException e){
            System.out.println("Ha ocurrido un error al inicializar el fichero");
        }
        System.out.println("--------------------------------------");

        //Lectura de un fichero con UTF8
        System.out.println("PRUEBA: LECTURA CON UTF8");
        leerUtf8();
        System.out.println("--------------------------------------");

        //Lectura de un fichero sin UTF8
        System.out.println("PRUEBA: LECTURA SIN UTF8");
        leerSinUtf8();
        System.out.println("--------------------------------------");
    }

    /**
     * Inicia el proceso de lectura del fichero con UTF8
     */
    public static void leerUtf8(){
        try{
            File f = new File(ruta);
            AccesoFicheros.leerConUTF8(f);
        }catch (NullPointerException e){
            System.out.println("Ha ocurrido un error al inicializar el fichero");
        }finally{
            System.out.println();
        }
    }

    /**
     * Inicia el proceso de lectura del fichero sin UTF8
     */
    public static void leerSinUtf8(){
        try{
            File f = new File(ruta);
            AccesoFicheros.leerSinUTF8(f);
        }catch (NullPointerException e){
            System.out.println("Ha ocurrido un error al inicializar el fichero");
        }finally{
            System.out.println();
        }
    }
}