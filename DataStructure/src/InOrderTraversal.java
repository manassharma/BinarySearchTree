import java.io.IOException;

public class InOrderTraversal {

	protected static void inOrder(MyTree root) {

		if (root == null) {
			return;
		} else {
			inOrder(root.leftChild);
			System.out.println(root.value);
			inOrder(root.rightChild);
		}
	}

	protected static void postOrder(MyTree root) {
		if (root == null) {
			return;
		} else {
			postOrder(root.rightChild);
			postOrder(root.leftChild);
			System.out.println(root.value);
		}
	}

	protected static void preOrder(MyTree root) {
		if (root == null) {
			return;
		} else {
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}

	}

	public static void main(String args[]) throws IOException {
		try {
			TreeManipulation.addNode(7);
			TreeManipulation.addNode(5);
			TreeManipulation.addNode(99);
			TreeManipulation.addNode(44);
			TreeManipulation.addNode(45);
			TreeManipulation.addNode(48);
			TreeManipulation.addNode(41);
			TreeManipulation.addNode(50);
			TreeManipulation.addNode(54);
			TreeManipulation.addNode(55);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		search(54, TreeManipulation.root);
	}

	protected static void search(int element, MyTree headNode) {
		if (headNode.value == element) {
			System.out.println("Element found");
			return;
		} else if (headNode.value > element) {
			search(element, headNode.leftChild);
		} else if (headNode.value < element) {
			search(element, headNode.rightChild);
		} else {
			System.out.println("Element not found in the tree");
			return;
		}

	}

}
