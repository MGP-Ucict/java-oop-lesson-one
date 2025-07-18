/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lesson.one.properties;

/**
 *
 * @author Maria Penelova
 */
public class Student {
    private String name;
    private String address;
    public void setName(String name){
        this.name = name;
    }   
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    private String email;
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    
    public static void main(String[] args) {
        Student test = new Student();
        test.setEmail("lesson.one@gmail.com");
        System.out.println("property email is set to lesson.one@gmail.com");
        System.out.print("property email = ");
        System.out.println(test.getEmail());
    }
}
