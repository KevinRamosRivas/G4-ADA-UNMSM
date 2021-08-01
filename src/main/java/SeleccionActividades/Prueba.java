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
public class Prueba {
    public static void main(String args[]){
        Actividad a[]= new Actividad[8];
        Actividad s[] = {new Actividad("",0,0),new Actividad("",0,0),new Actividad("",0,0),new Actividad("",0,0),new Actividad("",0,0),new Actividad("",0,0),new Actividad("",0,0),new Actividad("",0,0)};
        a[0]=new Actividad("A",8,14);
        a[1]=new Actividad("B",9,12);
        a[2]=new Actividad("C",11,13);
        a[3]=new Actividad("D",11,16);
        a[4]=new Actividad("E",12,15);
        a[5]=new Actividad("F",13,17);
        a[6]=new Actividad("G",14,18);
        a[7]=new Actividad("H",16,19);
        Seleccion.seleccionActividades(s,a);
        System.out.println("SOLUCION: ");
        for (Actividad item : s) {
            if (!"".equals(item.getNombre())) {
                System.out.println(item.imprime());
            }
        }
    }
}
