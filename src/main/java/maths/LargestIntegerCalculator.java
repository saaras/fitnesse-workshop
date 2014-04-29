package maths;

import org.apache.commons.lang.math.NumberUtils;

public class LargestIntegerCalculator {

	public int largestInteger(String integersAsString) {
		String[] split = integersAsString.split(",");
		int[] integers = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			Integer num = null;
			try {

				num = Integer.parseInt(split[i].trim());
			} catch (Exception e) {
				continue;
			}
			integers[i] = num;
		}

		return NumberUtils.max(integers);
	}

}
