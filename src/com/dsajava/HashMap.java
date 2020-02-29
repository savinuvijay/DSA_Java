package com.dsajava;

public class HashMap {
    private class KeyValuePair {
        private int _key;
        private String _value;

        public KeyValuePair(int key, String value) {
            _key = key;
            _value = value;
        }
    }
    public HashMap (){

    }

    KeyValuePair[] hashMap = new KeyValuePair[5];

    public void put(int key, String value){
        int index = hashFunction(key);
        int count = 0;
        while(count < 100) {
            if(hashMap[index] != null && hashMap[index]._key != key){
                index = (index + 1) % hashMap.length;
                count++;
            }
            else {
                hashMap[index] = new KeyValuePair(key, value);
                return;
            }
        }
    }

    public String get(int key){
        int index = hashFunction(key);
        int count = 0;
        while(count < 100) {
            if (hashMap[index] != null && hashMap[index]._key == key) {
                return hashMap[index]._value ;
            }
            index = (index + 1) % hashMap.length;
            count++;
        }
        return null;
    }

    public void remove(int key){
        int index = hashFunction(key);
        int count = 0;
        while(count < 100) {
            if (hashMap[index] != null && hashMap[index]._key == key) {
                hashMap[index] = null ;
            }
            index = (index + 1) % hashMap.length;
            count++;
        }
    }

    private int hashFunction(int key){
        return key % hashMap.length;
    }
}
