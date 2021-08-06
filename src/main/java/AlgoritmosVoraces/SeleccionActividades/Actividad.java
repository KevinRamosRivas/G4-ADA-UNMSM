/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosVoraces.SeleccionActividades;

/**
 *
 * @author ramos
 */
public class Actividad {
    private String nombre;
    private int ini;
    private int fin;
    
    public Actividad(String nombre,int ini,int fin){
        this.nombre = nombre;
        this.ini = ini;
        this.fin = fin;
    }
    public String getNombre() {
        return nombre;
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInicio(int inicio) {
        this.ini = inicio;
    }

    public void setAcaba(int acaba) {
        this.fin = acaba;
    }
    
    public String imprime(){
        return "Nombre: "+this.nombre+"\nInicia: "+this.ini+"\nFin: "+this.fin;
    }
    
    
}
