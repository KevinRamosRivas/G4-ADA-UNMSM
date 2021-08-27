
package AlgoritmosRetroceso.AplicaciónModificadaSumSubconjuntos;

import javax.swing.JOptionPane;

public class Backtracking {
    
    private int s[];
    private int v[];
    private int tact;
    private int contador = 0;
    private int p;
    
    public Backtracking(int valores[], int suma){
        
        v = new int[valores.length];
        s = new int[valores.length];
        v = valores;
        tact = 0;
        p = suma;
        
    }
    
    public void hallarSubconjunto(){
        String mensaje = "";
        int nivel = 0;
        int a=0;
        int cont = 0;
        //Inicializa arreglo solución s
        for(int i=0; i<s.length;i++)
            s[i] = -1;
       
        mensaje = "Valores:\n{";

        for(int i=0; i<v.length; i++){
            mensaje += v[i];
            if(i<v.length-1)
                mensaje += ", ";
            else
                mensaje += "}";
        }

        System.out.println(mensaje);
        
        do{
            //System.out.println(cont);
            
            if(s[nivel]==1 && nivel==0){
                
            }else{
                generar(nivel);
            }
            
            if(solucion(nivel, p)){     
                mostrarSolucion();
            }
            if(criterio(nivel, p)){
                    nivel++;
            }else{
                while(!masHermanos(nivel) && nivel>0 && tact!=77){
                    nivel = retroceder(nivel);             
                }
            }
        }while(tact!=77);
    }
    
    public void generar(int nivel){
        s[nivel] = s[nivel] + 1;
        if(s[nivel]==1)
            tact = tact + v[nivel];
    }
    
    public boolean solucion(int nivel, int p){
        int n = s.length;
        if(nivel==n-1 && tact==p){
            contador++;//contador cuenta el número de soluciones
        }
        return(nivel==n-1 && tact==p);
        
    }
    
    public boolean criterio(int nivel, int p){
        int n = s.length;
        return(nivel<n-1 && tact<=p);
    }
    
    public boolean masHermanos(int nivel){
        return(s[nivel]<1);
    }
    
    public int retroceder(int nivel){
        if(s[nivel]==1){
            tact -= v[nivel];
        }
        s[nivel] = -1;
        nivel--;
        return nivel;
    }
    
    public void mostrarSolucion(){
        
        String mensaje = "";

            mensaje += "\n\nSolución Backtracking:\n{";

        for(int i=0; i<s.length; i++){
            mensaje += s[i];
            if(i<s.length-1)
                mensaje += ", ";
            else
                mensaje += "}";
        }
        mensaje += "\n\nSubconjunto cuya suma es " + p + "\n{";

        for(int i=0; i<s.length; i++){
            if(s[i]==1){
                mensaje += v[i];
                if(i<s.length-1)
                    mensaje +=", ";
                else
                    mensaje +="}\n";
            }
        }
        System.out.println(mensaje);
            
    }
    
    public void existeSol(){
        if(contador!=0){//si contador es igual 0 entonces no hay solución
        }else{
            System.out.println("No hay solución");
        }
    }
}