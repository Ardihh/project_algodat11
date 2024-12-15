class LinkedList {
    Player head;

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

    Player cariPlayer(String email, String password) {
        Player current = head;
        while (current != null) {
            if (current.email.equals(email) && current.password.equals(password)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void displayPlayers() {
        Player current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Email: " + current.email + 
                               ", Role: " + current.role + ", Skill Level: " + current.skillLevel);
            current = current.next;
        }
    }
}
