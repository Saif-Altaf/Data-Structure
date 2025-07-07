package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //key=id
        //value=name
//        Map<Integer,String> map=new HashMap<>();
//        map.put(4,"saif");
//        map.put(2,"sam");
//        map.put(1,"anis");
//        System.out.println(map.containsKey(2));//o(1)
//        System.out.println(map.containsValue("sabbir"));//O(n)
//        System.out.println(map);
        Hashtable map=new Hashtable();
        map.put(6,"A");// 1
        map.put(8,"B");// 3
        map.put(11,"C");// 1
        map.put(6,"G");
        map.remove(6);
        System.out.println(map.get(6));
    }
}
