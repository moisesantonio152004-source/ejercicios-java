import java.util.Scanner;


public class Segundoshoras {

public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
   
    int horas ;
    int minutos ;
    int segundos;     
    int sobrante;  
   
    System.out.print("Digite Numero  para saber horas minutos y segundos  : ");
    segundos = teclado.nextInt();
       
 horas = segundos / 3600;
         sobrante = segundos % 3600;

        minutos = sobrante / 60;
        segundos = sobrante % 60;   
  
    
    System.out.println(" RESULTADO :");
        System.out.println("HORAS  : " + horas);
        System.out.println("MINUTOS : " + minutos);
        System.out.println("SEGUNDOS  : " + segundos);

    teclado.close();

    }
}
