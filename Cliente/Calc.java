import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote{
    public double bhaskaraX1(double a, double b, double c) throws RemoteException;
    public double bhaskaraX2(double a, double b, double c) throws RemoteException;
}