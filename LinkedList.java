public class LinkedList {
    Player head;

    public boolean isEmpty() {
        return head == null;
    }
    int total() {
        int total = 0;
        Player curr = head;
        while (curr != null) {
            total++;
            curr = curr.next;
        }
        return total;
    }
    public boolean contains(Player target) {
        Player current = head;

        while (current != null) {
            if (current.equals(target)) { 
                return true;
            }
            current = current.next;
        }
        return false;
    }
    void addPlayer(Player player) {
        if (head == null) {
            head = player;
        } else {
            Player current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = player;
        }
    }

    public Player findPlayer(String name, String password) {
        Player current = head;
        while (current != null) {
            if (current.name.equals(name) && current.password.equals(password)) {
                return current; // Pemain ditemukan
            }
            current = current.next;
        }
        return null; // Pemain tidak ditemukan
    }

    void displayPlayers() {
        Player current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Email: " + current.email + 
                               ", Role: " + current.role + ", Skill Level: " + current.Level);
            current = current.next;
        }
    }
}
