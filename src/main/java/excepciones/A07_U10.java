package excepciones;
import java.io.*;

public class A07_U10 {
    public static void main(String[]Args){
        FileWriter fw=null;
        try{
            fw=new FileWriter("C:\\Users\\alcal\\Documents\\NumerosReales.txt");
            String linea1="En un lugra de la Mancha,\n";
            for(int i=0;i<linea1.length();i++){
                fw.write(linea1.charAt(i));
            String linea2 = "de cuyo nombre no quiero acordarme";
            fw.write(linea2);
            }
        }catch (IOException ex) {
            System.out.println("Error al escribir: " + ex.getMessage());
        } 
        finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
            
}
