/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosRetroceso.mochila0_1;
import java.util.Arrays;
/**
 *
 * @author ramos
 */
public class mochila_0_1{
    private int s[];
    private int p[];
    private int b[];
    private int pact;
    private int bact;
    private int voa;
    private int M;
    private int soa[];
    private boolean bandera;
    public mochila_0_1(int pesos[],int beneficios[],int M){
        p = new int[pesos.length];
        s = new int[pesos.length];
        b = new int[beneficios.length];
        p = pesos;
        b = beneficios;
        pact = 0;
        bact = 0;
        this.M = M;
        voa = -100;
        soa = null;
    }
    
    public void hallarSubconjunto(){
        int nivel = 0;
        for(int i=0;i<s.length;i++){
            s[i]=-1;
        }
        do{
            generar(nivel);
            if(solucion(nivel,M) && (bact > voa)){
                soa = s.clone();
                voa = bact;
            }
            if(criterio(nivel,M)){
                nivel++;
            }
            else{
                while(!masHermanos(nivel)){
                    nivel = retroceder(nivel);
                    if(nivel == -1){
                        break;
                    }
                }
            }
        }while(nivel >= 0);

    }
    
    public void generar(int nivel){
        s[nivel] = s[nivel] + 1;
        if(s[nivel] == 1){
            pact = pact + p[nivel];
            bact = bact + b[nivel];
        }
    }
    public boolean solucion(int nivel,int M){
        int n = s.length;
        return ((nivel == n-1) && (pact <= M));
    }
    public boolean criterio(int nivel,int M){
        int n = s.length;
        return ((nivel < n-1) && (pact <= M));
    }
    public boolean masHermanos(int nivel){
        return (s[nivel] < 1);
    }
    public int retroceder(int nivel){
        bact = bact - s[nivel]*b[nivel];
        pact = pact - s[nivel]*p[nivel];
        s[nivel] = -1;
        nivel = nivel - 1;
        return nivel;     
    }
    public void mostrarSolucion(){
        int pesoT = 0;
        int beneficioT = 0; 
        System.out.println("Vector soa generado por backtraking");
        for(int i=0;i<soa.length;i++){
            System.out.println("soa["+i+"]: "+soa[i]);
        }
        System.out.println("Valores escogidos para la mochila");
        for(int j=0;j<s.length;j++){
            if(soa[j] == 1){
                pesoT = pesoT + p[j];
                beneficioT = beneficioT + b[j];
                System.out.println("peso: "+p[j]+" beneficio: "+b[j]);
            }
        }
        System.out.println("peso total : "+pesoT + " beneficio total: "+beneficioT);
    }
}
