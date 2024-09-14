package ex01;

public class 코드처리하기 {

	class Solution {
		public String solution(String code) {
			int mode = 0;
			String ret = "";

			for (int idx = 0; idx < code.length(); idx++) {
				if (code.charAt(idx) == '1') {
					mode = 1 - mode;
				} else if (mode == 0 && idx % 2 == 0) {
					ret += code.charAt(idx);
				} else if (mode == 1 && idx % 2 == 1) {
					ret += code.charAt(idx);
				}
			}
			if (ret.equals("")) {
				return "EMPTY";
			} else {
				return ret;
			}
		}
	}

}
