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
    int total = 1;

    public void enqueue(Player player) {
        NodeMatchmaking newNode = new NodeMatchmaking(player);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        total++;
    }

    public int total(){
        return total;
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
            System.out.println("TEAM");
            System.out.println("Player " + num + ":");
            System.out.println("Name: " + current.player.name + ", Skill Level: " + current.player.skillLevel);
            current = current.next;
            num++;
        }
    }
}
