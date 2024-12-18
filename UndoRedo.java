class Node {
    String action;
    Node next;

    Node(String action) {
        this.action = action;
        this.next = null;
    }
}

class UndoRedo {
    private Node undoHead;
    private Node redoHead;

    public UndoRedo() {
        undoHead = null;
        redoHead = null;
    }

    public void execute(String action) {
        Node newNode = new Node(action);
        newNode.next = undoHead;
        undoHead = newNode;

        redoHead = null;
    }

    public String undo() {
        if (undoHead == null) {
            return "Tidak ada aksi untuk di-undo.";
        }
        String action = undoHead.action;
        undoHead = undoHead.next;

        Node redoNode = new Node(action);
        redoNode.next = redoHead;
        redoHead = redoNode;

        return "Undo: " + action;
    }

    public String redo() {
        if (redoHead == null) {
            return "Tidak ada aksi untuk di-redo.";
        }
        String action = redoHead.action;
        redoHead = redoHead.next;

        Node undoNode = new Node(action);
        undoNode.next = undoHead;
        undoHead = undoNode;

        return "Redo: " + action;
    }

    public void status() {
        System.out.print("Undo Stack: ");
        printStack(undoHead);
        System.out.print("Redo Stack: ");
        printStack(redoHead);
    }

    private void printStack(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.action + " ");
            current = current.next;
        }
        System.out.println();
    }
}