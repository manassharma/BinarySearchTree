public class TreeManipulation {

	protected static MyTree root;

	protected static void addNode(int value) {
		MyTree newNode = new MyTree(value);

		if (root == null) {
			root = newNode;
		} else {
			MyTree focusNode = root;
			MyTree parent;

			while (true) {
				parent = focusNode;

				if (value < focusNode.value) {
					if (focusNode.leftChild != null) {
						focusNode = focusNode.leftChild;
					} else {
						focusNode.leftChild = newNode;
						return;
					}
				} else if (value >= focusNode.value) {
					if (focusNode.rightChild != null) {
						focusNode = focusNode.rightChild;
					} else {
						focusNode.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	
}
