class Queue {

    class NodeMatchmaking {
        Player player;
        NodeMatchmaking next;

        NodeMatchmaking(Player player) {
            this.player = player;
            this.next = null;
        }
    }

    NodeMatchmaking front;
    NodeMatchmaking rear;

    public void enqueue(Player player) {
        NodeMatchmaking newNode = new NodeMatchmaking(player);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    public void enqueueByName(Player player) {
        NodeMatchmaking newNode = new NodeMatchmaking(player);
    
        if (front == null) {
            front = rear = newNode;
            return;
        }
    
        if (player.name.compareTo(front.player.name) < 0) {
            newNode.next = front;
            front = newNode;
            return;
        }
    
        NodeMatchmaking current = front;
        NodeMatchmaking previous = null;
    
        while (current != null && player.name.compareTo(current.player.name) > 0) {
            previous = current;
            current = current.next;
        }
    
        if (previous != null) {
            previous.next = newNode;
        }
        newNode.next = current;
    
        if (current == null) {
            rear = newNode;
        }
    }
    

    public int total() {
        int count = 0;
        NodeMatchmaking current = front; 
        while (current != null) {
            count++;
            current = current.next; 
        }
        return count;
    }
    

    public Player dequeue() {
        if (front == null) {
            return null;
        }
        Player temp = front.player;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    public Player dequeueByName(Player playerNode) {
        if (front == null) {
            return null; // Antrian kosong
        }
        
        if (front.player == playerNode) {
            Player temp = front.player;
            front = front.next;
            if (front == null) {
                rear = null; // Antrian menjadi kosong
            }
            return temp;
        }
    
        NodeMatchmaking current = front;
        while (current.next != null && current.next.player != playerNode) {
            current = current.next;
        }
    
        if (current.next == null) {
            return null;
        }
    
        Player temp = current.next.player;
        current.next = current.next.next;
    
        if (current.next == null) {
            rear = current;
        }
    
        return temp;
    }
    
    
    public boolean isEmpty() {
        return front == null;
    }

    public void displayQueue() {
        NodeMatchmaking current = front;
        int num = 1;
        if (isEmpty()) {
            System.out.println("Tidak ada player dalam antrian.");
        }
        while (current != null) {
            System.out.println(num + ". " + current.player.name + " lvl. " + current.player.Level + ", role " + current.player.role);
            current = current.next;
            num++;
        }
    }
    

    public boolean findNode(String nama) {
        NodeMatchmaking current = front;
        while (current != null) {
            if (current.player.name.equalsIgnoreCase(nama)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public int getTotalLevel() {
        int totalLevel = 0;
        NodeMatchmaking current = front;
        while (current != null) {
            totalLevel += current.player.Level;
            current = current.next; 
        }
        return totalLevel;
    }

    
}
