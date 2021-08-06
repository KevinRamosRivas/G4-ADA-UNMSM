
package AlgoritmosVoraces.mochila_0_1;

import AlgoritmosVoraces.mochila_0_1.Objeto;
import java.util.Comparator;

public class ObjetoComparador implements Comparator<Objeto>{

    @Override
    public int compare(Objeto o1, Objeto o2) {
        return Float.compare(o2.getValor(), o1.getValor());   
    }
    
    
    
}
