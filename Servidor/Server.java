import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplCalc{
    public Server(){}
    public static void main(String[] args){
        try{
            ImplCalc obj = new ImplCalc();
            Calc stub = (Calc) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Calc", stub);
            System.err.println("Servidor Pronto!");
        } catch (Exception e){
            System.err.println("ERRO no Servidor (Exception): " + e.toString());
            e.printStackTrace();
        }
    }
}