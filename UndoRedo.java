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
//     public void execute(String action) {
//         Node newNode = new Node(action);
//         newNode.next = undoHead;
//         undoHead = newNode;

//         redoHead = null;
//     }

//     public String undo() {
//         if (undoHead == null) {
//             return "Tidak ada aksi untuk di-undo.";
//         }
//         String action = undoHead.action;
//         undoHead = undoHead.next;

//         Node redoNode = new Node(action);
//         redoNode.next = redoHead;
//         redoHead = redoNode;

//         return "Undo: " + action;
//     }

//     public String redo() {
//         if (redoHead == null) {
//             return "Tidak ada aksi untuk di-redo.";
//         }
//         String action = redoHead.action;
//         redoHead = redoHead.next;

//         Node undoNode = new Node(action);
//         undoNode.next = undoHead;
//         undoHead = undoNode;

//         return "Redo: " + action;
//     }

//     public void status() {
//         System.out.print("Undo Stack: ");
//         printStack(undoHead);
//         System.out.print("Redo Stack: ");
//         printStack(redoHead);
//     }

    // public void printStack(Node head) {
    //     Node current = head;
    //     while (current != null) {
    //         System.out.print(current.action + " ");
    //         current = current.next;
    //     }
    //     System.out.println();
    // }
}