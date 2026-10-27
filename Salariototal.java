/*
     Un empleado gana en su salario total mensual $1.056.028, si trabajo un total de
     36 horas, calcular una solución algorítmica que permita imprimir cual es el valor de  una hora trabajada*/
import java.util.Scanner;

public class Salariototal {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    final int SALARIO = 1056028;   
    final int DIAS = 30;
    double horastrab;
    
     System.out.print("Digite las horas Trabajadas: ");
     horastrab = teclado.nextDouble();
           
       
    horastrab = (SALARIO)/(DIAS)*horastrab/24;
    
    System.out.println("valor Horas Trabajadas: " + horastrab );
    teclado.close();
     
    }
}
