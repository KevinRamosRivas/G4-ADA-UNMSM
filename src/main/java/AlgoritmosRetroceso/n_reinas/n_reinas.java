
package AlgoritmosRetroceso.n_reinas;

public class n_reinas {
    
    public static boolean isVal(String[][] tabla, int i, int pos) {
	
        for (int x = 0; x < pos; x++) {
            if (tabla[i][x].equals("D")) {
        	return false;
            }
	}
	for (int j = 0; j < tabla.length && (i - j) >= 0 && (pos - j) >= 0; j++) {
            if (tabla[i - j][pos - j].equals("D")) {
		return false;
            }
        }
	for (int j = 0; j < tabla.length && (i + j) < tabla.length && pos - j >= 0; j++) {
            if (tabla[i + j][pos - j].equals("D")) {
		return false;
            }
	}
        
	return true;
    }
    
    public static void ubicaReina(String[][] tabla, int pos) {

	for (int i = 0; i < tabla.length; i++) {
            if (isVal(tabla, i, pos)) {
		tabla[i][pos] = "D";

                if (pos < tabla.length - 1) {
                    ubicaReina(tabla, pos + 1);
                    } else {
                	imprimirMatriz(tabla);
			System.out.println("------------- ");
                      }
                tabla[i][pos] = " ";
            }
	}
    }

    public static String[][] generarTabla(int length) {
	String[][] res = new String[length][length];
	for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[i][j] = " ";
            }
	}
            return res;
    }

    public static void imprimirMatriz(String[][] tabla) {
	for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
		System.out.print(tabla[i][j] + ",");
            }
                    System.out.println();
        }
    }
    
}
