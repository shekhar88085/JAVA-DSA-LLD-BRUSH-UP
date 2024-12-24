package LLD.LRU;

import java.util.HashMap;

public class LRU<K, V> {
    private final int capacity;
    private final HashMap<K, DNode<K, V>> map;
    private final DNode<K, V> head;
    private final DNode<K, V> tail;
    public LRU(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new DNode<>(null, null);
        this.tail = new DNode<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    V get(K  key){
        if(!map.containsKey(key)){
            return null;
        }
        DNode<K, V> node = map.get(key);
        moveToHead(node);
        return node.value;
    }

    void put(K key, V value){
        if(map.containsKey(key)){
            DNode<K , V> node = map.get(key);
            node.value = value;
            moveToHead(node);
        } else{
            if(map.size() == capacity){
                evict();
            }
            DNode<K, V> node = new DNode<>(key, value);
            map.put(key, node);
            addToHead(node);
        }
    }

}
