import java.util.Scanner;
public class Ejercicio2_4{
    public static void main(String[] args){
    //Se usa la variable float asumiendo que se pueden tener 1.5 euros 
    Float euros ;
    double pesetas;
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba cuantos euros quiere convertir : ");
    euros = sc.nextFloat();
    pesetas =  euros*166.386 ;
    System.out.print(euros+"€ en pesetas serian : "+(pesetas)+"   ");
    }
}