package maths;

public class AdditionCalculator {

	public int addIntegersTogether(String str) {
		String[] arr = str.split(" ");
		int res = 0;
		for (String i : arr) {
			res += Integer.valueOf(i);
		}

		return res;
	}

}
