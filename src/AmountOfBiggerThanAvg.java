
/**
 * 
 * @author hs
 * data:2017年1月3日20:10:35
 *一维数组中大于平均值的个数
 *用例1：输入{1,2,3,4,5,6,7}输出:4
 *用例2：输入{5,5,5,5}输出：0
 *用例3：输入{}或null 输出：-1
 *
 */
public class AmountOfBiggerThanAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {};
		int amount = getAmountBiggerThanAvg(input);
		System.out.println(amount);
	}
	/**
	 * 获取一维数组中大于平均值的个数
	 * @param 一个一维数组
	 * @return 大于平均值的数量
	 */
	private static int getAmountBiggerThanAvg(int[] input) {
		// TODO Auto-generated method stub
		if(0==input.length){
			return -1;
		}
		int average = getAverage(input);
		int amount = 0;
		for (int i = 0; i < input.length; i++) {
			if(input[i]>average){
				amount++;
			}
		}
		return amount;
	}
	
	/**
	 * 计算一维数组的平均值
	 * @param input
	 * @return 平均值
	 */
	private static int getAverage(int[] input) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < input.length; i++) {
			sum+=input[i];
		}
		return sum/input.length;
	}

}
