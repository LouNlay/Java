import java.util.Scanner;

/**
 * 
 * @author hs
 *���涨���Ÿ����ַ���Ҫ������һ���ַ������ַ�������ĸ�����ֵ���ϣ�
 *������ĸ����ֱ��ɾ����ʵ�����һ���µ��ַ�����Ҫ����ĸ��ǰ�棬�����ں��棬˳�򲻱䡣
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
			return "���벻��Ϊ�գ�";
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
