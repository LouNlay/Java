
/**
 * 
 * @author Aric
 * date:2016年12月30日22:56:24
 * 获取二维数组中每列最小值
 * 用例1：输入数组：{{3,6,5},{0,2,10},{10,8,9}}
 * 期望结果：{0,2,5}
 * 用例2：输入数组{{3,6,5},{0,2,10},{10,8,9},{11,12,13,14}}
 * 期望结果：{0,2,5,14}
 * 用例2：输入数组：{{3,6,5},{0,2,10},{10,8,9},{-1}}
 * 期望结果：{0,2,5,14}
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
		//获取二维数组中一维数组的最大长度
		int maxLength = getMaxLength(twodimensional);
		
		int[][] translateArray = new int[twodimensional.length][maxLength];
		//讲每一列作为一个数组处理
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
			//如果为空，返回一个空数组
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
		//如果数组为空，返回int最小值，
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
