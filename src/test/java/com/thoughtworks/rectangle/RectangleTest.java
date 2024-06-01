package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class RectangleTest {
    
    @Test
    void shouldReturnAreaWhenBothLengthAndBreadthArePositive(){
        Rectangle rectangle = new Rectangle(5,4);
        assertEquals(20,rectangle.calculateArea());
    }

    @Test
    void shouldNotReturnAreaWhenLengthIsNegative(){
        Rectangle rectangle = new Rectangle(-1,2);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

    @Test
    void shouldNotReturnAreaWhenBreadthIsNegative(){
        Rectangle rectangle = new Rectangle(2,-1);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

    @Test
    void shouldNotReturnAreaWhenBothLengthAndBreadthAreNegative(){
        Rectangle rectangle = new Rectangle(-1,-1);
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }



    
}