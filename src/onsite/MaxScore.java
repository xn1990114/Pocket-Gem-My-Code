package onsite;

import java.util.*;

/*
 * 第一题，select and delete. 定义一种操作：从一个数组里选出一个数字x，得到x分，
 * 但是要删除这个数组中所有的x-1和x+1。可以无限重复操作直到数组空，问最大能得几分？
例：[1,1,2,2,3,3]，答案：8。删除两个1和两个3，得分8
 */
public class MaxScore {
	public int findMaxScore(int[] nums){
		if(nums.length==0){
			return 0;
		}
		Arrays.sort(nums);
		List<int[]> counts=new ArrayList<int[]>();
		int count=0;
		int last=nums[0];
		for(int i=0;i<=nums.length;i++){
			if(i==nums.length||nums[i]!=last){
				counts.add(new int[]{last,count});
				count=1;
				if(i<nums.length){
					last=nums[i];
				}
			}
			else{
				count++;
			}
		}
		int last1=0;
		int last2=0;
		for(int i=0;i<counts.size();i++){
			int[] temp=counts.get(i);
			int curr=Math.max(last1, temp[0]*temp[1]+(i>0&&temp[0]==counts.get(i-1)[0]+1?last2:last1));
			curr=Math.max(curr, 0);
			last2=last1;
			last1=curr;
		}
		return last1;
	}
}
