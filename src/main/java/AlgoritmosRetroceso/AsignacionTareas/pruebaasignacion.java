/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking.Asignación;

import static Backtracking.Asignación.AsignacionBack.N;


/**
 *
 * @author USER
 */
public class pruebaasignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int[] personas = {1, 2, 3, 4, 5, 6, 7, 8}; //personas
        int[] tareas = {1, 2, 3, 4, 5, 6, 7, 8}; //tareas
        
        int pp[][] = {
            {7, 2, 6, 5, 1, 3, 8, 4}, //matriz de preferencias de las personas por realizar las tareas
            {4, 3, 2, 6, 8, 1, 7, 5},
            {3, 2, 4, 1, 8, 5, 7, 6},
            {3, 8, 4, 2, 5, 6, 7, 1},
            {8, 3, 4, 5, 6, 1, 7, 2},
            {8, 7, 5, 2, 4, 3, 1, 6},
            {2, 4, 6, 3, 1, 7, 5, 8},
            {6, 1, 4, 2, 7, 5, 3, 8}, 
        };
        int hp[][] = {
            {4, 6, 2, 5, 8, 1, 3, 7}, //matriz de habilidades de las personas para realizar las tareas
            {8, 5, 3, 1, 6, 7, 4, 2},
            {6, 8, 1, 2, 3, 4, 7, 5},
            {3, 2, 4, 7, 6, 8, 5, 1},
            {6, 3, 1, 4, 5, 7, 2, 8},
            {2, 1, 3, 8, 7, 4, 6, 5},
            {3, 5, 7, 2, 4, 1, 8, 6},
            {7, 2, 8, 4, 5, 6, 3, 1}            
        };
        
        
  
        System.out.println("Preferencias de las personas: ");
        for (int i=0; i < N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(pp[i][j] +" ");
            }
            System.out.println("\n");
        }
        
        System.out.println("Habilidades de las personas para realizar las tareas: ");
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(hp[i][j] +" ");
            }
            System.out.println("\n");
        }  
        
    
        
        AsignacionBack bt = new AsignacionBack(personas, tareas, hp, hp);
  
    }
    
}
