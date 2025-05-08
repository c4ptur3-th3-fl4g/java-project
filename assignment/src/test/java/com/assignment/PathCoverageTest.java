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
public class PathCoverageTest {

    @Test
    void testEmptyArray() {
        // for-loop is skipped
        App app = new App();
        assertEquals("Zero", app.analyze(new int[]{}));
    }

    @Test
    void testEvenThenOdd() {
        App app = new App();
        assertEquals("Negative", app.analyze(new int[]{4, 9}));
        assertEquals("Negative", app.analyze(new int[]{4, 9}));
    }

    @Test
    void testZeroSumArray() {
        App app = new App();
        assertEquals("Zero", app.analyze(new int[]{4, -4}));
        // add and subtract to 0
        assertEquals("Zero", app.analyze(new int[]{4, -4}));
    }

    @Test
    void testPositivePathFinalBranch() {
        App app = new App();
        // exercise final if branch for "Positive"
        assertEquals("Positive", app.analyze(new int[]{10, 2, -3}));
    }

}