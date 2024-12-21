public class TeamTree {
    class TreeNode{
        Player captain;
        TreeNode left, right;
    
        TreeNode(Player captain) {
            this.captain = captain;
            left = right = null;
        }
    }

    TreeNode root;
    TeamTree() {
        this.root = null;
    }
    
    public void insert (Player captain) {
        root = insertRecursive(root, captain);
    }

    private TreeNode insertRecursive (TreeNode node, Player captain) {
        if (node == null) {
            return new TreeNode(captain);
        }

        if (captain.Level <= node.captain.Level) {
            node.left = insertRecursive(node.left, captain);
        } else {
            node.right = insertRecursive(node.right, captain);
        }

        return node;
    }

    // traversal inorder untuk mencetak leaderboard (ascending)
    private void printLeaderboardAscending(TreeNode node) {
        if (node != null) {
            printLeaderboardAscending(node.left);
            System.out.println("Captain: " + node.captain.name + ", Level " + node.captain.Level);
            printLeaderboardAscending(node.right);
        }
    }
    
    public void displayLeaderboardAscending() {
        System.out.println("Leaderboard (Ascending):");
        printLeaderboardAscending(root);
    }

    // traversal reverse inorder untuk mencetak leaderboard (descending)
    private void printLeaderboardDescending(TreeNode node) {
        if (node != null) {
            printLeaderboardDescending(node.right);
            System.out.println("Captain: " + node.captain.name + ", Level: " + node.captain.Level);
            printLeaderboardDescending(node.left);
        }
    }

    public void displayLeaderboardDescending() {
        System.out.println("Leaderboard (Descending):");
        printLeaderboardDescending(root);
    }

    // public void formTeam(Player player, LinkedList list, Queue playersQueue) {
    //     MatchmakingSort sorting = new MatchmakingSort();
    //     // LinkedList teamA = new LinkedList();
    //     playersQueue.enqueue(player);
    //     System.out.println(player.name);
    //     Queue teams = new Queue();
    //     System.out.println("Menunggu pemain lain...");
    //     // untuk membentuk team dengan level yang sama
    // }


    // niatnya untuk menampilkan team di matchmaking
    public void preOrder(TreeNode root){
        if (root == null) return;
        System.out.println("TEAM :");
        preOrder(root.left);
        preOrder(root.right);
        return;
    }
}
