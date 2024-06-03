package ListaTomás3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Par {
    
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>(); 
        List<Integer> listaPar = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i <= 9; i++) {
            System.out.println("Insira o valor de número " + (i + 1));
            int NumRap = sc.nextInt();
            lista.add(NumRap);
        }
        
        for (int i = 0; i <= 9; i++) {
            if (lista.get(i) % 2 == 0) {
                listaPar.add(lista.get(i));
            }
        }
        
        System.out.println("Números pares:");
        for (int j = 0; j < listaPar.size(); j++) {
            System.out.print(listaPar.get(j) + " ");
        }
        
        sc.close();
    }
}

