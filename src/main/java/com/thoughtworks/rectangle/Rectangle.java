package com.thoughtworks.rectangle;

public class Rectangle{
    
     private int length;
     private int breadth;

     public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
     }
     
    public int calculateArea(){
        if(length<0)
        throw new IllegalArgumentException(("Length must be non-negative"));
        if(breadth<0)
        throw new IllegalArgumentException(("Breadth must be non-negative"));
        if(length<0 && breadth<0)
        throw new IllegalArgumentException(("Both dimensions must be non-negative"));


        return length*breadth;
    }

}