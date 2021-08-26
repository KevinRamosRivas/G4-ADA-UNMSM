
package AlgoritmosRetroceso.AplicaciónModificadaSumSubconjuntos;

import javax.swing.JOptionPane;

public class Backtracking {
    
    private int s[];
    private int v[];
    private int almacenamiento[][];
    private int num_Sol=0;
    private int tact;
    private int p;
    
    public Backtracking(int valores[], int suma){
        
        v = new int[valores.length];
        s = new int[valores.length];
        almacenamiento = new int[128][7];
        v = valores;
        tact = 0;
        p = suma;
        
    }
    
    public void hallarSubconjunto(){
        int nivel = 0;
        boolean fin = false;
        int a=0;
        
        //Inicializa arreglo solución s
        for(int i=0; i<s.length;i++)
            s[i] = -1;
        
        do{
            generar(nivel);
            if(solucion(nivel, p)){
               // fin = true;
                almacenar(nivel, a);
                a++;                
            }

            if(criterio(nivel, p))
                    nivel++;
            else
                while(!masHermanos(nivel) && (nivel>0))
                    nivel = retroceder(nivel); 
        }while(nivel>0);
    }
    
    public void generar(int nivel){
        s[nivel] = s[nivel] + 1;
        if(s[nivel]==1)
            tact = tact + v[nivel];
    }
    
    public boolean solucion(int nivel, int p){
        int n = s.length;
        return(tact==p);
    }
    
    public boolean criterio(int nivel, int p){
        int n = s.length;
        return(nivel<n-1 && tact<=p);
    }
    
    public boolean masHermanos(int nivel){
        return(s[nivel]<1);
    }
    
    public int retroceder(int nivel){
        tact -= v[nivel]*s[nivel];
        s[nivel] = -1;
        nivel--;
        return nivel;
    }
    
    public void almacenar(int nivel, int a){
        for(int i=0; i<s.length; i++){ 
                almacenamiento[a][i] = s[i];
        }
        num_Sol++;
    }
    public void mostrarSolucion(){
        String mensaje = "";
        
        mensaje = "Valores:\n{";
        
        for(int i=0; i<v.length; i++){
            mensaje += v[i];
            if(i<v.length-1)
                mensaje += ", ";
            else
                mensaje += "}";
        }
        
        if(num_Sol!=0){
            mensaje += "\n\nSolución Backtracking:\n{";
            for(int j=0; j<num_Sol; j++){
                for(int i=0; i<s.length; i++){
                    mensaje += almacenamiento[j][i];
                    if(i<s.length-1)
                        mensaje += ", ";
                    else
                        mensaje += "}\n";
                }
            }


            mensaje += "\n\nSubconjunto cuya suma es  " + p + "\n{";

            for(int j=0; j<num_Sol; j++){
                for(int i=0; i<s.length; i++){
                    if(almacenamiento[j][i]==1){
                        mensaje += v[i];
                        if(i<s.length-1)
                            mensaje +=", ";
                        else
                            mensaje +="}\n";
                    }
                }
            }
            JOptionPane.showMessageDialog(null, mensaje, "Algoritmos de retroceso"
                    + "(Backtracking)", JOptionPane.INFORMATION_MESSAGE);    
        }else{
            mensaje += "\n\nNo hay solución";
            JOptionPane.showMessageDialog(null, mensaje, "Algoritmos de retroceso"
                    + "(Backtracking)", JOptionPane.INFORMATION_MESSAGE);  
        }
        
    }
}
