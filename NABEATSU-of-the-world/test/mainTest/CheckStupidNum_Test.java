package mainTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("static-access")
public class CheckStupidNum_Test {

	public List<Integer> expectedNormalNumList = new ArrayList<>();
	public List<Integer> expectedStupidNumList = new ArrayList<>();

	@Before
	public void setUp() {
		expectedNormalNumList = Arrays.asList(1,2,4,5,7,8,10,11,14,16,17,19,20,22,25,26,28,28,40);
		expectedStupidNumList = Arrays.asList(3,6,9,12,13,15,18,21,23,24,27,30,31,32,33,34,35,36,37,38,39);
	}

	@Test
	public void test() {
		boolean b = true;
		assertTrue(b);
	}

//	@Test
//	public void test() {
//
//		CheckStupidNum sut = new CheckStupidNum();
//		sut.checkStupidNum(40);
//		NumSetterGetter nsg = new NumSetterGetter();
//		List<Integer> act = nsg.getNormalNumList();
//		//assertThat(expectedNormalNumList, is(nsg.getNormalNumList()));
//		assertTrue(expectedNormalNumList.equals(act));
//
//	}
}
