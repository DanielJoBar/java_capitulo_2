import java.util.Scanner;
public class Ejercicio2_5{
    public static void main(String[] args){
    //Se usa la variable float asumiendo que se pueden tener 1.5 euros 
    double euros ;
    double pesetas = 166.386 ;
    Scanner sc = new Scanner(System.in);
     euros =  pesetas/166.386 ;
    System.out.print(pesetas+"pesetas en euros serian : "+(euros)+"   ");
    sc.close();
    }
}

