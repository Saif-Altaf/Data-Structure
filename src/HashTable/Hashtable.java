package HashTable;

import java.util.LinkedList;

public class Hashtable {
    //put(k,v)
    //get(k) : v
    //remove(k)
    //k:int
    //v:String
    //collision chaining
    //LinkedList<Entry> [] arr
    private class Entry {
        private int key;
        private String val;

        public Entry(int key, String val) {
            this.key = key;
            this.val = val;
        }
    }

    LinkedList<Entry>[] table = new LinkedList[5];

    public void put(int key, String val) {
        int index = hashfunc(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (var entry : table[index]) {
            if (entry.key == key) {
                entry.val = val;
                return;
            }
        }

        Entry entry = new Entry(key, val);
        table[index].addLast(entry);
    }
    public String get(int key){
        var index=hashfunc(key);
        if(table[index]!=null) {
            for (var entry : table[index]) {
                if (entry.key == key) {
                    return entry.val;
                }
            }
        }
        return null;
    }

    public void remove(int key){
        var index=hashfunc(key);
        if(table[index]==null){
            throw new IllegalStateException();
        }
        for (var entry:table[index]){
            if(entry.key==key){
                table[index].remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private int hashfunc(int key) {
        return Math.abs(key) % table.length;
    }
}
