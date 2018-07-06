package Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Smith", 23);
        hasMap.put("Jone", 22);
        hasMap.put("Lei", 21);
        hasMap.put("Jenny", 19);
        System.out.println("Display entries in HashMap: " );
        System.out.println(hasMap+"\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 23);
        linkedHashMap.put("Jone", 22);
        linkedHashMap.put("Lei", 21);
        linkedHashMap.put("Jenny", 19);
        System.out.println("\n The age for Lei is " + linkedHashMap.get("Lei"));
    }
}
