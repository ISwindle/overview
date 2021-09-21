package com.techex.oop;

public class InheritanceInterfaceExample {

    public void Instantiate() {
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
