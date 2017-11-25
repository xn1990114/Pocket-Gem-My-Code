package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.MaxScore;

public class MaxScoreTester {

	@Test
	public void test() {
		MaxScore tester=new MaxScore();
		int[] nums1={1,1,2,2,3,3};
		assertTrue(tester.findMaxScore(nums1)==8);
		int[] nums2={0,0,-2,-2,-3,-3,-4};
		assertTrue(tester.findMaxScore(nums2)==0);
		int[] nums3={0,0,-2,-2,-3,6,-3,-4};
		assertTrue(tester.findMaxScore(nums3)==6);
		int[] nums4={-2,-2,-7,0,2,2,2,2,3,3,3,3,3,3,3,3,4,4};
		assertTrue(tester.findMaxScore(nums4)==24);
	}

}
