package main;

import java.util.ArrayList;
import java.util.List;

public class CheckStupidNum {

	/**
	 * 3の倍数または、3のつく数字の時アホになる
	 * @param num 列挙する数字の上限
	 */
	public static void checkStupidNum(int num){

		NumSetterGetter nsg = new NumSetterGetter();

		// 普通の数字のリスト
		List<Integer> normalNumList = new ArrayList<>();
		// アホな数字のリスト
		List<Integer> stupidNumList = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			// 3の倍数または、3のつく数字の時アホになる
			if (i % 3 == 0 || Integer.toString(i).contains("3")) {
				stupidNumList.add(i);
				nsg.setStupidNumList(stupidNumList);
				System.out.println(i + "っっ！！");
			} else {
				normalNumList.add(i);
				nsg.setNormalNumList(normalNumList);
				System.out.println(i);
			}
		}
	}
}
