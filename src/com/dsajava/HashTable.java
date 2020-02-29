package com.dsajava;

import java.util.LinkedList;

public class HashTable {
    private class KeyValuePair {
        private int _key;
        String _value;
        public KeyValuePair(int key, String value){
            _key = key;
            _value = value;
        }
        public int getKey(){
            return _key;
        }
        public void setKey(int key){
            _key = key;
        }

        public String getValue(){
            return _value;
        }

        public void setValue(String value){
            _value = value;
        }
    }

    LinkedList<KeyValuePair>[] hashTable = new LinkedList[5];

    public HashTable(){

    }

    private int hashFunction(int key){
        return key % hashTable.length;
    }

    public void put(int k, String v){
        int index = hashFunction(k);
        if(hashTable[index] == null){
            hashTable[index] = new LinkedList<>();
        }
        KeyValuePair entry = new KeyValuePair(k,v);
        LinkedList<KeyValuePair> bucket = hashTable[index];
        if (bucket != null) {
            for (KeyValuePair item : bucket) {
                if (item._key == k) {
                    item._value = v;
                    return;
                }
            }
        }
        bucket.add(entry);
    }

    public String get(int k) {
        int index = hashFunction(k);
        LinkedList<KeyValuePair> bucket = hashTable[index];
        if (bucket != null) {
            for (KeyValuePair item : bucket) {
                if (item._key == k)
                    return item._value;
            }
        }
        return null;
    }

    public void remove(int k){
        int index = hashFunction(k);
        LinkedList<KeyValuePair> bucket = hashTable[index];
        if (bucket != null) {
            for (KeyValuePair item : bucket) {
                if (item._key == k) {
                    bucket.remove(item);
                    return;
                }
            }
        }
    }
}
