package exe_2_QA_2024.exe_2_QA_2024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue; 

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	Task2_Q1And2 tester = new Task2_Q1And2();
//	Task2_Q1And2 TriangleClassifier = new Task2_Q1And2();
/**
 * Rigorous Test :-)
 */
	
//	assertEquals => ensures the output matches the expected value.

	//EX1
	@Test
    public void testTC1() {
        assertEquals("Imaginary roots", tester.classifyRoots(5, 15, 15));
    }

    @Test
    public void testTC2() {
        assertEquals("Real roots", tester.classifyRoots(6, 61, 16)); 
    }

    @Test
    public void testTC3() {
        assertEquals("Imaginary roots", tester.classifyRoots(199, 100, 75));
    }

    @Test
    public void testTC4() {
        assertEquals("Imaginary roots", tester.classifyRoots(200, 5, 18));
    }

    @Test
    public void testTC5() {
        assertEquals("Imaginary roots", tester.classifyRoots(15, 5, 150));
    }

    @Test
    public void testTC6() {
        assertEquals("Imaginary roots", tester.classifyRoots(66, 6, 100));
    }

    @Test
    public void testTC7() {
        assertEquals("Real roots", tester.classifyRoots(12, 199, 66));
    }

    @Test
    public void testTC8() {
        assertEquals("Real roots", tester.classifyRoots(77, 200, 100));
    }

    @Test
    public void testTC9() {
        assertEquals("Real roots", tester.classifyRoots(41, 44, 5));
    }

    @Test
    public void testTC10() {
        assertEquals("Imaginary roots", tester.classifyRoots(77, 35, 6));
    }
    
    @Test
    public void testTC11() {
        assertEquals("Imaginary roots", tester.classifyRoots(98, 43, 199));
    }

    @Test
    public void testTC12() {
        assertEquals("Imaginary roots", tester.classifyRoots(44, 21, 200));
    }
    
    @Test
    public void testTC13() {
        assertEquals("Imaginary roots", tester.classifyRoots(100, 100, 100));
    }
    
    @Test
    public void testTC14() {
        assertEquals("Not a quadratic equation", tester.classifyRoots(0, 5, 199));
    }
 
 	
    //EX2
    @Test
    public void TC1() {
        assertEquals("Not a Triangle", tester.classifyTriangle(2, 2, 5));
    }

    @Test
    public void TC2() {
        assertEquals("Not a Triangle", tester.classifyTriangle(2, 5, 2));
    }

    @Test
    public void TC3() {
        assertEquals("Not a Triangle", tester.classifyTriangle(5, 2, 2));
    }

    @Test
    public void TC4() {
        assertEquals("Scalene", tester.classifyTriangle(6, 7, 8));
    }

    @Test
    public void TC5() {
        assertEquals("Isosceles", tester.classifyTriangle(5, 5, 7));
    }

    @Test
    public void TC6() {
        assertEquals("Isosceles", tester.classifyTriangle(7, 5, 5));
    }

    @Test
    public void TC7() {
        assertEquals("Isosceles", tester.classifyTriangle(5, 7, 5));
    }

    @Test
    public void TC8() {
        assertEquals("Equilateral", tester.classifyTriangle(6, 6, 6));
    }

    @Test
    public void TC9() {
        assertEquals("Not a Triangle", tester.classifyTriangle(1, 1, 10));
    }
}