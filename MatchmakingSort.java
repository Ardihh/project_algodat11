import java.util.Scanner;
public class MatchmakingSort {
    public void bubbleSort(LinkedList list) {
        if (list.head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Player current = list.head;
            while (current.next != null) {
                if (current.Level > current.next.Level) {
                    // Swap all fields
                    int tempLevel = current.Level;
                    current.Level = current.next.Level;
                    current.next.Level = tempLevel;

                    String tempName = current.name;
                    current.name = current.next.name;
                    current.next.name = tempName;

                    String tempEmail = current.email;
                    current.email = current.next.email;
                    current.next.email = tempEmail;

                    String tempPassword = current.password;
                    current.password = current.next.password;
                    current.next.password = tempPassword;

                    String tempRole = current.role;
                    current.role = current.next.role;
                    current.next.role = tempRole;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public Queue linearSearchByLevel(Queue antrian, LinkedList list, int level) {
        if (list == null || list.head == null) {
            System.out.println("Daftar pemain kosong.");
            return null;
        }

        Player current = list.head.next;
        boolean found = false;
        while (current != null) {
            if (current.Level == level || current.Level == level - 1 || current.Level == level + 1) {
                found = true;
                antrian.enqueue(current);
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Tidak ada pemain dengan level " + level);
        }
        return antrian;
    }

    public void tampilkanTeam(LinkedList playerList, int level, Queue antrianPemain) {
        Scanner scanner = new Scanner(System.in);
        Dashboard baru = new Dashboard();
        bubbleSort(playerList);
        UndoRedo stackPlayer = new UndoRedo();
        linearSearchByLevel(antrianPemain, playerList, level);
        int num = 0;
        while (true) {
            baru.clearScreen();
            baru.banner();
            System.out.println("\nPencarian pemain dengan level " + level + ":");
            antrianPemain.displayQueue();
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            if (antrianPemain.findNode(nama)){
                Player current = playerList.findByName(nama);
                stackPlayer.push(current);
                antrianPemain.dequeueByName(current);
            } else {
                System.out.println("Masukkan nama yang ada pada daftar!");
                System.out.print("Masukkan nama: ");
                nama = scanner.nextLine();
                if(!antrianPemain.findNode(nama)) return;
                scanner.close();
            }
            num++;
            if (num >= 3) {
                System.out.println("Team anda:");
                stackPlayer.display();
                System.out.print("Lanjutkan?(y/n) ");
                String aksi = scanner.nextLine();
                if (aksi.equalsIgnoreCase("y")) {
                    return;
                } else if (aksi.equalsIgnoreCase("n")) {
                    System.out.print("Pilih nama player untuk diganti: ");
                    nama = scanner.nextLine();
                    if (antrianPemain.findNode(nama)) {
                        Player current = playerList.findByName(nama);
                        stackPlayer.pop(current);
                        antrianPemain.enqueueByName(current);
                    }
                }
            }
        }
    }

    public void playMatch(Queue teams, Queue team) {
        int totalteams = teams.getTotalLevel();
        int totalteam = team.getTotalLevel();

        if (totalteam > totalteams) {
            System.out.println("Winner:");
            team.displayQueue();
        } else if (totalteam < totalteams) {
            System.out.println("Winner:");
            team.displayQueue();
        } else {
            System.out.println("The match is a draw!");
        }
    }
    
}
