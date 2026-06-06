/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return width * length;
    }
    
    @Override
    public double getPerimeter(){
        return (width + length) * 2;
    }
    
    @Override
    public String toString(){
        return String.format(
                "-----Rectangle-----:\nWidth: %.1f\nLength: %.1f\nArea: %.1f\nParemeter: %.1f\n", 
                width , length ,getArea(), getPerimeter());
    }
}
