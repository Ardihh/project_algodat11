public class MatchmakingSort {
    public static void bubbleSort(LinkedList list) {
        if (list.head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Player current = list.head;
            while (current.next != null) {
                if (current.Level > current.next.Level) {

                    int tempLevel = current.Level;
                    current.Level = current.next.Level;
                    current.next.Level = tempLevel;
                    String tempName = current.name;
                    current.name = current.next.name;
                    current.next.name = tempName;

                    String tempEmail = current.email;
                    current.email = current.next.email;
                    current.next.email = tempEmail;

                    String tempPassword = current.password;
                    current.password = current.next.password;
                    current.next.password = tempPassword;

                    String tempRole = current.role;
                    current.role = current.next.role;
                    current.next.role = tempRole;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public TeamTree linearSearchByLevel(LinkedList list, int level) {
        TeamTree teamTree = new TeamTree();

        if (list == null || list.isEmpty()) {
            System.out.println("Daftar pemain kosong.");
            return null;
        }

        Player current = list.head;
        while (!list.isEmpty()) {
            if (current.Level == level - 1 || current.Level == level || current.Level == level + 1) {
                teamTree.insert(current);
            }
        }
        System.out.println("Tim berhasil dibentuk!");
        return teamTree;
    }

    // public static Player binarySearchByLevel(LinkedList list, int level) {
    //     if (list.head == null) return null;
    //     int size = getSize(list);
    //     int left = 0;
    //     int right = size - 1;
    
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;
    //         Player midPlayer = getNodeAtIndex(list, mid);
    
    //         if (midPlayer.Level == level) {
    //             return midPlayer; 
    //         }
    
    //         if (midPlayer.Level > level) {
    //             right = mid - 1; 
    //         } else {
    //             left = mid + 1; 
    //         }
    //     }
    //     System.out.println();
    //     return null; 
    // }
    
    // private static int getSize(LinkedList list) {
    //     int size = 0;
    //     Player current = list.head;
    //     while (current != null) {
    //         size++;
    //         current = current.next;
    //     }
    //     return size;
    // }

    // private static Player getNodeAtIndex(LinkedList list, int index) {
    //     Player current = list.head;
    //     for (int i = 0; i < index; i++) {
    //         current = current.next;
    //     }
    //     return current;
    // }
    
    public void bubblesort(LinkedList playerList) {
        bubbleSort(playerList);
    }
}
