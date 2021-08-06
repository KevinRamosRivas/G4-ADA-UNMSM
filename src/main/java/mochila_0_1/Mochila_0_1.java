
package mochila_0_1;

public class Mochila_0_1 {

    public static void main(String[] args) {
       
        final int n_objetos = 3;
        final float capacidad = 50;
        
        Objeto[] objetos = new Objeto[n_objetos];
        float[] pesos = {10,20,30};
        int[] valores = {60,100,120};
       
        for(int i=0; i<n_objetos; i++){
            objetos[i] = new Objeto(pesos[i], valores[i]);
        }
        
        Mochila mochila = new Mochila(capacidad);
        
        mochila.llenarMochila(objetos);
        
    }
    
}
