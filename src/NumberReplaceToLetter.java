import java.util.Scanner;


/**
 * 
 * @author hs
 * date:2017��1��2��13:46:45
 *�������滻����ĸ
 *Ҫ�󣺰�ASCII���滻����65�滻��A������ĸ��?���
 *����1�����룺{15,20,70,122,575}
 *���������??fZ
 *
 */
public class NumberReplaceToLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputarr = {15,20,70,122,575};
		String result = getLetter(inputarr);
		System.out.println(result);
	}

	private static String getLetter(int[] inputarr) {
		// TODO Auto-generated method stub
		if(null == inputarr || "".equals(inputarr)){
			return "���벻��Ϊ��";
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < inputarr.length; i++) {
			if((inputarr[i]>=65 && inputarr[i]<=90) || (inputarr[i]>=97 && inputarr[i]<=122)){
				sb.append((char)inputarr[i]);
			}else{
				sb.append("?");
			}
		}
		return sb.toString();
	}

}
