
public class TeamTree {
    class TreeNode{
        Player player;
        TreeNode left, right;
    
        TreeNode(Player player) {
            this.player = player;
            left = right = null;
        }
    }

    TreeNode root;
    TeamTree() {
        this.root = null;
    }
    
    public void insert (Player player) {
        root = insertRec(root, player);
    }

    private TreeNode insertRec(TreeNode root, Player player){
        if (root == null) {
            return new TreeNode(player);
        }
        if (player.Level > root.player.Level) {
            root.left = insertRec(root.left, player);
        } else {
            root.right = insertRec(root.right, player);
        }
        return root;
    }

    public void displayLeaderboard() {
        System.out.println("Leaderboard: ");
        displayinOrder(root);
    }

    private void displayinOrder(TreeNode root) {

        if (root != null) {
            displayinOrder(root.left);
            System.out.println("[] " + root.player.name + " - Level: " + root.player.Level);
            displayinOrder(root.right);
        }
    }
}
