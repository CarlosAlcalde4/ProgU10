package excepciones;
import java.io.*;
import java.io.IOException;

public class A02_U10 {
    public static void main(String[]args){
        try{
            FileReader fr= new FileReader("C:\\Users\\alcal\\Documents\\NetBeansProjects\\U10\\src\\main\\java\\excepciones\\Main.java");
            int texto=fr.read();
            while(texto !=-1){
                System.out.print((char)texto);
                texto=fr.read();
            }
            fr.close();
        }catch(IOException ex){
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
}
