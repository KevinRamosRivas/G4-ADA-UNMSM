package coeficientebinomial;

public class ModoRecursivo {
    
    private static int contador=0;

    public ModoRecursivo() {
    }

    public static int getContador() {
        return contador;
    }
    
    public static long AlgoritmoRecursivo(int n, int k) {
        contador++;
    
        if (n >= 0 && k == 0) {
            return 1;
        }
        
        if (n == 0 && k > 0) {
            return 0;
        }
        
        else{
            return AlgoritmoRecursivo(n - 1, k - 1) + AlgoritmoRecursivo(n - 1, k);
        }
        
    } 
        
}
