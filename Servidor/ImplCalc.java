import java.rmi.*;
import java.rmi.server.*;

public class ImplCalc implements Calc{
    @Override
        public double bhaskaraX1(double a, double b, double c) throws RemoteException
        {
            double delta = b * b - 4 * a * c;
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("A primeira raíz da equação é "+x1+"");
            return x1;
        }

    @Override
        public double bhaskaraX2(double a, double b, double c) throws RemoteException
        {
            double delta = b * b - 4 * a * c;
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A segunda raíz da equação é "+x2+"");
            return x2;
        }
}