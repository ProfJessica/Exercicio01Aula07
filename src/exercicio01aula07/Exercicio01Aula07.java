package exercicio01aula07;
import java.util.Scanner;
//Construa em Java, um programa que receba uma letra e informe se é vogal ou 
// consoante.

public class Exercicio01Aula07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = input.next();
        
        
       switch(letra) {
           case "a":
           case "e":
           case "i":
           case "o":
           case "u":
           case "A":
           case "E":
           case "I":
           case "O":
           case "U":
               System.out.println("Essa letra é uma vogal.");
               break;
           default:
               System.out.println("Essa letra é uma consoante.");           
       }


    }
    
}
