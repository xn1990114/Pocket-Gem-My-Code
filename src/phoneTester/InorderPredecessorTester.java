package phoneTester;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.InorderPredecessor;
import phone.InorderPredecessor.Node;

public class InorderPredecessorTester {
/*					1
 * 			2				3
 * 	   4		5		6		7
 *					  9	  8 		
 */		
	@Test
	public void test() {
		InorderPredecessor ip=new InorderPredecessor();
		 Node n1=ip.new Node();
		 Node n2=ip.new Node();
		 Node n3=ip.new Node();
		 Node n4=ip.new Node();
		 Node n5=ip.new Node();
		 Node n6=ip.new Node();
		 Node n7=ip.new Node();
		 Node n8=ip.new Node();
		 Node n9=ip.new Node();
		 n1.parent=null;n1.left=n2;n1.right=n3;
		 n2.parent=n1;n2.left=n4;n2.right=n5;
		 n3.parent=n1;n3.left=n6;n3.right=n7;
		 n4.parent=n2;
		 n5.parent=n2;
		 n6.parent=n3;n6.right=n8;n6.left=n9;
		 n7.parent=n7;
		 n8.parent=n6;
		 n9.parent=n6;
		 assertTrue(ip.findPre(n1)==n5);
		 assertTrue(ip.findPre(n8)==n6);
		 assertTrue(ip.findPre(n6)==n9);
		 assertTrue(ip.findPre(n9)==n1);
	}

}
