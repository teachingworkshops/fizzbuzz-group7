import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    public void testCalculateThing() {
        assertEquals("Incorrect", main.calculateThing(-99));
        assertEquals("Incorrect", main.calculateThing(-1));
        assertEquals("Incorrect", main.calculateThing(0));
        // For "00" and "0.0", the test cases would be invalid as they are not integers and cannot be passed to the calculateThing method
        assertEquals("1", main.calculateThing(1));
        assertEquals("2", main.calculateThing(2));
        assertEquals("fizz", main.calculateThing(3));
        assertEquals("4", main.calculateThing(4));
        assertEquals("buzz", main.calculateThing(5));
        assertEquals("fizz", main.calculateThing(6));
        assertEquals("7", main.calculateThing(7));
        assertEquals("fizz", main.calculateThing(9));
        assertEquals("buzz", main.calculateThing(10));
        assertEquals("11", main.calculateThing(11));
        assertEquals("14", main.calculateThing(14));
        assertEquals("fizz buzz", main.calculateThing(15));
        assertEquals("16", main.calculateThing(16));
        assertEquals("29", main.calculateThing(29));
        assertEquals("fizz buzz", main.calculateThing(30));
    }

}
