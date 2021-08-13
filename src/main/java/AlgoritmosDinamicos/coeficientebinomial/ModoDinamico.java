package coeficientebinomial;

public class ModoDinamico {
    
    private static final int DIMENSION = 20;
    private static long combinatorio2[][];

    public ModoDinamico() {
    }

    public static int getDIMENSION() {
        return DIMENSION;
    }

    public static long[][] getCombinatorio2() {
        return combinatorio2;
    }

    public static void setCombinatorio2(long[][] combinatorio2) {
        ModoDinamico.combinatorio2 = combinatorio2;
    }

    
    public static void AlgoritmoDinamico(int n, int k) {
        combinatorio2 = new long[DIMENSION][DIMENSION];
        int contador=0;
        
        for (int i = 0; i < DIMENSION; i++) {
            combinatorio2[0][i] = 0;
            combinatorio2[i][0] = 1;
            contador++;
        }
        
        for (int a = 1; a < DIMENSION; a++) {
            for (int b = 1; b <= a; b++) {
                combinatorio2[a][b] = combinatorio2[a - 1][b - 1] + combinatorio2[ a- 1][b];
                contador++;
            }
        }
        
        System.out.println("El combinatorio de "+n+" en "+k+" es: "+combinatorio2[n][k]);
        System.out.println("Numero de pasos: "+contador);
    }    
}
