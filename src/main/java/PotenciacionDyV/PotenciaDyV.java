/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PotenciacionDyV;

/**
 *
 * @author Adriana Balceda 
 */
 public class PotenciaDyV {
 
 public static int contador = 0;
 public static int potencia(int a,int n){
     contador ++;
        int r;
        if(n==0){
        return 1;
        }
        else 
            if(n%2!=0){
            r=potencia(a,n-1);
            return (a*r);
            }
            else{
                r=potencia(a,n/2);
                return (r*r);
            }

    }

    
 
    public static int vecesEjecutado(){
        return contador;
    }

    public static void setContador(int contador) {
        PotenciaDyV.contador = contador;
    }
    
}

