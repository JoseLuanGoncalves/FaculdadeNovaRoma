package ListaTomás3;

import java.util.Scanner;

public class AhEh {

        public static void main(String[] args) {
            
           int[] lista = new int[5] ;
           Scanner sc = new Scanner(System.in);

           for (int i = 0; i <= lista.length -1; i++) {
                System.out.println(" Insira o valor de número " + (i+1) );
                lista[i] = sc.nextInt();
           }

           for (int j = 0; j <= lista.length -1; j++) {
                System.out.print(lista[j] + ", " );
               
           }
     sc.close();
        }
}