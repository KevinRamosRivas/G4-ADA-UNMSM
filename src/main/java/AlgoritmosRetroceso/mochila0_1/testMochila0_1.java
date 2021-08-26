/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosRetroceso.mochila0_1;

/**
 *
 * @author ramos
 */
public class testMochila0_1 {
    public static void main(String args[]){
        int p[]= {1,2,3,4,1};
        int b[] ={2,3,4,5,9};
        mochila_0_1 m1 = new mochila_0_1(p,b,7);
        m1.hallarSubconjunto();
        m1.mostrarSolucion();
    }
    
}
