/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.agdimitr.interface_lesson;

/**
 *
 * @author avlonitiss
 */
// Πρόγραμμα Java για παρουσίαση
// της έννοιας ττου interface
public class InterfaceLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         // Αρχικοποίηση αντικειμένου Rectangle class
        // με αναφορά στο Shape interface
        
        Shape rect = new Rectangle(2, 3);
        System.out.println("Area of rectangle: " 
                           + rect.area()); //μέθοδος από interface
                                          // που ορίστηκε στην κλάση
 
         // Αρχικοποίηση αντικειμένου Circle class
        // με αναφορά στο Shape interface
        
        Shape circle = new Circle(2);
        System.out.println("Area of circle: "
                           + circle.area());
    }
    
    
}
