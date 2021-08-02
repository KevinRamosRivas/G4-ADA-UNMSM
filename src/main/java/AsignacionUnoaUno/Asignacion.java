
package AsignacionUnoaUno;


public class Asignacion {
    /*tiempo es un vector bidimensional donde el número de fila indica el N° 
    trabajador y el número de columna indica el N° de tarea. Por lo que el
    elemento tiempo[2][3] almacena el tiempo que se demoraría el trabajador
    N° 2 en realizar la tarea N°3*/
    public void Voraz(int s[][], int tiempo[][], int m, int n){
        int x;
        int j, i = 0, posF = 0, posC = 0;
        int menorT;
        //Se recorrera por filas
        while(!Solucion(s, m, n) && i<n){
            menorT = 10000;
            //Aquí se recorre por columnas para encontrar en que tarea es más
            //rápido el trabajador N°i 
            for(j=0; j<n; j++){
                if(tiempo[i][j]<menorT){
                    //comprobamos si la tarea ya ha sido asignada
                    if(Factible(s, j, m)){
                        menorT = tiempo[i][j];
                    //Se guarda los índices del tiempo de la tarea
                        posF = i; posC = j;                         
                    }
                }
            } 
            s[posF][posC] = 1;
            i++;
        }
    }
    
    public boolean Factible(int s[][], int j, int m){
        int i=0;
        while(i<m){
            if(s[i][j]==1){
                return false;
            }
            i++;
        }
        return true;
    }
    
    public boolean Solucion(int s[][], int m, int n){
        boolean tareaAsignada = false;
        int i = 0, j = 0;
        while(j<n && !tareaAsignada){
            while(i<m && !tareaAsignada){
                if(s[i][j] == 1){
                    tareaAsignada = true;
                }
                i++;
            }
            if(tareaAsignada == false){
                return false;
            }
            tareaAsignada = false;
            i = 0;
            j++;
        }
            
        return true;
    }
   
}

