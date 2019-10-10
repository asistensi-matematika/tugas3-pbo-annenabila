
package tugas3;
import java.util.Scanner;
public class mainclass {

    public static void main(String[] args) {
        
       Scanner hade = new Scanner(System.in);
       
       LinearEquation hm = new LinearEquation();
       
       System.out.print("Input : ");
       
       hm.setA(hade.nextInt());
       hm.getA();
       
       hm.setB(hade.nextInt());
       hm.getB();
       
       hm.setC(hade.nextDouble());
       hm.getC();
       
       hm.setD(hade.nextInt());
       hm.getD();
       
       hm.setX(hade.nextInt());
       hm.getX();
       
       hm.setY(hade.nextInt());
       hm.getY();
       
       hm.setE(hade.nextDouble());
       hm.getE();
       
       hm.setF(hade.nextDouble());
       hm.getF();
       
       hm.setZ(hade.nextDouble());
       hm.getZ();
       
       System.out.println(" ");
       System.out.println("Output :");
       System.out.println("Sistem Persamaannya:");
       System.out.println(hm.getA()+"x + "+hm.getB()+"y = "+hm.getE());
       System.out.println(hm.getC()+"x + "+hm.getD()+"y = "+hm.getF());
       System.out.println(hm.getX()+"x + "+hm.getY()+"y = "+hm.getZ());
       System.out.println(" ");
       System.out.println("Hasilnya:");
       System.out.println("x = "+(((hm.getE()*hm.getD())-(hm.getB()*hm.getF()))/((hm.getA()*hm.getD())-(hm.getB()*hm.getC())))+" , y = "+(((hm.getA()*hm.getF())-(hm.getE()*hm.getC()))/((hm.getA()*hm.getD())-(hm.getB()*hm.getC()))));
       System.out.println("x = "+(((hm.getE()*hm.getY())-(hm.getB()*hm.getZ()))/((hm.getA()*hm.getY())-(hm.getB()*hm.getX())))+" , y = "+(((hm.getA()*hm.getZ())-(hm.getE()*hm.getX()))/((hm.getA()*hm.getY())-(hm.getB()*hm.getX()))));
       System.out.println("x = "+(((hm.getF()*hm.getY())-(hm.getD()*hm.getZ()))/((hm.getC()*hm.getY())-(hm.getX()*hm.getD())))+" , y = "+(((hm.getC()*hm.getZ())-(hm.getF()*hm.getX()))/((hm.getC()*hm.getY())-(hm.getX()*hm.getD()))));
       
    
    }    
}
