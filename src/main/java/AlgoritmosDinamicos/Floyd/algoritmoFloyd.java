/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDinamicos.Floyd;

/**
 *
 * @author ramos
 */
public class algoritmoFloyd {
    private static int d[][];
    private static int p[][];
    
    public static void metodoFloyd(int l[][],int n){
        d = new int[n][n];
        p = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                d[i][j] = l[i][j];
                p[i][j] = 0;
            }
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if((d[i][k]+d[k][j]) < d[i][j]){
                        d[i][j] = d[i][k]+d[k][j];
                        p[i][j] = k+1;
                    }
                }
            }
        }
        //imprimimos las matrices P Y D respectivamente
        System.out.println("MATRIZ P");
        for (int x=0; x < p.length; x++) {
          System.out.print("|");
          for (int y=0; y < p[x].length; y++) {
            System.out.print (p[x][y]);
            if (y!=p[x].length-1) System.out.print("\t");
          }
          System.out.println("|");
        }
        System.out.println("\n");
        System.out.println("MATRIZ D");
        for (int x=0; x < d.length; x++) {
          System.out.print("|");
          for (int y=0; y < d[x].length; y++) {
            System.out.print (d[x][y]);
            if (y!=d[x].length-1) System.out.print("\t");
          }
          System.out.println("|");
        }
        System.out.println("\n"); 
        //inocamos al metodo mostrarLongitudCamino
        mostarLongitudCamino(d,n);
        
    }
    //metodo que imprime el camino para llegar desde un nodo a otro a especificar por el usuario
    public static void mostrarCaminos(int ini,int fin){
        int inicop = ini;
        int fincop = fin;
        String camino = fin + "";
        //descontamos uno a ini y fin ya que
        //estan guardados en una matriz y los indices son diferentes
        ini = ini-1;
        fin = fin -1;
        //recorremos el camino mientras en la tabla p
        //no se encuentre un valor 0
        while(p[ini][fin] != 0){
            camino =  p[ini][fin] + " -> "+camino;
            //se le descuenta uno a p[ini][fin] para buscar su
            //indice en la matriz 
            fin = p[ini][fin]-1;
        }
        camino = (ini+1) + " -> "+camino;
        System.out.println("Ruta mas corta entre ("+inicop+","+fincop+") es : "+camino);        
    }
    //metodo que imprime la longitud de todos los caminos entre nodos 
    private static void mostarLongitudCamino(int d[][],int n){
        String longitud = "";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                longitud+= "Longitud de camino entre ( "+(i+1)+" , "+(j+1)+" ) es: "+d[i][j]+"\n";
            }
        }
        System.out.println(longitud);
    }
    
    
}
