package com.techex.java.collections;

import java.util.ArrayList;

public class ArrayListImpl {

    private ArrayList<String> arrayListImpl;

    public ArrayListImpl() {
        this.arrayListImpl = new ArrayList<String>();
    }

    public ArrayListImpl(String initialValue){
        this.arrayListImpl = new ArrayList<String>();
        this.arrayListImpl.add(initialValue);
    }

    public ArrayListImpl(ArrayList<String> arrayList) {
        this.arrayListImpl = arrayList;
    }

    //Create Constructor that Converts an Array to ArrayList
    public ArrayListImpl(String[] array) {
        for (int i = 0; i < array.length ;i++) {
            this.arrayListImpl.add(array[i]);
        }
    }

    public int size() {
        return this.arrayListImpl.size();
    }

    // Return if value is in ArrayList
    public int returnIndex(String value) {

        for(int i = 0; i < arrayListImpl.size(); i++) {
            if (value == arrayListImpl.get(i)) {
                return i;
            }
        }

        return -1;
    }

    // Return Value at Index
    public String returnValue(int index) {

        if (index >= this.arrayListImpl.size()) {
            return "Index is out of bounds";    // Return Exception
        }

        return arrayListImpl.get(index);

    }
}
