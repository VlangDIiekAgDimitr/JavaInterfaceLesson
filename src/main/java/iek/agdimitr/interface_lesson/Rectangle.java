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
public class Rectangle implements Shape{
    
    int length, width;
    
//constructor
    public Rectangle (int l, int w){
        this.length=l;
        this.width=w;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area() {
        return (double) (length*width);
    }
    
}
