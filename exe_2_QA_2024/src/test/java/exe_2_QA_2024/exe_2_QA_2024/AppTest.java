package exe_2_QA_2024.exe_2_QA_2024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue; 

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	Task2_Q1And2 tester = new Task2_Q1And2();
	Task2_Q1And2 TriangleClassifier = new Task2_Q1And2();
/**
 * Rigorous Test :-)
 */
	
//	assertEquals => ensures the output matches the expected value.

	@Test
    public void testTC1() {
        assertEquals("Real roots", tester.classifyRoots(5, 5, 5)); // Failures
//        assertEquals("Real roots", tester.classifyRoots(5, 15, 10)); // Its without failures
    }

    @Test
    public void testTC2() {
        assertEquals("Real roots", tester.classifyRoots(6, 6, 6)); // Failures
//        assertEquals("Real roots", tester.classifyRoots(6, 16, 10)); // // Its without failures

    }

    @Test
    public void testTC3() {
        assertEquals("Real roots", tester.classifyRoots(25, 100, 75));
    }

    @Test
    public void testTC4() {
        assertEquals("Imaginary roots", tester.classifyRoots(199, 199, 199));
    }

    @Test
    public void testTC5() {
        assertEquals("Imaginary roots", tester.classifyRoots(200, 200, 200));
    }

    @Test
    public void testTC6() {
        assertEquals("Error: Out of range", tester.validateInput(203, 202, 201));
    }

    @Test
    public void testTC7() {
        assertEquals("Error: Out of range", tester.validateInput(204, 203, 202));
    }

    @Test
    public void testTC8() {
        assertEquals("Error: Out of range", tester.validateInput(240, 235, 230));
    }

    @Test
    public void testTC9() {
        assertEquals("Error: Out of range", tester.validateInput(4, 4, 4));
    }

    @Test
    public void testTC10() {
        assertEquals("Error: Out of range", tester.validateInput(3, 3, 3));
    }
    
    @Test
    public void testTC11() {
        assertEquals("Not a quadratic equation", tester.classifyRoots(0, 3, 4));
    }
    
    // 	
    
    @Test
    public void TC1() {
        assertEquals("Not a Triangle", TriangleClassifier.classifyTriangle(2, 2, 5));
    }

    @Test
    public void TC2() {
        assertEquals("Not a Triangle", TriangleClassifier.classifyTriangle(2, 5, 2));
    }

    @Test
    public void TC3() {
        assertEquals("Not a Triangle", TriangleClassifier.classifyTriangle(5, 2, 2));
    }

    @Test
    public void TC4() {
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(6, 7, 8));
    }

    @Test
    public void TC5() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 5, 7));
    }

    @Test
    public void TC6() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(7, 5, 5));
    }

    @Test
    public void TC7() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 7, 5));
    }

    @Test
    public void TC8() {
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(6, 6, 6));
    }

    @Test
    public void TC9() {
        assertEquals("Not a Triangle", TriangleClassifier.classifyTriangle(1, 1, 10));
    }
}