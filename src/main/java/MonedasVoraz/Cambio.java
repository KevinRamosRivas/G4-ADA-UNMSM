/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonedasVoraz;
//existe un vector bidimensional v[][] para las monedas(la primera fila es el tipo de 
//moneda y la segunda fila es la cantidad disponible)
public class Cambio {
    public void Voraz(int s[], double v[][], double cambio){
        double x;
        int i = 0;
        while (!Solucion(s , v, cambio) && i < s.length){
            //verifica si hay monedas disponibles en la segunda fila del array
            if(v[1][i]>0){
                //Seleccionar moneda
                x= v[0][i];
                if (Factible(s, v, cambio, x)){
                    //inserta moneda
                    s[i]++;
                    v[1][i]=v[1][i]-1;          
                }
                else{
                    i++;
                }

            }
            else{
                //rechaza moneda
                i++;
            }
        }
    }
    public boolean Solucion (int s[], double v[][], double cambio){
        double suma = 0.0;
        for (int i = 0; i< s.length; i++){
            suma += s[i]*v[0][i];
        }
        suma = Math.rint(suma*100)/100;
        if (suma==cambio)
            return true;
        else
            return false;
    }
    public boolean Factible (int s[], double v[][], double cambio, double x){
        double suma = 0.0;
        for (int i = 0; i< s.length; i++){
            suma += s[i]*v[0][i];
        }
        suma = suma + x;
        suma = Math.rint(suma*100)/100;
        if (suma<=cambio)
            return true;
        else
            return false;

    }
}