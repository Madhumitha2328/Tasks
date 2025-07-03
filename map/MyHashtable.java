package Collcetions.Map;
import java.util.Hashtable;

public class MyHashtable {
    private Hashtable<String, Integer> table;

    public MyHashtable() {
        table = new Hashtable<>();
    }
    public void put(String key, int value) {
        table.put(key, value);
    }
    public Integer get(String key) {
        return table.get(key);
    }
    public void remove(String key) {
        table.remove(key);
    }
    public String toString() {
        return table.toString();
    }
    public static void main(String[] args) {
        MyHashtable myHashtable = new MyHashtable();

        myHashtable.put("One", 1);
        myHashtable.put("Two", 2);
        myHashtable.put("Three", 3);
        System.out.println("Value for 'Two': " + myHashtable.get("Two"));
        myHashtable.remove("One");
        System.out.println("Hashtable: " + myHashtable);
    }
}
