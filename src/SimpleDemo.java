import java.util.Scanner;

/**
 * 
 * @author Iric
 *
 */
public class SimpleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(toTen(str));
	}

	private static String toTen(String str) {
		// TODO Auto-generated method stub
		if(str==null || str.equals("")){
			return "输入不能为空";
		}
		if(!(str.startsWith("0x") || str.startsWith("0X"))){
			return "必须以'0x'或者'0X'开头";
		}
		String result = str.substring(2, str.length());
		 
		return stringToNumber(result);
	}

	private static String stringToNumber(String result) {
		// TODO Auto-generated method stub
		result = result.toLowerCase();
		try{
			int number = Integer.parseInt(result, 16);
			if(number>=Math.pow(2, 32)){
				return "数字太大，超出范围";
			}
			return number+"";
		}catch(NullPointerException e){
			return "非法输入！！";
		}catch (NumberFormatException e) {
			// TODO: handle exception
			return "格式错误";
		}
		
		
		
	}

}
