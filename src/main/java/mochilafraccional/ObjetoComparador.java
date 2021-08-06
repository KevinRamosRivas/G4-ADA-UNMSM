
package mochilafraccional;

import java.util.Comparator;

public class ObjetoComparador implements Comparator<Objeto>{

    @Override
    public int compare(Objeto o1, Objeto o2) {
        return Float.compare(o2.getValorPeso(), o1.getValorPeso());   
    }
}
