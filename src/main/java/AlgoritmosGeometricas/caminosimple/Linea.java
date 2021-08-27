package AlgoritmosGeometricas.caminosimple;

import java.awt.Color;

public class Linea {
    private int dx,ax,dy,ay;
    private double t;
    final int x1; 
    final int y1;
    final int x2;
    final int y2;   
    final Color color;
    
    public Linea(Punto p1,Punto p2, Color color) {
        this.x1 = p1.getX();
        this.y1 = p1.getY();
        this.x2 = p2.getX();
        this.y2 = p2.getY();
        this.color = color;
    }

    Linea() {
       x1=0;
       x2=0;
       y1=0;
       y2=0;
       color= new Color(0,0,0);
    }

    public void setAx(int ax) {
        this.ax = ax;
    }
    
    public double Theta(Punto p1, Punto p2) {
        dx = p2.x - p1.x;
        ax = Math.abs(dx);
        dy = p2.y - p1.y;
        ay = Math.abs(dy);
        if (ax + ay == 0)
            t = 0;
        else 
            t = 1.0 * dy / (ax + ay);
        if (dx < 0)
            t = 2 - t;
        else if(dy < 0)
            t=t+4;
        return (t*90.0);
        }

}
    
