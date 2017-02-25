import java.util.Date;
import java.util.Scanner;


/**
 * 
 * @author hs
 *将输入的秒转换成DDD:HH:MM:SS格式
 *用例1：输入：-1111111输出：0:00:00:00
 *用例2：输入：90066输出：1:01:01:06
 *用例3：输入：13419006输出：155:07:30:06
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
