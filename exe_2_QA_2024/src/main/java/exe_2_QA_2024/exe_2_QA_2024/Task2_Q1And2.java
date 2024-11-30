package exe_2_QA_2024.exe_2_QA_2024;

public class Task2_Q1And2 {

	
//	The classifyRoots method determines the type of roots based on the discriminant.
    public String classifyRoots(int a, int b, int c) {
        if (a == 0) {
            return "Not a quadratic equation";
        }

        int discriminant = (b * b) - (4 * a * c);
        System.out.println(discriminant);

        if (discriminant > 0) {
            return "Real roots";
        } else if (discriminant == 0) {
            return "Equal roots";
        } else {
            return "Imaginary roots";
        }
    }
//    The validateInput method ensures the input values are within the valid range 

    public String validateInput(int a, int b, int c) {
    	boolean ch = a < 5 || a > 200 || b < 5 || b > 200 || c < 5 || c > 200;
    	System.out.println(ch);
        if (ch) {
            return "Error: Out of range";
        }
        return null;
    }
    
    //Ex2
    public static String classifyTriangle(int a, int b, int c) {
        // Check if inputs can form a triangle
        if (a + b <= c || b + c <= a || c + a <= b) {
            return "Not a Triangle";
        }

        // Check for equilateral triangle
        if (a == b && b == c) {
            return "Equilateral";
        }

        // Check for isosceles triangle
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }

        // Check for scalene triangle
        if (a != b && b != c && a != c) {
            return "Scalene";
        }

        // If none of the above, return impossible (should never reach here)
        return "Impossible";
    }
}
