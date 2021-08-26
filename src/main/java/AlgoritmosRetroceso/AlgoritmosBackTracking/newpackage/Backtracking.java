
package AlgoritmosRetroceso.AlgoritmosBackTracking.newpackage;

import javax.swing.JOptionPane;

public class Backtracking {
    private int s[];
    private int v[];
    private int tact;
    private int p;
    
    public Backtracking(int valores[], int suma){
        v = new int[valores.length];
        s = new int[valores.length];
        
        v = valores;
        tact = 0;
        p = suma;
        
    }
}
