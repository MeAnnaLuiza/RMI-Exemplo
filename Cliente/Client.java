import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;
import java.util.Scanner;

public class Client{
    public Client(){}
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entre com os valores a, b e c, separados por espaço:");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();

        System.out.println("");

        try{
            Registry registry = LocateRegistry.getRegistry("http://localhost", 11378);

            Calc stub = (Calc) Naming.lookup("rmi://localhost/Calc");

            System.out.println("Invocando Métodos Remotos...");
            System.out.println("");

            System.out.println("As raízes da equação são x1="+stub.bhaskaraX1(a, b, c)+" e x2="+stub.bhaskaraX2(a, b, c)+"");
        } catch (Exception e) {
            System.err.println("ERRO no Cliente (Exception): " + e.toString());
            e.printStackTrace();
        }
    }
}