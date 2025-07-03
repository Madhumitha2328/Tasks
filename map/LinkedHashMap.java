package Collcetions.Map;

import java.util.LinkedHashMap;

 class LinkedHashMapclass {

    public static void main(String[] args) {
        LinkedHashMap<String, Object> hm = new LinkedHashMap<>();
        hm.put("name", "Dhilip");
        hm.put("Age", 22);
        hm.put(null, "Arav");
        System.out.println(hm);
    }
}
