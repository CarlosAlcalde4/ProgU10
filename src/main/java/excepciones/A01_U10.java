package excepciones;
import java.util.Scanner;

public class A01_U10 {
    public static Integer leerNumero(){
       Scanner sc=new Scanner(System.in);
       Integer numero=null;
        while(true){
            System.out.println("Dime un numero entero");
            String n=sc.nextLine();
            try{
                numero=Integer.parseInt(n);
                break;
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return numero;
    }
    public static void main(String[]Args){
        leerNumero();
    }
}
