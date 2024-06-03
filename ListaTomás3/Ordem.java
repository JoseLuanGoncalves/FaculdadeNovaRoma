package ListaTomás3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordem {
    
    public static void main(String[] args) {
        
           List lista = new ArrayList<>() ;
           Scanner sc = new Scanner(System.in);

           for (int i = 0; i <= 9 ; i++) {
                System.out.println(" Insira o valor de número " + (i+1) );
                int NumRap = sc.nextInt();
                lista.add(NumRap);
           }

           lista.sort(null);
           for (int j = 0; j <= 9 ; j++) {
            System.out.print(lista.get(j) + ", " );
           
       }
           
           sc.close();
    }
}
