import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author hs
 * date 2017年1月1日19:26:21
 *查询最长单词(正则表达式)
 *
 *输入字符串：Genetics  To  undergo  or cause recombination; form new combinations
 *期望结果：recombination
 *
 *输入字符串：Genetics  0123456789101 undergo  or cause recombination; form new combinations
 *期望结果：0123456789101
 */
public class QueryMaxLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		String input = "Genetics  012345678933 undergo  or cause recombination; form new combinations";
		String result = getMaxLength(input);
		System.out.println(result);
	}

	private static String getMaxLength(String input) {
		// TODO Auto-generated method stub
		if(null == input || "".equals(input)){
			return "输入不能为空";
		}
		String regex = "\\s+";
		String[] strArry = input.split(regex);
		String temp = "";
		for (int i = 0; i < strArry.length; i++) {
			if(strArry[i].length() > temp.length()){
				temp = strArry[i];
			}
		}
		
//		return removePunctuation(temp);
		return temp;
	}

	private static String removePunctuation(String temp) {
		//不能正确去掉分号，总是走进else里面，总是去掉最后一位，问题待解决
		// TODO Auto-generated method stub
		String regex = "[a-zA-Z0-9]";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(temp);
		if(matcher.matches()){
			return temp;
		}else {
			char[] array = temp.toCharArray();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length-1; i++) {
				sb.append(array[i]);
			}
			
			return sb.toString();
		}
	}

}
