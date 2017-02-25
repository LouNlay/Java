import java.util.Scanner;


/**
 * 
 * @author hs
 * date:2017��1��3��20:33:58
 *:��Сдת��
 *����1�����룺A�����f
 *����2�����룺z�����E
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
	 * @param input Ӣ����ĸ
	 * @return 
	 */
	private static String translate(String input) {
		// TODO Auto-generated method stub
		if(null==input || "".equals(input)){
			return "���벻��Ϊ��";
		}
		if(input.length()>=2){
			return "ֻ������һ����ĸ";
		}
		char[] a = input.toCharArray();
		int i = a[0];
		//����Ǵ�дA-W
		if(i>=65 && i<=85){
			return String.valueOf((char)(i+5)).toLowerCase();
		}else if(i>85 && i<=90){
			return String.valueOf((char)(i+11)).toLowerCase();
		}else if(i>=97 && i<=117){//Сд��ĸת��д
			return String.valueOf((char)(i+5)).toUpperCase();
		}else if(i>117 && i<=122){
			return String.valueOf((char)(i-53)).toUpperCase();
		}else{
			return "�Ƿ�����";
		}
		
	}

}
