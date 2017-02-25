import java.util.Scanner;


/**
 * 
 * @author hs
 * date:2017年1月3日20:33:58
 *:大小写转换
 *用例1：输入：A输出：f
 *用例2：输入：z输出：E
 *
 */
public class TranslateUpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String translateResult = translate(input);
		System.out.println(translateResult);
	}
	
	/**
	 * 
	 * @param input 英文字母
	 * @return 
	 */
	private static String translate(String input) {
		// TODO Auto-generated method stub
		if(null==input || "".equals(input)){
			return "输入不能为空";
		}
		if(input.length()>=2){
			return "只能输入一个字母";
		}
		char[] a = input.toCharArray();
		int i = a[0];
		//如果是大写A-W
		if(i>=65 && i<=85){
			return String.valueOf((char)(i+5)).toLowerCase();
		}else if(i>85 && i<=90){
			return String.valueOf((char)(i+11)).toLowerCase();
		}else if(i>=97 && i<=117){//小写字母转大写
			return String.valueOf((char)(i+5)).toUpperCase();
		}else if(i>117 && i<=122){
			return String.valueOf((char)(i-53)).toUpperCase();
		}else{
			return "非法输入";
		}
		
	}

}
