package main;

import java.util.ArrayList;
import java.util.List;

public class NumSetterGetter {

	// 普通の数字リスト
	private List<Integer> normalNumList = new ArrayList<>();
	// アホな数字リスト
	private List<Integer> stupidNumList = new ArrayList<>();

	public List<Integer> getNormalNumList() {
		return normalNumList;
	}
	public void setNormalNumList(List<Integer> normalNumList) {
		this.normalNumList = normalNumList;
	}
	public List<Integer> getStupidNumList() {
		return stupidNumList;
	}
	public void setStupidNumList(List<Integer> stupidNumList) {
		this.stupidNumList = stupidNumList;
	}
}
