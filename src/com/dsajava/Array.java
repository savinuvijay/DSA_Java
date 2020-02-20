package com.dsajava;

public class Array {
    private int _array[];
    private int _position;
    public int length;
    public Array(int length){
        _array = new int[length];
        this.length = _position;
    }
    public void insert(int value){
        if(_position == _array.length){
            int[] temp = new int[_position*2];
            System.out.println("Overflow");
            for(int i = 0; i < _position; i++){
                temp[i] = _array[i];
            }
            _array = temp;
        }
        _array[_position++] = value;
        length = _position;
    }

    public void removeAt(int index){
        if(index >= 0 && index < _position){
            for(int i = index; i < _position-1; i++){
                _array[i] = _array[i+1];
            }
            _position --;
            length = _position;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public int indexOf(int value){
        for(int i = 0; i < _position; i++){
            if(_array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        System.out.println("Length: "+_array.length);
        System.out.println("Position: "+_position);
        for(int i = 0; i < _position; i++){
            System.out.println("["+i+"]: "+_array[i]);
        }
    }

    public int valueAt(int index){
        if(index >= 0 && index < _position){
            return _array[index];
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public int max(){
        if(_position >= 0){
            int maxVal = _array[0];
            for(int i=0; i < _position; i++){
                if(_array[i]>maxVal) maxVal = _array[i];
            }
            return maxVal;
        }
        return -1;
    }

    public Array intersect(Array arrayB){
        int size = arrayB.length > _position ? _position : arrayB.length;
        Array temp = new Array(size);
        for(int i = 0; i < _position; i++){
            for(int j = 0; j < arrayB.length; j++){
                if(arrayB.valueAt(j) == _array[i]) {
                    temp.insert(_array[i]);
                }
            }
        }
        return temp;
    }

    public void reverse(){
        int temp;
        for(int i = 0, j = _position-1; i < _position/2; i++, j--){
            temp = _array[i];
            _array[i] = _array[j];
            _array[j] = temp;
        }
    }
    public void insertAt(int item, int index){
        if(index <= _position) {
            if (_position == _array.length) {
                int[] temp = new int[_position * 2];
                System.out.println("Overflow");
                for (int i = 0, j = 0; i < _position+1; i++) {
                    if (i < index) {
                        temp[i] = _array[j++];
                    } else if (i == index) {
                        temp[i] = item;
                    } else {
                        temp[i] = _array[j++];
                    }
                }
                _array = temp;
            } else {
                int tempVal = _array[index];
                _array[index] = item;
                int tempSwap;
                for (int i = index + 1; i < _position; i++) {
                    tempSwap = _array[i];
                    _array[i] = tempVal;
                    tempVal = tempSwap;
                }
            }
            length = ++_position;
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }

    }
}