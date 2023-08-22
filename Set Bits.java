import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int count=0;
		int i=0;
		int bi[]=new int[n];
		while(n>0){
			bi[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=0;j<(bi.length);j++){
			if(bi[j]==1){
				count++;
			}
		}
		return count;
	}
}
/* using built in 
return Integer.bitCount(n);*/
