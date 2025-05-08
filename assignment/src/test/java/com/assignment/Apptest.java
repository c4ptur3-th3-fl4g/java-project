/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.assignment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
/**
 *
 * @author phuong
 */
public class Apptest {

    App app = new App();

    @Test
    void testAllEven() {
        assertEquals("Positive", app.analyze(new int[]{2, 4, 6}));
    }

    @Test
    void testAllOdd() {
        assertEquals("Negative", app.analyze(new int[]{1, 3, 5}));
    }

    @Test
    void testMixedZero() {
        assertEquals("Zero", app.analyze(new int[]{2, 2, 3, 1}));
    }

    @Test
    void testEmptyArray() {
        assertEquals("Zero", app.analyze(new int[]{}));
    }

    @Test
    void testNegativeSum() {
        assertEquals("Negative", app.analyze(new int[]{2, 1, 5}));
    }

}