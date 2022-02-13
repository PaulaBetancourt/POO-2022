
package uv.poo.generictupla;

public class GenericTupla<K, V> {

    private final K key;
    private final V value;

    public GenericTupla (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey () {
        return key;
    }

    public V getValue () {
        return value;
    }

    @Override
    public String toString () {
        return String.format ("(%s, %s)", key.toString (), value.toString ());
    }

    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof GenericTupla)) return false;
        GenericTupla<K, V> two = (GenericTupla<K, V>) obj;
        return this.key.equals (two.key) && this.value.equals (two.value);
    }

    @Override
    public int hashCode() {
        return 1;
    }
    
    public static class Utilities {
        public static <K, V> boolean compare (K firstTuple, V secondTuple) {
            if (firstTuple instanceof GenericTupla && secondTuple instanceof GenericTupla) {
                GenericTupla oneTuple = (GenericTupla) firstTuple;
                GenericTupla twoTuple = (GenericTupla) secondTuple;
                return oneTuple.getKey().equals(twoTuple.getKey()) && oneTuple.getValue().equals(twoTuple.getValue());
            }
            return false;
        }
    } 
    
    
}
