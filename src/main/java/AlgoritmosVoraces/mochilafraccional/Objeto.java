
package AlgoritmosVoraces.mochilafraccional;

public class Objeto {
    
    private int valor;
    private float peso;
    private float valorPeso;
    
    public Objeto( float peso, int valor){
        this.peso = peso;
        this.valor = valor;
        this.valorPeso = (float) valor/peso;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @return the valorPeso
     */
    public float getValorPeso() {
        return valorPeso;
    }
    
}
