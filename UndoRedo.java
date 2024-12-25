class Node {
    Player player;
    Node next;

    Node(Player player) {
        this.player = player;
        this.next = null;
    }
}

class UndoRedo {

    Node top;

    public UndoRedo(){
        this.top = null;
    }

    public int total(){
        Node current = top;
        int jumlah = 0;
        while (current != null) {
            jumlah++;
            current = current.next;
        }
        return jumlah;
    }

    public void push (Player player) {
        Node newNode = new Node(player); 
        newNode.next = top;
        top = newNode;
    }

    public Player pop (Player player) {
        if (top == null) {
            System.out.println("Tim kosong");
            return null;
        }
        top = top.next;
        return player;
    }

    public void display() {
        if (top == null) return;
        Node temp = top;
        int num = 1;
        while (temp != null) {
            System.out.println("Anggota tim ke-" + num + " " + temp.player.name);
            temp = temp.next;
            num++;
        }
    }
}