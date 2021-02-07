package com.santiago;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }


}
public class Main {

    public static void main(String[] args) {
	String[] strArray = new String[10];
	int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();  // we can't do that. Primitive type is not a class. 'Type argument cannot be of primitive type', but  we can create class IntClass (see above)
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();

    }
}
