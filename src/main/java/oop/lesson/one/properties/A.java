/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lesson.one.properties;

/**
 *
 * @author Maria Penelova
 */
public class A {
    private int data;
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public static void main(String[] args) {
        A test = new A();
        test.setData(3);
        System.out.println("property data is set to 3");
        System.out.print("property data=");
        System.out.println(test.getData());
    }
}
