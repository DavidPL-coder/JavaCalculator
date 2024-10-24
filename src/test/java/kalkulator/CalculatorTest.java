package kalkulator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
	@Test
	public void testAddOne() {
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();

		// Act
		boolean wasAdded = sut.add(1);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("0+1 = 1", 1, sut.getState());
	}

	@Test
	public void testAddZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(1);
		boolean wasAdded = sut.add(0);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("1+0 = 1", 1, sut.getState());
	}

	@Test
	public void testAddPositiveNumberToMaxStateValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(Integer.MAX_VALUE);
		boolean wasAdded = sut.add(1);

		// Assert
		assertFalse("expected returned value: false", wasAdded);
		assertEquals("state should be still Integer.MAX_VALUE", Integer.MAX_VALUE, sut.getState());
	}

	@Test
	public void testAddNegativeNumber() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasAdded = sut.add(-1);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("0+(-1) = -1", -1, sut.getState());
	}

	@Test
	public void testAddNegativeNumberToMinStateValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(Integer.MIN_VALUE);
		boolean wasAdded = sut.add(-1);

		// Assert
		assertFalse("expected returned value: false", wasAdded);
		assertEquals("state should be still Integer.MIN_VALUE", Integer.MIN_VALUE, sut.getState());
	}

	@Test
	public void testAddTwoNegativeNumbers() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(-1);
		boolean wasAdded = sut.add(-1);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("-1+(-1) = -2", -2, sut.getState());
	}

	@Test
	public void testMultWhenStateValueIsOne() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(1);
		boolean wasMultiplied = sut.mult(2);

		// Assert
		assertTrue("expected returned value: true", wasMultiplied);
		assertEquals("1*2 = 2", 2, sut.getState());
	}

	@Test
	public void testMultWhenStateValueIsZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasMultiplied = sut.mult(3);

		// Assert
		assertTrue("expected returned value: true", wasMultiplied);
		assertEquals("0*3 = 0", 0, sut.getState());
	}

	@Test
	public void testMultByZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(3);
		boolean wasMultiplied = sut.mult(0);

		// Assert
		assertTrue("expected returned value: true", wasMultiplied);
		assertEquals("3*0 = 0", 0, sut.getState());
	}

	@Test
	public void testMultWhenStateValueIsPositiveButNotOneOrZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(2);
		boolean wasMultiplied = sut.mult(2);

		// Assert
		assertTrue("expected returned value: true", wasMultiplied);
		assertEquals("2*2 = 4", 4, sut.getState());
	}

	@Test
	public void testMultWhenStateValueIsNegative() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(-2);
		boolean wasMultiplied = sut.mult(2);

		// Assert
		assertTrue("expected returned value: true", wasMultiplied);
		assertEquals("-2*2 = -4", -4, sut.getState());
	}

	@Test
	public void testMultTwoNegativeNumbers() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(-2);
		boolean wasMultiplied = sut.mult(-2);

		// Assert
		assertTrue("expected returned value: true", wasMultiplied);
		assertEquals("-2*(-2) = 4", 4, sut.getState());
	}

	@Test
	public void testMultWhenResultExceedMaxStateValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(Integer.MAX_VALUE);
		boolean wasMultiplied = sut.mult(2);

		// Assert
		assertFalse("expected returned value: false", wasMultiplied);
		assertEquals("state should be still Integer.MAX_VALUE", Integer.MAX_VALUE, sut.getState());
	}

	@Test
	public void testMultWhenResultExceedMinStateValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(Integer.MIN_VALUE);
		boolean wasMultiplied = sut.mult(2);

		// Assert
		assertFalse("expected returned value: false", wasMultiplied);
		assertEquals("state should be still Integer.MIN_VALUE", Integer.MIN_VALUE, sut.getState());
	}

	@Test
	public void testSubtractPositiveNumber() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasSubtracted = sut.subtract(1);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("0-1 = -1", -1, sut.getState());
	}

	@Test
	public void testSubtractZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(1);
		boolean wasSubtracted = sut.subtract(0);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("1-0 = 1", 1, sut.getState());
	}

	@Test
	public void testSubtractPositiveNumberFromMinStateValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(Integer.MIN_VALUE);
		boolean wasSubtracted = sut.subtract(1);

		// Assert
		assertFalse("expected returned value: false", wasSubtracted);
		assertEquals("state should be still Integer.MIN_VALUE", Integer.MIN_VALUE, sut.getState());
	}

	@Test
	public void testSubtractNegativeNumber() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasSubtracted = sut.subtract(-1);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("0-(-1) = 1", 1, sut.getState());
	}

	@Test
	public void testSubtractNegativeNumberFromMaxStateValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(Integer.MAX_VALUE);
		boolean wasSubtracted = sut.subtract(-1);

		// Assert
		assertFalse("expected returned value: false", wasSubtracted);
		assertEquals("state should be still Integer.MAX_VALUE", Integer.MAX_VALUE, sut.getState());
	}

	@Test
	public void testSubtractTwoNegativeNumbers() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(-1);
		boolean wasSubtracted = sut.subtract(-1);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("-1-(-1) = 0", 0, sut.getState());
	}

	@Test
	public void testDivideTwoPositiveNumbers() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(10);
		boolean wasDivided = sut.divide(5);

		// Assert
		assertTrue("expected returned value: true", wasDivided);
		assertEquals("10/5 = 2", 2, sut.getState());
	}

	@Test
	public void testDivideWhenStateValueIsNegative() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(-2);
		boolean wasDivided = sut.divide(2);

		// Assert
		assertTrue("expected returned value: true", wasDivided);
		assertEquals("-2*2 = -1", -1, sut.getState());
	}

	@Test
	public void testDivideTwoNegativeNumbers() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(-4);
		boolean wasDivided = sut.divide(-2);

		// Assert
		assertTrue("expected returned value: true", wasDivided);
		assertEquals("-4/(-2) = 2", 2, sut.getState());
	}

	@Test
	public void testDivideWhenStateValueIsZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasDivided = sut.divide(3);

		// Assert
		assertTrue("expected returned value: true", wasDivided);
		assertEquals("0/3 = 0", 0, sut.getState());
	}

	@Test
	public void testDivideByZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(3);
		boolean wasDivided = sut.divide(0);

		// Assert
		assertFalse("expected returned value: false", wasDivided);
		assertEquals("state should be still 3", 3, sut.getState());
	}

	@Test
	public void testDivideByOne() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(3);
		boolean wasDivided = sut.divide(1);

		// Assert
		assertTrue("expected returned value: true", wasDivided);
		assertEquals("3/1 = 3", 3, sut.getState());
	}

	@Test
	public void testDivideWhenModuloIsNotZero() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setState(7);
		boolean wasDivided = sut.divide(2);

		// Assert
		assertTrue("expected returned value: true", wasDivided);
		assertEquals("7/2 = 3", 3, sut.getState());
	}

	@Test
	public void testAddPositiveNumberToMemory() {
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();

		// Act
		boolean wasAdded = sut.addToMemory(1);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("0+1 = 1", 1, sut.getMemory());
	}

	@Test
	public void testAddZeroToMemory() {
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(1);
		boolean wasAdded = sut.addToMemory(0);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("1+0 = 1", 1, sut.getMemory());
	}

	@Test
	public void testAddPositiveNumberToMaxMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(Integer.MAX_VALUE);
		boolean wasAdded = sut.addToMemory(1);

		// Assert
		assertFalse("expected returned value: false", wasAdded);
		assertEquals("memory should be still Integer.MAX_VALUE", Integer.MAX_VALUE, sut.getMemory());
	}

	@Test
	public void testAddNegativeNumberToMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasAdded = sut.addToMemory(-1);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("0+(-1) = -1", -1, sut.getMemory());
	}

	@Test
	public void testAddNegativeNumberToMinMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(Integer.MIN_VALUE);
		boolean wasAdded = sut.addToMemory(-1);

		// Assert
		assertFalse("expected returned value: false", wasAdded);
		assertEquals("memory should be still Integer.MIN_VALUE", Integer.MIN_VALUE, sut.getMemory());
	}

	@Test
	public void testAddNegativeNumberToMemoryWithNegativeValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(-1);
		boolean wasAdded = sut.addToMemory(-1);

		// Assert
		assertTrue("expected returned value: true", wasAdded);
		assertEquals("-1+(-1) = -2", -2, sut.getMemory());
	}

	@Test
	public void testSubtractPositiveNumberFromMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasSubtracted = sut.substractToMemory(1);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("0-1 = -1", -1, sut.getMemory());
	}

	@Test
	public void testSubtractZeroFromMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(1);
		boolean wasSubtracted = sut.substractToMemory(0);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("1-0 = 1", 1, sut.getMemory());
	}

	@Test
	public void testSubtractPositiveNumberFromMinMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(Integer.MIN_VALUE);
		boolean wasSubtracted = sut.substractToMemory(1);

		// Assert
		assertFalse("expected returned value: false", wasSubtracted);
		assertEquals("memory should be still Integer.MIN_VALUE", Integer.MIN_VALUE, sut.getMemory());
	}

	@Test
	public void testSubtractNegativeNumberFromMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		boolean wasSubtracted = sut.substractToMemory(-1);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("0-(-1) = 1", 1, sut.getMemory());
	}

	@Test
	public void testSubtractNegativeOneFromMaxMemory() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(Integer.MAX_VALUE);
		boolean wasSubtracted = sut.substractToMemory(-1);

		// Assert
		assertFalse("expected returned value: false", wasSubtracted);
		assertEquals("memory should be still Integer.MAX_VALUE", Integer.MAX_VALUE, sut.getMemory());
	}

	@Test
	public void testSubtractNegativeNumberFromMemoryWithNegativeValue() {
		// Arrange
		Calculator sut = new Calculator();

		// Act
		sut.setMemory(-1);
		boolean wasSubtracted = sut.substractToMemory(-1);

		// Assert
		assertTrue("expected returned value: true", wasSubtracted);
		assertEquals("-1-(-1) = 0", 0, sut.getMemory());
	}
}
