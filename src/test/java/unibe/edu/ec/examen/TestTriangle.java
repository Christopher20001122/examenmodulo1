package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

private  Triangle triangle;

@Before 
public void before() {
	this.triangle= new Triangle(4.1);
}

@Test
public void testcalculatePerimeter() {
	assertEquals(12.3, triangle.calculatePerimeter(), 0.10);
}

@Test 
public void testcalculateArea( ) {
	assertEquals(4.3, triangle.calculateArea(2.1),0.10);
}

@Test
public void testcalculateVolum() {
	assertEquals(5.88, triangle.calculateVolum(2.1, 4.0), 0.10);
}
}
