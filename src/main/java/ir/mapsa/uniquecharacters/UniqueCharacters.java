package ir.mapsa.uniquecharacters;

import java.util.Hashtable;
import java.util.Map;

public class UniqueCharacters {
    public static boolean check(String element) throws Exception {
        if (element == null || element.length() == 0) {
            throw new Exception();
        }
        Map<Integer, Boolean> hashtable = new Hashtable<>();
        // TODO: Do you think this piece of code can be optimized?
        for (char ch : element.toCharArray()) {
            hashtable.put((int) ch, hashtable.containsKey((int) ch));
        }
        return hashtable.containsValue(true);
    }
}
