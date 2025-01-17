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
        if (player == null) return;
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
                return current; 
            }
            current = current.next;
        }
        return null; 
    }

    void displayPlayers() {
        Player current = head;
        if (head == null) {
            System.out.println("tidak ada pemain");
        }
        while (current != null) {
            System.out.println("Name: " + current.name + ", Email: " + current.email + 
                               ", Role: " + current.role + ", Skill Level: " + current.Level);
            current = current.next;
        }
    }

    public Player findByName(String name) {
        Player current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return current; 
            }
            current = current.next;
        }
        return null; 
    }
}
