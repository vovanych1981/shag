package Lesson27;

class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BST<T extends Comparable<T>> implements BinaryTree<T> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void add(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> root, T data) {
        if (isEmpty()) {
            return new Node<>(data);
        } else if (root.data.compareTo(data) < 0) {
            root.left = insert(root.left, data);
        } else if (root.data.compareTo(data) > 0) {
            root.right = insert(root.right, data);
        } else {

        }
        return root;
    }

    @Override
    public Node<T> findMin(Node<T> root) {
        Node<T> curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }

        return curr;
    }

    @Override
    public T findMax() {
        Node<T> curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }

        return curr.data;
    }

    @Override
    public void delete(T data) {
        root = delete(root, data);
    }

    private Node<T> delete(Node<T> root, T data) {
        if (root == null) return root;
        if (data.compareTo(root.data) < 0) {
            root.left = delete(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = delete(root.right, data);
        } else if (root.left != null && root.right != null) {
            root.data = findMin(root.right).data;
            root.right = delete(root.right, root.data);
        } else {
            if (root.left != null)
                root = root.left;
            else if (root.right != null)
                root = root.right;
            else
                root = null;
        }
        return root;
    }


    @Override
    public boolean contains(T data) {
        return contains(root, data);
    }

    private boolean contains(Node<T> root, T data) {
        if (root == null) {
            return false;
        } else if (data.compareTo(root.data) < 0) {
            return contains(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            return contains(root.right, data);
        } else {
            return true;
        }
    }
}
