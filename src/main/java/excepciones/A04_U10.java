package excepciones;
import java.io.*;

public class A04_U10 {
    
    public static void main(String[]Args){
        BufferedReader br = null;
        try {
             br = new BufferedReader(new FileReader("C:\\Users\\alcal\\Documents\\NumerosReales.txt"));
            String texto =br.readLine();
            String[] partes = texto.split(" ");
            double suma=0;
            for(String p:partes){
                suma+= Double.valueOf(p);
            }
            double media = suma/partes.length;
            System.out.println("Suma:  "+suma);
            System.out.println("Media: "+media);
        }catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }
            }catch(IOException ex){
                System.out.println("Nose ha podido cerrar el archivo"+ex.getMessage());
            }
        }
    }
}
