package phone;
/*
 * http://www.geeksforgeeks.org/how-to-print-maximum-number-of-a-using-given-four-keys/
 */
public class FourKey {
	public int count(int n){
		int[] result=new int[n+1];
		for(int i=1;i<=n;i++){
			result[i]=result[i-1]+1;
			for(int j=i-3;j>=1;j--){
				result[i]=Math.max(result[i], result[j]*(i-j-1));
			}
		}
		return result[n];
	}
}
