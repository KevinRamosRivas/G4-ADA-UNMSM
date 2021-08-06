
package AlgoritmosVoraces.mochila_0_1;

import java.util.Arrays;

public class Mochila {
    
    private float capacidad;
    
    public Mochila(float c){
        this.capacidad = c;
    }
    
    void llenarMochila(Objeto[] objetos){
        
        int i=0;
    
        int [] solucion = new int[objetos.length];
        
        Arrays.sort(objetos, new ObjetoComparador());
        
        float pesoMochila = 0;
        float valorMochila = 0;
        
        while((i<objetos.length) && (pesoMochila + objetos[i].getPeso() <= capacidad)){
            
            pesoMochila += (float)objetos[i].getPeso();
            valorMochila += (float)objetos[i].getValor();
            solucion[i] = i;
            i++;
        }
                
        System.out.println("Capacidad de la mochila: " + capacidad);
        System.out.println("Peso de la mochila después del proceso: " + pesoMochila);
        System.out.println("Valor de la mochila después del proceso: " + valorMochila );
        System.out.print("Objetos insertados en la mochila: (Valor , Peso , Valor/Peso) \n");
        for(int j=0; j<i; j++){
            System.out.print("(" + objetos[j].getValor() + " ; " + objetos[j].getPeso() + " ; " + objetos[j].getValorPeso() + ")\n" );
        }
        
    }
    
}
