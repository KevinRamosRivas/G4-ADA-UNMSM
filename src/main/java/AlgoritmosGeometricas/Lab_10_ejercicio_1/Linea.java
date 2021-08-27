/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosGeometricas.Lab_10_ejercicio_1;
/**
 *
 * @author billy
 */
public class Linea {

    private Punto pO;
    private Punto pF;

    public Linea(Punto pOrigen, Punto pFinal) {
        pO = pOrigen;
        pF = pFinal;
    }

    public Punto getpO() {
        return pO;
    }

    public void setpO(Punto pOrigen) {
        pO = pOrigen;
    }

    public Punto getpF() {
        return pF;
    }

    public void setpF(Punto pFinal) {
        pF = pFinal;
    }

    public double longitudSegmento() {
        return Math.sqrt(Math.pow(getpF().getX() - getpO().getX(), 2)
                + Math.pow(getpF().getY() - getpO().getY(), 2));
    }

    public boolean existeInterseccion(Linea s) {
        double m1 = (pF.getY() - pO.getY()) / (pF.getX() - pO.getX());
        double a = m1;
        double b = -1;
        double c = m1 * pO.getX() - pO.getY();
        double m2 = (s.getpF().getY() - s.getpO().getY())/(s.getpF().getX() - s.getpO().getX());
        double d = m2;
        double e = -1;
        double f = m2 * s.getpO().getX() - s.getpO().getY();
        double det = a * e - b * d;
        if (det != 0) {
            return true;
        } else {
            return false;
        }
    }

    public Punto puntoInterseccion(Linea s) {
        Punto pCorte = new Punto();
        double m1 = (pF.getY() - pO.getY()) / (pF.getX() - pO.getX());
        double a = m1;
        double b = -1;
        double c = m1 * pO.getX() - pO.getY();
        double m2 = (s.getpF().getY() - s.getpO().getY())
                / (s.getpF().getX() - s.getpO().getX());
        double d = m2;
        double e = -1;
        double f = m2 * s.getpO().getX() - s.getpO().getY();
        double det = a * e - b * d;
        if (det != 0) {
            pCorte.setX((c * e - b * f) / det);
            pCorte.setY((a * f - c * d) / det);
        }
        return pCorte;
    }
}
