package s1t4.exercici5.nivell2;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    private Map<String, String> map;

    public MyMap() {
        this.map = new HashMap<>();
    }

    public void addEntry(String key, String value) {
        map.put(key, value);
    }

    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    public Map<String, String> getMap() {
        return map;
    }
}
