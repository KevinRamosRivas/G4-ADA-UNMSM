
package AlgoritmosRetroceso.n_reinas;

import javax.swing.JOptionPane;

public class principal {

       public static void main(String[] args) {
       
           String[][] tabla = { { " ", " ", " ", " " }, { " ", " ", " ", " " }, { " ", " ", " ", " " },{ " ", " ", " ", " " } };
		boolean band = true;
		
                int dim = 0;
		
                do {
                    band = true;
                    try {
                    dim = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la dimensión de la tabla (Mayor que 3)", "ADA",3));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Dato ingresado es incorrecto", "ERROR", JOptionPane.WARNING_MESSAGE);
			band = false;
                    }
		} while (band == false);
		
                tabla = n_reinas.generarTabla(dim);
		
                n_reinas.ubicaReina(tabla, 0);
    } 
}
