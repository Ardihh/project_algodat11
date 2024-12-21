import java.util.Scanner;

class Game {
    private LinkedList teamA;
    private LinkedList teamB;
    private Scanner scanner;

    public Game(LinkedList teamA, LinkedList teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        Player currentPlayerA = teamA.head;
        Player currentPlayerB = teamB.head;

        while (currentPlayerA != null && currentPlayerB != null) {
            // Giliran Kapten Tim A
            System.out.println("Giliran " + currentPlayerA.name);
            if (playerTurn(currentPlayerA, currentPlayerB)) {
                System.out.println(currentPlayerB.name + " telah kalah!");
                break; // berhentiin permainan kalau def kalah
            }
            currentPlayerB = currentPlayerB.next; // Pindah ke player selanjutnya di Tim B

            // Giliran Kapten Tim B
            if (currentPlayerB != null) {
                System.out.println("Giliran " + currentPlayerB.name);
                if (playerTurn(currentPlayerB, currentPlayerA)) {
                    System.out.println(currentPlayerA.name + " telah kalah!");
                    break; 
                }
                currentPlayerA = currentPlayerA.next; // Pindah ke player selanjutnya di Tim A
            }
        }

        System.out.println("Permainan selesai!");
    }

    private boolean playerTurn(Player attacker, Player defender) {
        System.out.println("Pilih aksi: [1] Serang [2] Bertahan");
        int action = scanner.nextInt();

        if (action == 1) {
            // Serang
            int damage = attacker.Level * 2; //ardi
            defender.currentHP -= damage; 
            System.out.println(attacker.name + " menyerang " + defender.name + " dan memberikan damage " + damage);
            System.out.println(defender.name + " HP tersisa: " + defender.currentHP);

            if (defender.currentHP <= 0) {
                return true; 
            }
        } else if (action == 2) { //ardi
            // Bertahan
            System.out.println(attacker.name + " memilih untuk bertahan.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        return false;
    }
}