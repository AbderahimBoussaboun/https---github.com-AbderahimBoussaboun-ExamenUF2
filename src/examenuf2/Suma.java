
package examenuf2;
 

public class Suma {
    int num1;
    int num2;
    
    public Suma(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int sumar(int num1, int num2){
        return num1+num2;
    }

    public int getNum1(int num1, int num2){
        return num1;
    }

    public int sumaValorAbsolut(int num1, int num2){
        return java.lang.Math.abs(num1+num2);
    }
}
