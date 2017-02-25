package secret;

import java.util.Scanner;

/**
 * Ω‚√‹
 * @author hs
 *
 */
public class Decryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String pw = getDecryption(text);
		System.out.println(pw);
		sc.close();
	}

	private static String getDecryption(String text) {
		// TODO Auto-generated method stub
		char[] ch = text.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			String binaryStr = Integer.toBinaryString(ch[i]);
			char[] binaryArray = binaryStr.toCharArray();
			String txt = getPwTxt(binaryArray);
			sb.append(txt);
		}
		System.out.println("z◊Ó÷’√‹Œƒ £∫ " + sb.toString());
		return sb.toString();
	}

	private static String getPwTxt(char[] binaryArray) {
		if (binaryArray[3] == '0') {
			binaryArray[3] = '1';
		} else {
			binaryArray[3] = '0';
		}
		int temp = (Integer.parseInt(String.valueOf(binaryArray), 2));
		return String.valueOf((char)temp);
	}

}
