package ifood_apache_ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;

public class App {
    public static void main(String[] args) {
        Ignite ingnite = Ignition.start();
        IgniteCache<String, String> cache = ingnite.getOrCreateCache("my_cache");
        cache.put("Hello", "World");
        System.out.println("Message: " + cache.get("Hello"));
    }
}
