import java.util.Date;
import java.util.Scanner;


/**
 * 
 * @author hs
 *���������ת����DDD:HH:MM:SS��ʽ
 *����1�����룺-1111111�����0:00:00:00
 *����2�����룺90066�����1:01:01:06
 *����3�����룺13419006�����155:07:30:06
 *
 */
public class TimeTranslater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Date date = getDate(input);
		
		System.out.println(date);
	}

	private static Date getDate(int input) {
		// TODO Auto-generated method stub
		if(input<=0){
			return new Date();
		}
		
		return null;
	}

}
