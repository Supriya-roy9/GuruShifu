package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class RectangleTest {
    
    @Test
    void testAreaForPositiveNumbers(){
        Rectangle rectangle = new Rectangle(5,4);
        assertEquals(20,rectangle.calculateArea());
    }

    @Test
    void testAreaForNegativeLength(){
        Rectangle rectangle = new Rectangle(-1,2);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

    @Test
    void testAreaForNegativeBreadth(){
        Rectangle rectangle = new Rectangle(2,-1);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

    @Test
    void testAreaForNegativeDimensions(){
        Rectangle rectangle = new Rectangle(-1,-1);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }



    
}