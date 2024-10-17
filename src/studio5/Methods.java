package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return distance;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);
		StdDraw.setPenColor(0,109,219);
		StdDraw.filledCircle(x, y, radius * .75);
		// TODO: Draw the remaining rings of the bull's eye
		// Blue ring with 3.0/4.0 the radius
		// suggested rgb values: 0, 109, 219

		StdDraw.setPenColor(146, 0, 0);
		StdDraw.filledCircle(x, y, radius * .5);

		// Red ring with 1.0/2.0 the radius
		// suggested rgb values: 146, 0, 0
		
		StdDraw.setPenColor(255, 255, 109);
		StdDraw.filledCircle(x, y, radius * .25);
		

		// Yellow ring with 1.0/4.0 the radius
		// suggested rgb values: 255, 255, 109

		
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
    public static String substituteAll(String source, char target, String replacement) {
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < source.length(); i++) {
            char currentChar = source.charAt(i);

            if (currentChar == target) {
                result.append(replacement); 
            } else {
                result.append(currentChar); 
            }
        }

        return result.toString(); 
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
    public static int arraySum(int[] values) {
        int sum = 0; 
        
        for (int value : values) {
            sum += value;
        }
        
        return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
    public static int[] filledArray(int length, int value) {
        int[] values = new int[length];

        for (int i = 0; i < length; i++) {
            values[i] = value; 
        }

        return values;
	}

	// TODO: Create an arrayMean method which accepts an int array of values parameter.
	// TODO: Create a JavaDoc comment for the arrayMean method.

	
}
