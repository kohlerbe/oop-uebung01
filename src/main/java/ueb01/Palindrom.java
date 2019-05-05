package ueb01;

import java.util.Arrays;
import java.util.*;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

		s = s.replaceAll("\\s", "");
		s = s.toLowerCase();

		char [] stringArr = s.toCharArray();

			if (stringArr.length <= 1) {

			return true;

			}

			else {


				char[] part1 = new char[stringArr.length / 2];
				char[] part2 = new char[stringArr.length / 2];

				for (int i = 0; i < part1.length; i++) {

					part1 [i] = stringArr[i];
					part2 [i] = stringArr[stringArr.length - 1 - i];

				}

				return Arrays.equals(part1, part2);

			}



	}
}
