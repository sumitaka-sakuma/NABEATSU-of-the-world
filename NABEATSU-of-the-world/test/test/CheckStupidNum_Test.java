package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.CheckStupidNum;

@SuppressWarnings("static-access")
public class CheckStupidNum_Test {

	ExpectedListValues expNormal = new ExpectedListValues();
	ExpectedListValues expStupid = new ExpectedListValues();

	@Before
	public void setUp() {
		expNormal.getExpectedNormalNumList();
	}

	@Test
	public void test() {
		CheckStupidNum sut = new CheckStupidNum();
		sut.checkStupidNum(40);
		assertEquals(sut.normalNumList, expNormal.getExpectedNormalNumList());
	}

}
