import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author hs
 * date 2017��1��1��19:26:21
 *��ѯ�����(������ʽ)
 *
 *�����ַ�����Genetics  To  undergo  or cause recombination; form new combinations
 *���������recombination
 *
 *�����ַ�����Genetics  0123456789101 undergo  or cause recombination; form new combinations
 *���������0123456789101
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
			return "���벻��Ϊ��";
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
		//������ȷȥ���ֺţ������߽�else���棬����ȥ�����һλ����������
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
