
/**
 * 
 * @author hs
 *date:2017��1��3��20:15:56
 *�����������
 *����1�����룺{1,2,3,4,5,6,7}{1,2,3,4,5,6,7}�����{8,8,8,8,8,8,8}
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
	 * @return �����������֮���������
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
