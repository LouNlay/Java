
/**
 * 
 * @author hs
 * data:2017��1��3��20:10:35
 *һά�����д���ƽ��ֵ�ĸ���
 *����1������{1,2,3,4,5,6,7}���:4
 *����2������{5,5,5,5}�����0
 *����3������{}��null �����-1
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
	 * ��ȡһά�����д���ƽ��ֵ�ĸ���
	 * @param һ��һά����
	 * @return ����ƽ��ֵ������
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
	 * ����һά�����ƽ��ֵ
	 * @param input
	 * @return ƽ��ֵ
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
