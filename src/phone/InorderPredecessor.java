package phone;

public class InorderPredecessor {
	public class Node{
		public Node parent;
		public Node left;
		public Node right;
	}
	public Node findPre(Node curr){
		if(curr==null){
			return null;
		}
		if(curr.left!=null){
			curr=curr.left;
			while(curr.right!=null){
				curr=curr.right;
			}
			return curr;
		}
		Node p=curr.parent;
		if(p==null){
			return p;
		}
		while(p.left==curr){
			curr=p;
			p=curr.parent;
		}
		return p;
	}
}
