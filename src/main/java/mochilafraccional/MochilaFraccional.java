
package mochilafraccional;

public class MochilaFraccional {

    public static void main(String[] args) {
        
        final int n_objetos = 5;
        final float capacidad = 100;
        
        Objeto[] objetos = new Objeto[n_objetos];
        float[] pesos = {10,20,30,40,50};
        int[] valores = {20,30,65,40,55}; 
       
        for(int i=0; i<n_objetos; i++){
            objetos[i] = new Objeto(pesos[i], valores[i]);
        }
        
        Mochila mochila = new Mochila(capacidad);
        
        mochila.llenarMochila(objetos);
        
    }
    
}
