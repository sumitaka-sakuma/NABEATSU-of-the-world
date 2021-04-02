package main;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// 引数チェック
		if (args.length == 0) {
			throw new ArrayIndexOutOfBoundsException("引数として数字を入力してください");
		}
		// 引数を数値に変換
		int num = parseToint(args[0]);

		// 数字を判定する
		CheckStupidNum csn = new CheckStupidNum();
		csn.checkStupidNum(num);
	}

	/**
	 * 引数を数値に変換
	 * @param arg コマンドライン引数
	 * @return 数値に変換された値
	 */
	public static int parseToint(String arg) {

		int num = 0;
		try {
			num = Integer.parseInt(arg);
		} catch (NumberFormatException ex) {
			throw new NumberFormatException("数値に変換できません");
		}
		return num;
	}
}
