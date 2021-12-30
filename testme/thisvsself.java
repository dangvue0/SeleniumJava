package com.dangvue0.testme;

class Parent {

    int i;
    Parent() {
        this.i = 5;
    }

    void doStuff() {
        System.out.println(this.i);
    }
}

class Child extends Parent {
    int i;
    Child() {
        this.i = 7;
    }
}

//class Main {
//
//    public static void main(String[] args) {
//        Child m = new Child();
//        System.out.println(m.i); //print 7
//
//        m.doStuff(); //print 5
//
//        Parent p = new Parent();
//        System.out.println(p.i);
//
//    }

