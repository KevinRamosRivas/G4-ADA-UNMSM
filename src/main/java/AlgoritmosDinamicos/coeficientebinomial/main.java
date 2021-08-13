package coeficientebinomial;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        
        ModoRecursivo V1 = new ModoRecursivo();
        ModoDinamico V2 = new ModoDinamico();
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese n: ");
        int n = reader.nextInt();
        
        System.out.println("Ingrese k: ");
        int k = reader.nextInt();
        
        System.out.println("\nUTILIZANDO UN ALGORITMO RECURSIVO: ");
        System.out.println("---------------------------------- ");
    
        if (n < 0 || k < 0) {
            System.out.println("n y k deben ser mayores o iguales  que cero");
        }
        
        else if (k > n) {
            System.out.println("n debe ser mayor o igual que k");
        }
        
        else {
            System.out.println("El combinatorio de "+n+" en "+k+" es: "+V1.AlgoritmoRecursivo(n, k));
            System.out.println("Numero de pasos: "+V1.getContador()+"\n");
        }
        
        System.out.println("UTILIZANDO UN ALGORITMO DINAMICO: ");
        System.out.println("--------------------------------- ");
        
        if (n < 0 || k < 0) {
            System.out.printf("n y k deben ser mayores o iguales que cero");
        } 
        
        else if (k > n) {
            System.out.printf("n debe ser mayor o igual que k");
        } 
        
        else {
            V2.AlgoritmoDinamico(n,k);
        }
    }
    
}
