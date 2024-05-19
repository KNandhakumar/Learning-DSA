package com.me;
public class Scope {
    public static void main(String[] args) {
        // only this scope variables access this method scope only not allow another method scopes
        int a = 10; // initialized
        int b = 20;

        {
            // int a = 90;  // already initialized outside the block in the same method, hence you cannot initialize again;

            // a = 90; updated
            a = 90; // modified in public scope,not change for a because already initialized, but you can modify;
            System.out.println(a);
            int c = 100;  // values initialized in this block, will remain in block;
        }
        //  System.out.println(c);  // cannot use outside the block because only valid in this scope;

        for (int i = 0; i < 4; i++) {
            int num =1;
            // int a = 10;
        }
    }
    public static void display()
    {
        System.out.println();
    }
}

// anything that is outside you can use in inside but anything that is initialized in inside you cannot use in outside
// anything that is initialized in inside the block, you can  initialize the outside the block example : {int a = 10;} -> inside the block. again you can initialize the outside block example {already initialized int a = 10;} int a = 10;