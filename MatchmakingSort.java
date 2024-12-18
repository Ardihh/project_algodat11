

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

    public static Player binarySearchByLevel(LinkedList list, int level) {
        if (list.head == null) return null;
    
        int size = getSize(list);
        int left = 0;
        int right = size - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Player midPlayer = getNodeAtIndex(list, mid);
    
            if (midPlayer.Level == level) {
                return midPlayer; // Jika level cocok, kembalikan Player
            }
    
            if (midPlayer.Level > level) {
                right = mid - 1; // Pindah ke kiri
            } else {
                left = mid + 1; // Pindah ke kanan
            }
        }
        System.out.println();
        return null; // Jika level tidak ditemukan
    }
    
    public Queue linearSearchByLevel(Player player, LinkedList list, int level) {
        if (list.head == null) {
            System.out.println("Daftar pemain kosong.");
            return null;
        }
        Queue teams = new Queue();
        teams.enqueue(player);
        while (player != null) {
            if (player.Level == level) {
                if (teams.total() <= 3) {
                    teams.enqueue(player);
                }
            }
            player = player.next; // Pindah ke pemain berikutnya
        }
        System.out.println();
        teams.displayQueue();
        return null; // Jika level tidak ditemukan
    }
    

    private static int getSize(LinkedList list) {
        int size = 0;
        Player current = list.head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    private static Player getNodeAtIndex(LinkedList list, int index) {
        Player current = list.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
    public void bubblesort(LinkedList playerList) {
        bubbleSort(playerList);
    }
}
