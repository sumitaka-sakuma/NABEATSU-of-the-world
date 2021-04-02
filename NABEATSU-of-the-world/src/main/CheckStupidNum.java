package main;

public class CheckStupidNum {

	public static void checkStupidNum(int num){

		//System.out.println(num);

		for (int i = 1; i <= num; i++) {

			// 3の倍数または、3のつく数字の時アホになる
			if (i % 3 == 0 || Integer.toString(i).contains("3")) {
				System.out.println(i + "っっ！！");
			} else {
				System.out.println(i);
			}
		}
	}
}
