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
        sorting.linearSearchByLevel(teams, player, list, teamA, player.Level);
        teams.displayQueue();
        buildTeamTree(teamA, 0, teamA.total() - 1);
    }

    // masi error
    TreeNode buildTeamTree(LinkedList players, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Player current = getPlayerAt(players, mid);
        TreeNode node = new TreeNode(current, current.name); 
    
        node.left = buildTeamTree(players, start, mid - 1);
        node.right = buildTeamTree(players, mid + 1, end); 
        
        preOrder(node);
        return node;
    }
    
    Player getPlayerAt(LinkedList players, int index) {
        Player current = players.head;
        int count = 0;
        while (current != null) {
            if (count == index) return current;
            current = current.next;
            count++;
        }
        return null;
    }

    public void preOrder(TreeNode root){
        if (root == null) return;
        System.out.println("TEAM :");
        System.out.println("Player " + root.nama);
        preOrder(root.left);
        preOrder(root.right);
        return;
    }
}
