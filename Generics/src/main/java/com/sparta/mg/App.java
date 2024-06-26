package com.sparta.mg;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        IntegerRectangle integerRectangle = new IntegerRectangle(2, 4);
        DoubleRectangle doubleRectangle = new DoubleRectangle(2.0, 4.0);
        System.out.printf("Integer Rectangle Area: %d\n", integerRectangle.getWidth() * integerRectangle.getHeight());
        System.out.printf("Double Rectangle Area: %f\n", doubleRectangle.getWidth() * doubleRectangle.getLength());

        ObjectRectangle objectRectangle1 = new ObjectRectangle(2, 4);
        ObjectRectangle objectRectangle2 = new ObjectRectangle(2.0, 4.0);

        System.out.printf("Object Integer Rectangle Area: %d\n", (Integer)objectRectangle1.getLength() * (Integer) objectRectangle1.getWidth());
        System.out.printf("Object Double Rectangle Area: %f\n", (Double)objectRectangle2.getLength() * (Double) objectRectangle2.getWidth());

        GenericRectangle<? extends Number> integerGenericRectangle = new GenericRectangle<>(2, 4);

        GenericRectangle<Double> doubleRectangleGenericRectangle = new GenericRectangle<>(2.0, 4.0);

        System.out.printf("Generic Integer Rectangle Area: %d\n", (Integer)integerGenericRectangle.getHeight() * (Integer)integerGenericRectangle.getWidth()); //Casting still needed
        System.out.printf("Generic Double Rectangle Area: %f\n", doubleRectangleGenericRectangle.getHeight() * doubleRectangleGenericRectangle.getWidth());

    }
}
