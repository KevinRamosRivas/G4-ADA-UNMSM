
package AlgoritmosRetroceso.AplicaciónModificadaSumSubconjuntos;


public class PruebaBacktracking {
    public static void main(String[] args) {
        int valores[] = {12, 23, 1, 8, 33, 7, 22};
        int suma = 50;
        Backtracking sumaDada = new Backtracking(valores, suma);
        
        sumaDada.hallarSubconjunto();
        sumaDada.existeSol();
    }
}
