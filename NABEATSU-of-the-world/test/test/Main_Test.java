package test;

import org.junit.Test;

import main.Main;

public class Main_Test {

	Main main = new Main();

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void emptyArugmentTest() {
		String[] args = {};
		Main.main(args);
	}

	@Test(expected = NumberFormatException.class)
	public void stringArugmentTest() {
		String[] args = {"文字列"};
		Main.parseToInt(args[0]);
	}

}
