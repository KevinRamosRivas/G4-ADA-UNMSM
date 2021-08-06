/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDivideVenceras.MultiplicacionEnterosGrandes;

/**
 *
 * @author ramos
 */
public class multiplicarNumGrandes {
    public static int contador = 0;
    public static int multiplica(int x, int y){
        contador++;
        int n = Math.max(tamaño(x),tamaño(y));
        if(n==1){
            return x*y;
        }
        else{
            int s = n /2;
            int xi = (int) (x /Math.pow(10, s));
            int xd = (int) (x % Math.pow(10, s));
            int yi = (int) (y /Math.pow(10, s));
            int yd = (int) (y % Math.pow(10, s));
            int p1 = multiplica(xi,yi);
            int p2 = multiplica(xi,yd);
            int p3 = multiplica(xd,yi);
            int p4 = multiplica(xd,yd);
            
            return (int)(p1*Math.pow(10,2*s)+ (p2+p3)*Math.pow(10, s)+p4);
        }
        
    }
    public static int tamaño(int num){
        int nCifras = 0;
        while(num > 0){
            num = num / 10;
            nCifras = nCifras + 1;
        }
        return nCifras;
    }
    public static int vecesEjecutado(){
        return contador;
    }

    public static void setContador(int contador) {
        multiplicarNumGrandes.contador = contador;
    }
    
}

