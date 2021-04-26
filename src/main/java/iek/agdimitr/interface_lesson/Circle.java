/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.interface_lesson;

/**
 *
 * @author User
 */
public class Circle implements Shape{
    double pi = 3.14;
    int radius;
    
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area() {
        return (double) (radius*radius*pi);
    }
    
}
