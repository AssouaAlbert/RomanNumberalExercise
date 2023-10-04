package org.peronal;

import java.util.*;

public class RomanClass {
    Map<Integer, RomanObjecPair> map = new TreeMap<>();

    // Add key-value pairs to the HashMap
    public RomanClass() {
        map.put(1, new RomanObjecPair (1000, "M"));
        map.put(2, new RomanObjecPair (900, "CM"));
        map.put(3, new RomanObjecPair (500, "D"));
        map.put(4, new RomanObjecPair (400, "CD"));
        map.put(5, new RomanObjecPair (100, "C"));
        map.put(6, new RomanObjecPair (90, "XC"));
        map.put(7, new RomanObjecPair (50, "L"));
        map.put(8, new RomanObjecPair (40, "XL"));
        map.put(9, new RomanObjecPair (10, "X"));
        map.put(10, new RomanObjecPair (9, "IX"));
        map.put(11, new RomanObjecPair (5, "V"));
        map.put(12, new RomanObjecPair (4, "IV"));
        map.put(13, new RomanObjecPair (1, "I"));
    }

    public int RomanToint(Scanner sc) throws SelectionInvalidExceoption {
        return 0;
    }

    public String IntToRoman(Scanner sc) throws SelectionInvalidExceoption {
        System.out.println("\nEnter integer: \n");
        int input = GetInput.getOption(sc);
        int temInpt = input+1;
        List<String> res = new ArrayList<>();
        String value;
        int key;
        boolean invalid;
        System.out.println(map);
        Iterator<Map.Entry<Integer, RomanObjecPair>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, RomanObjecPair> entry = iterator.next();
            value = entry.getValue().value;
            key = entry.getValue().key;
            invalid = true;
             do{
                int syb = temInpt - key;
                if(syb > 0){
                    temInpt = syb;
                    res.add(value);
                }
                else{
                    invalid = false;
                }
            } while (invalid);
        }
        System.out.println(res);
        System.out.println(res.size());
        return "";
    }
}
