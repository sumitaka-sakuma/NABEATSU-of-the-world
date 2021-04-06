package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CheckStupidNum;

@SuppressWarnings("static-access")
public class CheckStupidNum_Test {

	// 普通の数字リスト
	ExpectedListValues expNormal = new ExpectedListValues();
	// アホな数字リスト
	ExpectedListValues expStupid = new ExpectedListValues();

	@Test
	public void excuteTest() {
		CheckStupidNum sut = new CheckStupidNum();
		sut.checkStupidNum(40);
		assertEquals(sut.normalNumList, expNormal.getExpectedNormalNumList());
	}

}
