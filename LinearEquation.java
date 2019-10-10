
package tugas3;

public class LinearEquation {

    private int a,b,d,x,y;
    private double e,f,c,z;

    public LinearEquation(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        x = 0;
        y = 0;
        z = 0;  
    }
    
    public LinearEquation(int a,int b,double c,int d,double e,double f,int x, int y,double z){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f; 
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public double cekSolusi(){
        return ((a*d)-(b*c));
    }
    
    public boolean salah(){
        return cekSolusi() == 0;
    }
    
    public String status(){
        if(salah())
            return "Tidak ada solusi";
        else
            return "Ada solusi";
    }
 
    
}
