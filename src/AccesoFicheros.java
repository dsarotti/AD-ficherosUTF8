import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

/**
 * Gestiona el acceso a ficheros con o sin codificación UTF-8
 * 
 * @author Dante Sarotti
 */
public class AccesoFicheros {
    //Clase no instanciable.
    private AccesoFicheros(){}
    
    /** 
     * Lee un fichero con un FileInputStream y muestra su contenido sin utilizar al codificación UTF8.
     * @param f representación del fichero a leer
     */
    public static void leerSinUTF8(File f){
        InputStreamReader streamReader=null;
        try {
            streamReader = new InputStreamReader(new FileInputStream(f));
            int caracterASCII=0;
            boolean salida=false;
            while (!salida){
                caracterASCII=streamReader.read();
                if(caracterASCII!=-1){
                    System.out.print((char)caracterASCII);
                }else{
                   salida=true;
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("No se encuentra el fichero.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }finally{
            try{
                if(streamReader!=null){
                    streamReader.close();
                }
            }catch(IOException e ){
                System.out.println("Error al cerrar el recurso.");
                e.printStackTrace();
            }
        }
    }


    /** 
     * Escribe en un fichero sin utilizar al codificación UTF8.
     * @param f representación del fichero a escribir.
     * @param textoAEscribir Texto a escribir en el fichero.
     */
    public static void escribirSinUTF8(File f, String textoAEscribir){
        OutputStreamWriter streamWriter = null;
        try{
            streamWriter=new OutputStreamWriter(new FileOutputStream(f));
            streamWriter.write(textoAEscribir);
            System.out.println("Se ha escrito el fichero sin UTF-8");
        }catch(FileNotFoundException e){
            System.out.println("no se encuentra el fichero.");
        }catch(IOException e ){
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }finally{
            try{
                if (streamWriter!=null){
                    streamWriter.close();
                }
            }catch(IOException e){
                System.out.println("Error al cerrar el recurso.");
                e.printStackTrace();
            }
        }
    }


    /** 
     * Lee un fichero con un FileInputStream y muestra su contenido utilizando la codificación UTF8.
     * @param f representación del fichero a leer
     */
    public static void leerConUTF8(File f){
        Reader streamReader=null;
        try {
            streamReader = new InputStreamReader(new FileInputStream(f),"UTF-8");
            int caracterASCII=0;
            boolean salida=false;
            while (!salida){
                caracterASCII=streamReader.read();
                if(caracterASCII!=-1){
                    System.out.print((char)caracterASCII);
                }else{
                   salida=true;
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("No se encuentra el fichero.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }finally{
            try{
                if(streamReader!=null){
                    streamReader.close();
                }
            }catch(IOException e ){
                System.out.println("Error al cerrar el recurso.");
                e.printStackTrace();
            }
        }
    }


    /** 
     * Escribe en un fichero utilizando la codificación UTF8.
     * @param f representación del fichero a escribir.
     * @param textoAEscribir Texto a escribir en el fichero.
     */
    public static void escribirConUTF8(File f, String textoAEscribir){
        OutputStreamWriter streamWriter = null;
        try{
            streamWriter=new OutputStreamWriter(new FileOutputStream(f),"UTF-8");
            streamWriter.write(textoAEscribir);
            streamWriter.flush();
            System.out.println("Se ha escrito el fichero con UTF-8");
        }catch(FileNotFoundException e){
            System.out.println("no se encuentra el fichero.");
        }catch(IOException e ){
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }finally{
            try{
                if (streamWriter!=null){
                    streamWriter.close();
                }
            }catch(IOException e){
                System.out.println("Error al cerrar el recurso.");
                e.printStackTrace();
            }
        }
    }
}