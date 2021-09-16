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

    public int size() {
        return this.arrayListImpl.size();
    }

    // Return Value at Index

    // Return if value is in ArrayList

    // Determine if empty by method

    // Determine if empty by comparison
}
