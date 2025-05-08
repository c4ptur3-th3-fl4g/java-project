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
public class StatementCoverageTest {

    @Test
    void testAllEven() {
        App app = new App();
        assertEquals("Positive", app.analyze(new int[]{2, 4}));
    }

    @Test
    void testAllOdd() {
        App app = new App();
        assertEquals("Negative", app.analyze(new int[]{1, 3}));
    }

    @Test
    void testZeroSum() {
        App app = new App();
        assertEquals("Zero", app.analyze(new int[]{2, -2}));
    }

}