package com.techex;

import com.techex.java.files.CustomFileReader;
import com.techex.java.files.CustomFileWriter;
import com.techex.java.files.FileCreator;
import com.techex.oop.*;

public class Main {

    public static void main(String[] args) {


        int dataInput = 10000;

        if (dataInput <= 10000){
            ISearch naive = new NaiveSearch();
            naive.search();
        } else {
            ISearch binary = new BinarySearch();
            binary.search();
        }

        BaseClass baseClass = new BaseClass();
        BaseClass inheritedChildClass = new ChildClass();
        ChildClass childClass = new ChildClass();
        IInterface interfaceChildClass = new ChildClass();
        IInterface justImplements = new InterfacedClasse();

        baseClass.returnID();
        inheritedChildClass.returnID();
        childClass.birthOrder();
        childClass.returnName();
        childClass.returnID();
        interfaceChildClass.returnName();
        justImplements.returnName();



    }
}
