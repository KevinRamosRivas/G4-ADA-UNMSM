/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosRetroceso.AsignacionTareas;



/**
 *
 * @author USER
 */
public class AsignacionBack {
       static int N = 8; 
   
    
    private int C; 
    private int[][] hxP;
    private int[][] hxT;
    private int[] persona;
    private int[] tarea;
    private int[] txP;
    private int[] pxT;
    private boolean[] E;

    
    
    
    
    public AsignacionBack(int[] m, int[] w, int[][] mp, int[][] wp) {
        C = 0;
        persona = m;
        tarea = w;
        hxP = mp;
        hxT = wp;
        E = new boolean[N]; 
        txP = new int[N]; 
        pxT = new int[N];
       
        for (int i=0; i<N; i++) {
            txP[i] = 0;
            pxT[i] = 0;
        }
        calcMatches();
    }
    
    private void calcMatches() {        
        while (C < N){
            int free;
            for (free = 0; free < N; free++)
                if (!E[free])
                    break;
            
            for (int i = 0; i < N && !E[free]; i++) {
                int index = personaIndexOf(hxP[free][i]); 
                if (txP[index] == 0) {
                    txP[index] = persona[free];  
                    E[free] = true; 
                    C++; 
                }
                else {
                    int currentPartner = txP[index];
                    if (pref(currentPartner, persona[free], index)) {
                        txP[index] = persona[free];
                        E[free] = true;
                        E[tareaIndexOf(currentPartner)] = false;
                    }
                }
            }            
        }
        mostrarresultados();   
    } 
    

    private int personaIndexOf(int hxT) {
        for (int i = 0; i < N; i++)
            if (persona[i] == hxT)
                return i;
        return -1; 
    }

    private int tareaIndexOf(int hxP) {
        for (int i = 0; i < N; i++)
            if (tarea[i] == hxP)
                return i;
        return -1;
    }
    
    private boolean pref(int curPartner, int newPartner, int index) {
        for (int i = 0; i < N; i++) {
            if (hxT[index][i] == newPartner)
                return true;
            if (hxT[index][i] == curPartner)
                return false;
        }
        return false;
    }
    

    
    public void mostrarresultados() {
        int m = 1;
        int value;
        int[] temp = new int[N];
        System.out.println("Personas óptimas para las tareas: ");       
        do {
            for (int i=0; i<N; i++) {
                if (txP[i] == m) {
                    temp[i] = i+1;
                    value = temp[i];
                    pxT[m-1] = value;
                    System.out.print(pxT[m-1] + " ");
                    m++;
                }               
            }            
        }while(m<N);
        System.out.println("");
        
        
        System.out.println("Tareas óptimas para las personas: ");
        for (int i = 0; i < N; i++){
            System.out.print(txP[i] +" ");
        }        
        System.out.println("");
        
        
    }
    
}
