
/**
 * 
 * @author Aric
 * date:2016��12��30��22:56:24
 * ��ȡ��ά������ÿ����Сֵ
 * ����1���������飺{{3,6,5},{0,2,10},{10,8,9}}
 * ���������{0,2,5}
 * ����2����������{{3,6,5},{0,2,10},{10,8,9},{11,12,13,14}}
 * ���������{0,2,5,14}
 * ����2���������飺{{3,6,5},{0,2,10},{10,8,9},{-1}}
 * ���������{0,2,5,14}
 * 
 *
 */
public class MinNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] twodimensional = {{3,6,5},{0,2,10},{10,8,9}};
		
		int[] result = getResult(getArrayByColumn(twodimensional));
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

	private static int[][] getArrayByColumn(int[][] twodimensional) {
		// TODO Auto-generated method stub
		//��ȡ��ά������һά�������󳤶�
		int maxLength = getMaxLength(twodimensional);
		
		int[][] translateArray = new int[twodimensional.length][maxLength];
		//��ÿһ����Ϊһ�����鴦��
		for (int i = 0; i < twodimensional.length; i++) {
			for (int j = 0; j < twodimensional[i].length; j++) {
				translateArray[j][i] = twodimensional[i][j];
			}
		}
		return translateArray;
	}

	private static int getMaxLength(int[][] twodimensional) {
		// TODO Auto-generated method stub
		int maxLength = twodimensional[0][0];
		for (int i = 0; i < twodimensional.length; i++) {
				if(twodimensional[i].length > maxLength){
					maxLength = twodimensional[i].length;
				}
		}
		return maxLength;
	}

	private static int[] getResult(int[][] twodimensional) {
		// TODO Auto-generated method stub
		if(null==twodimensional || "".equals(twodimensional)){
			//���Ϊ�գ�����һ��������
			return new int[0];
		}
		
		int[] result = new int[twodimensional.length];
		
		for (int i = 0; i < twodimensional.length; i++) {
				result[i]=getMinNumber(twodimensional[i]);
		}
		return result;
	}

	private static int getMinNumber(int[] is) {
		// TODO Auto-generated method stub
		//�������Ϊ�գ�����int��Сֵ��
		if(null == is || "".equals(is)){
			return Integer.MIN_VALUE;
		}
		int minNumber = is[0];
		for (int i = 0; i < is.length; i++) {
			if(is[i]<minNumber){
				minNumber = is[i];
			}
		}
		return minNumber;
	}

}
