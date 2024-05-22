package prac3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class ConcurrentMap<K, V> implements Map<K, V> {

    private static final Semaphore semaphore = new Semaphore(1);
    private final Map<K, V> map = new HashMap<>();

    @Override
    public int size() {
        try {
            semaphore.acquire();
            int size = map.size();
            semaphore.release();
            return size;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            boolean is_empty = map.isEmpty();
            semaphore.release();
            return is_empty;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            semaphore.acquire();
            boolean contains_key = map.containsKey(key);
            semaphore.release();
            return contains_key;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean containsValue(Object value) {
        try {
            semaphore.acquire();
            boolean contains_value = map.containsValue(value);
            semaphore.release();
            return contains_value;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public V get(Object key) {
        try {
            semaphore.acquire();
            V value = map.get(key);
            semaphore.release();
            return value;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public V put(K key, V value) {
        try {
            semaphore.acquire();
            V oldValue = map.put(key, value);
            semaphore.release();
            return oldValue;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public V remove(Object key) {
        try {
            semaphore.acquire();
            V removedValue = map.remove(key);
            semaphore.release();
            return removedValue;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void putAll(Map m) {
        try {
            semaphore.acquire();
            map.putAll(m);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Set keySet() {
        try {
            semaphore.acquire();
            Set set_key = map.keySet();
            semaphore.release();
            return set_key;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Collection values() {
        try {
            semaphore.acquire();
            Collection val = map.values();
            semaphore.release();
            return val;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        try {
            semaphore.acquire();
            Set<Entry<K, V>> entry_set = map.entrySet();
            semaphore.release();
            return entry_set;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
