public class SameTree {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;

    if (p != null && q == null) return false;

    if (p == null && q != null) return false;

    if (p.val != q.val) return false;

    return (
        (isSameTree(p.left, q.left) == true) &&
        (isSameTree(p.right, q.right) == true)
      )
      ? true
      : false;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);

    root1.left.left = new TreeNode(4);
    root1.left.right = new TreeNode(5);

    root1.right.left = new TreeNode(6);
    root1.right.right = new TreeNode(7);

    System.out.println("Is Same Tree : " + isSameTree(root, root1));
  }
}
