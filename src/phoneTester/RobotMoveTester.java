package phoneTester;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.RobotMove;

public class RobotMoveTester {

	@Test
	public void test() {
		RobotMove tester=new RobotMove();
		boolean[][] r1={
				{true,true,false},
				{true,true,true},
				{true,true,true}
		};
		System.out.println(tester.findPath(r1, new int[]{0,0}));
		boolean[][] r2={
				{true,false,false},
				{true,false,true},
				{true,true,false}
		};
		System.out.println(tester.findPath(r2, new int[]{2,0}));
	}

}
