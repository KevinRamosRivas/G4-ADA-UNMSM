/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDinamicos.Floyd;

import java.util.Scanner;

/**
 *
 * @author ramos
 */
public class PruebaFloyd {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int nodo1;
        int nodo2;
        //usamos 1000 en vez de usar infinito
        //para definir la matriz de longitud de aristas
        int l[][] = {
            {0,5,1000,1000},
            {50,0,15,5},
            {30,1000,0,15},
            {15,1000,5,0}
        };
        algoritmoFloyd.metodoFloyd(l,l.length);
        System.out.println("");
        //pedimos al usuario un nodo inicio y final para 
        //mostrar el camino
        System.out.println("Escriba el nodo de inicio");
        nodo1 = entrada.nextInt();
        //validaciones para que el nodo inicio
        //y nodo final no sobrepasen los limites
        while(nodo1<0 || nodo1>4){
            System.out.println("Escriba el nodo de inicio");
            nodo1 = entrada.nextInt();            
        }
        //validaciones para que el nodo inicio
        //y nodo final no sobrepasen los limites
        System.out.println("Escriba el nodo final");
        nodo2 = entrada.nextInt();
        while(nodo2<0 || nodo2>4){
            System.out.println("Escriba el nodo final");
            nodo2 = entrada.nextInt();            
        }
        //invocamos al metodo para que nos muestre el camino
        //entre dos nodos solicitados al usuario
        algoritmoFloyd.mostrarCaminos(nodo1, nodo2);
    }
    
}
