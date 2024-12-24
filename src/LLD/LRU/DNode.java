package LLD.LRU;

public class DNode<K,V> {
    K key;
    V value;
    DNode<K, V> prev;
    DNode<K , V> next;
    DNode(K key, V value){
        this.key = key;
        this.value = value;
    }
}
