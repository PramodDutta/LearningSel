package questions;

interface A {
    default void print() {
        System.out.println("A");
    }
}

interface B extends A {
    default void print() {
        System.out.println("B");
    }
}

interface C extends A {
    default void print() {
        System.out.println("C");
    }
}

class D implements B, C {
    public static void main(String[] args) {
        D d = new D();
        d.print(); // Ambiguity! Which 'print' method should be called?
    }

    @Override
    public void print() {
        B.super.print();
    }
}

