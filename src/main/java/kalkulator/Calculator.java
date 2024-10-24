package kalkulator;

public class Calculator {
	private int state = 0;
	private int memory = 0;

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public boolean add(int value) {
		try {
			this.state = Math.addExact(this.state, value);
			return true;
		} catch (ArithmeticException ex) {
			return false;
		}
	}

	public boolean subtract(int value) {
		try {
			this.state = Math.subtractExact(this.state, value);
			return true;
		} catch (ArithmeticException ex) {
			return false;
		}
	}

	public boolean mult(int value) {
		try {
			this.state = Math.multiplyExact(this.state, value);
			return true;
		} catch (ArithmeticException ex) {
			return false;
		}
	}

	public boolean divide(int value) {
		if (value == 0)
			return false;

		this.state /= value;
		return true;
	}

	public void setMemory(int value) {
		this.memory = value;
	}

	public int getMemory() {
		return this.memory;
	}

	public boolean addToMemory(int value) {
		try {
			this.memory = Math.addExact(this.memory, value);
			return true;
		} catch (ArithmeticException ex) {
			return false;
		}
	}

	public boolean substractToMemory(int value) {
		try {
			this.memory = Math.subtractExact(this.memory, value);
			return true;
		} catch (ArithmeticException ex) {
			return false;
		}
	}
}
