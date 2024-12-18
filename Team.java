import java.util.Scanner;
public class Team {
    class TreeNode{
        Player captain;
        TreeNode left, right;
    
        TreeNode(Player captain) {
            this.captain = captain;
            this.left = this.right = null;
        }
    }

    Team 
    
    public void formTeam(Player player, LinkedList list, Queue playersQueue) {
        Scanner scanner = new Scanner(System.in);
        MatchmakingSort sorting = new MatchmakingSort();
        sorting.bubblesort(list);
        playersQueue.enqueue(player);
        System.out.println(player.name);
        // Queue teams = new Queue();
        System.out.println("Menunggu pemain lain...");
        sorting.linearSearchByLevel(player, list, player.Level);
        String pilihan = scanner.nextLine();
        scanner.close();
    }

    TreeNode buildTeamTree(LinkedList players, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Player current = getPlayerAt(players, mid);
        TreeNode node = new TreeNode(current);
    
        node.left = buildTeamTree(players, start, mid - 1);
        node.right = buildTeamTree(players, mid + 1, end);
    
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
}
