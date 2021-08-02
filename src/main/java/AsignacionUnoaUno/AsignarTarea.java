
package AsignacionUnoaUno;

public class AsignarTarea {
    public static void main(String[] args) {
        int s[][] = {{0, 0, 0, 0},{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int tiempo[][] = {{14, 5, 8, 7},{2, 12, 6, 5}, {7, 8, 3, 9}, {2, 4, 6, 10}};
        final int m = 4;
        final int n = 4;
        Asignacion Tareas = new Asignacion();
        
        System.out.println("Ordenando las tareas");
        
        Tareas.Voraz(s, tiempo, m, n);
        if(Tareas.Solucion(s, m, n)){
            for(int j=0; j<n; j++){
                for (int i=0; i<m; i++){
                    
                    if (s[i][j]==1){
                        System.out.printf("El trabajador N°%d realizará la tarea "
                                + "N°%d en %d horas\n", i+1, j+1, tiempo[i][j]);                       
                    }
                    
                }
            }
        }
        else{
            System.out.println("No hay solucion");
        }
    }
}
