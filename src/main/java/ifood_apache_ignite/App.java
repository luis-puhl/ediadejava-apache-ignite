package ifood_apache_ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;

public class App {
    public static void main(String[] args) {
        Ignite ingnite = Ignition.start();
        IgniteCache<UserKey, User> cache = ingnite.getOrCreateCache(usersCacheConfiguration());

        User user = new User("João");
        SqlFieldsQuery insertUser = new SqlFieldsQuery();
        UUID
        cache.put("Hello", "World");
        System.out.println("Message: " + cache.get("Hello"));
    }
}
