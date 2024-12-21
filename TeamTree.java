public class TeamTree {
    class TreeNode{
        Player captain;
        String nama;
        TreeNode left, right;
    
        TreeNode(Player captain, String nama) {
            this.captain = captain;
            this.nama = nama;
            left = right = null;
        }
    }

    TreeNode root;
    TeamTree() {
        root = null;
    }
    
    public void formTeam(Player player, LinkedList list, Queue playersQueue) {
        MatchmakingSort sorting = new MatchmakingSort();
        LinkedList teamA = new LinkedList();
        playersQueue.enqueue(player);
        System.out.println(player.name);
        Queue teams = new Queue();
        System.out.println("Menunggu pemain lain...");
        // untuk membentuk team dengan level yang sama
        sorting.linearSearchByLevel(teams, player, list, player.Level);
        sorting.formTeams(teamA, player, teams);
    }


    // niatnya untuk menampilkan team di matchmaking
    public void preOrder(TreeNode root){
        if (root == null) return;
        System.out.println("TEAM :");
        System.out.println("Player " + root.nama);
        preOrder(root.left);
        preOrder(root.right);
        return;
    }
}
