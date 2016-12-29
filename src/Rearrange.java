import java.util.Scanner;

/**
 * 
 * @author hs
 *按规定重排给定字符串要求：输入一个字符串，字符串是字母和数字的组合，
 *（非字母数字直接删除）实现输出一个新的字符串，要求字母在前面，数字在后面，顺序不变。
 */
public class Rearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		
		String result = toReArrange(str);
		System.out.println(result);
	}

	private static String toReArrange(String str) {
		if(str.equals("") || null == str){
			return "输入不能为空！";
		}
		char[] charray = str.toCharArray();
		StringBuffer letter = new StringBuffer();
		StringBuffer number = new StringBuffer();
		
		for (int i = 0; i < charray.length; i++) {
			if((charray[i]>=65 && charray[i]<=90) || (charray[i]>=97 && charray[i]<=122)){
				letter.append(charray[i]);
			}else if(charray[i]>=48 && charray[i]<=57){
				number.append(charray[i]);
			}
		}
		
		return letter.toString()+number.toString();
		// TODO Auto-generated method stub
		
	}

}
