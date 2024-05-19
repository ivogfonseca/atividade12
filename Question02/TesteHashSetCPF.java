package Question02;

import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        
        HashSet<String> cpfs = new HashSet<>();

         Scanner scanner = new Scanner(System.in);

         System.out.println("Digite 10 CPFs:");
        for (int i = 0; i < 10; i++) {
            System.out.print("CPF " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            cpfs.add(cpf);
        }

        System.out.println("\nAdicionando alguns CPFs repetidos:");
        System.out.print("Digite um CPF repetido: ");
        String cpfRepetido = scanner.nextLine();
        cpfs.add(cpfRepetido);
        cpfs.add(cpfRepetido);
    
    System.out.println("\nConteúdo do HashSet:");
        for(String cpf : cpfs) {
            System.out.println(cpf);
        }
        scanner.close();
        
    }   

    
    
}
