/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lesson.one.properties;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/**
 *
 * @author Maria Penelova
 */
public class Book {
    private String title;
    private String author;
    private double price;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Book test = new Book();
        test.setTitle("C++ Programming");
        System.out.println(test.getTitle());
    }
}
