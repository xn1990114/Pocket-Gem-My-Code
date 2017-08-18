package phoneTester;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.FourKey;

public class FourKeyTester {

	@Test
	public void test() {
		FourKey tester=new FourKey();
		assertTrue(tester.count(0)==0);
		assertTrue(tester.count(1)==1);
		assertTrue(tester.count(2)==2);
		assertTrue(tester.count(3)==3);
		assertTrue(tester.count(4)==4);
		assertTrue(tester.count(5)==5);
		assertTrue(tester.count(6)==6);
		assertTrue(tester.count(7)==9);
		assertTrue(tester.count(8)==12);
		assertTrue(tester.count(9)==16);
		assertTrue(tester.count(10)==20);
		assertTrue(tester.count(11)==27);
		assertTrue(tester.count(12)==36);
		assertTrue(tester.count(13)==48);
		assertTrue(tester.count(14)==64);
		assertTrue(tester.count(15)==81);
		assertTrue(tester.count(16)==108);
		assertTrue(tester.count(17)==144);
		assertTrue(tester.count(18)==192);
		assertTrue(tester.count(19)==256);
		assertTrue(tester.count(20)==324);
	}

}
