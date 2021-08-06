/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosVoraces.MonedasVoraz;

import java.util.Scanner;

/**
 *
 * @author ramos
 */
public class DarCambio {
    public static void main(String[] args) {
        int s[]={0,0,0,0,0,0,0,0,0,0,0,0,0};
        double v[][]={{200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.01},{2,2,2,12,3,4,5,7,8,10,2,3,3}};
        double vuelto;
        Scanner entrada = new Scanner(System.in);
        Cambio moneda = new Cambio();
        System.out.print("Ingrese cambio: ");
        System.out.println("");
        vuelto = entrada.nextDouble();
        moneda.Voraz(s, v, vuelto);
        if(moneda.Solucion(s, v, vuelto)){
            for (int i=0; i <s.length; i++){
                if (s[i]>0)
                    System.out.printf("%d monedas de %.2f soles\n", s[i], v[0][i]);
            }
        }
        else
            System.out.println("No hay solucion");
//        for (int i=0; i <s.length; i++){
//            System.out.printf("%d monedas de %.2f soles\n", s[i], v[0][i]);
//        }
    }
}    