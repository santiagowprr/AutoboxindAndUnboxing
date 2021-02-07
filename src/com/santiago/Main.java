package com.santiago;

import java.util.ArrayList;

// CREATING BELOW CLASS 'IntClass' IS NOT THE BEST WAY TO DEAL WITH THE BELOW ISSUE
// this class is so called wrapper. it holds the int value of the class
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
        //ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>(); // not a correct thing to do
        //intClassArrayList.add(new IntClass(54));                           // not a correct thing to do

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // Integer, Double are actually classes so they can be added to ArrayLists
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);  // we cant use the word 'double when creating variables, bc its a reserved keyword
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i =0 ; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));  //  Autoboxing - taking a base primitive type and converting into Class
        }

        for (int i =0 ; i<=10; i++){
            System.out.println(i + " -> " + intArrayList.get(i).intValue()); //  Unboxing - taking an object and converting into primitive type
        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // an even better solution:

    }
}
