
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

    void enqueue(Player player) {
        NodeMatchmaking newNode = new NodeMatchmaking(player);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    Player dequeue() {
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
}
