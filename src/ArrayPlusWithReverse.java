
/**
 * 
 * @author hs
 *date:2017年1月3日20:15:56
 *数组逆向相加
 *用例1：输入：{1,2,3,4,5,6,7}{1,2,3,4,5,6,7}输出：{8,8,8,8,8,8,8}
 *
 */
public class ArrayPlusWithReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {1,2,3,4,5,6,7};
		int[] result = arrayPlus(arr1,arr2);
		sop(result);
	}

	private static void sop(int[] result) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for (int i = 0; i < result.length; i++) {
			if(i==result.length-1){
				sb.append(result[i]+"}");
			}else{
			sb.append(result[i]+",");
			}
		}
		System.out.println(sb.toString());
	}

	/**
	 * 
	 * @param arr1
	 * @param arr2
	 * @return 数组逆序相加之后的新数组
	 */
	private static int[] arrayPlus(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		if (arr1.length == arr2.length){
			int[] result = new int[arr1.length];
			for (int i = 0; i < result.length; i++) {
					result[i]=arr1[i]+arr2[result.length-1-i];
			}
			return result;
		}
		return null;
		
	}

}
