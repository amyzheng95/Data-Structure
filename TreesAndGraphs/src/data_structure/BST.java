package data_structure;

public class BST<T> {
	
	TreeNode root;
	
	class TreeNode<Integer>
	{
		int value;
		TreeNode parent;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val)
		{
			value = val;
		}	
	}
	
	public BST(int val)
	{
		root = new TreeNode(val);
	}
	
	
	public void print_InAllOrders()
	{
		System.out.print("\n InOrder: ");
		InOrder(root);
		System.out.print("\n PreOrder: ");
		PreOrder(root);
		System.out.print("\n PostOrder: ");
		PostOrder(root);
	}
	
	public void InOrder(TreeNode n)
	{
		if(n!=null)
		{
			InOrder(n.left);
			System.out.print(n.value + " ");
			InOrder(n.right);
		}

	}
	
	public void PreOrder(TreeNode n)
	{
		if(n!=null)
		{
			System.out.print(n.value + " ");
			InOrder(n.left);
			InOrder(n.right);
		}

	}
	
	public void PostOrder(TreeNode n)
	{
		if(n!=null)
		{
			InOrder(n.left);
			InOrder(n.right);
			System.out.print(n.value + " ");
		}

	}
	
	
	public static void main(String[] args)
	{
		BST<Integer> tree = new BST<>(1);
		tree.print_InAllOrders();
	}
}
