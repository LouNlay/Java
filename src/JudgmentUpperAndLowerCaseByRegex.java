import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author hs
 *date:2017年1月2日14:03:03
 *首字母大写其余小写（正则表达式）
 *判断字符串是否符合要求（正则表达式）
 *要求首字母为大写，其它都为小写的字符串
 *用例1：输入：“Darkdss”,输出：true
 *用例2：输入：“Za12$%rksz”,输出：false
 *用例3：输入： “zrkAs”,期望结果：false
 *
 */
public class JudgmentUpperAndLowerCaseByRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String result = getResult(input);
		System.out.println(result);
	}

	private static String getResult(String input) {
		// TODO Auto-generated method stub
		if(null == input || "".equals(input)){
			return "输入不能为空！";
		}
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern pat = Pattern.compile(regex);
		Matcher matcher = pat.matcher(input);
		
		return matcher.matches()+"";
	}

}
