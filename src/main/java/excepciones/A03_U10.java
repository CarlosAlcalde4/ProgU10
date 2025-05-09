package excepciones;
import java.io.*;

public class A03_U10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
             br = new BufferedReader(new FileReader("C:\\Users\\alcal\\Documents\\NetBeansProjects\\U10\\src\\main\\java\\excepciones\\Main.java"));
            String texto =br.readLine();
            while (texto != null) {
                System.out.println(texto);
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
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
