import java.util.Scanner;


/**
 * 
 * @author hs
 * date:2017年1月2日13:46:45
 *将数字替换成字母
 *要求：按ASCII码替换，如65替换成A。非字母以?替代
 *用例1：输入：{15,20,70,122,575}
 *期望结果：??fZ
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
			return "输入不能为空";
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
