import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author hs
 *date:2017��1��2��14:03:03
 *����ĸ��д����Сд��������ʽ��
 *�ж��ַ����Ƿ����Ҫ��������ʽ��
 *Ҫ������ĸΪ��д��������ΪСд���ַ���
 *����1�����룺��Darkdss��,�����true
 *����2�����룺��Za12$%rksz��,�����false
 *����3�����룺 ��zrkAs��,���������false
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
			return "���벻��Ϊ�գ�";
		}
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern pat = Pattern.compile(regex);
		Matcher matcher = pat.matcher(input);
		
		return matcher.matches()+"";
	}

}
