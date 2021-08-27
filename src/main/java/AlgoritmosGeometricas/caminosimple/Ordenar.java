/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosGeometricas.caminosimple;

public class Ordenar extends Punto {
    double n;

    public Ordenar(double n, int x, int y) {
        super(x, y);
        this.n = n;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getY() {
        return y;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

}
