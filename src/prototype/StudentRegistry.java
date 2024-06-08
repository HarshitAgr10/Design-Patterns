package prototype;

import java.util.HashMap;
import java.util.Map;

// StudentRegistry class should be ideally singleton
public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    // Register a prototype with a key
    public void register(String key, Student student) {
        map.put(key, student);
    }

    // Retrieve a prototype by key
    public Student get(String key) {
        return map.get(key);
    }
}
