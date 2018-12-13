package com.zbq.CabiAhAf_RegularExpression_20180705;

import java.util.regex.Pattern;

public class ZPattern {
	public static void main(String[] args) {
		String content = "I am noob " + "from runoob.com.";

		String pattern = ".*runoob.*";

		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含了 'runoob' 子字符串? " + (isMatch ? "Yes" : "No"));
	}
}
