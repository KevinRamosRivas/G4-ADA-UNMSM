/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleccionActividades;

/**
 *
 * @author ramos
 */
public class Seleccion {
    public static void seleccionActividades(Actividad s[],Actividad c[]){
        c=ordenar(c);
        int n = c.length;
        s[0]=c[0];
        int i = 1;
        int prev = 0;
        while(i<n){
           Actividad x =c[i];
           if(x.getIni() >= s[prev].getFin()){
               s[prev+1] = x;
               prev = prev + 1;
           }
           i = i+1;
        }
    }
    
    
    public static Actividad[] ordenar(Actividad arreglo[]){
      Actividad auxiliar;
      Actividad [] arregloOrdenado;
      for(int i = 1; i < (arreglo.length-1); i++)
      {
        for(int j = 0;j < (arreglo.length-(i+1));j++)
        {
          if(arreglo[j].getFin() > arreglo[j+1].getFin())
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
