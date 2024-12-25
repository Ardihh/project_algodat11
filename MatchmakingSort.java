import java.util.Scanner;
public class MatchmakingSort {
    public void bubbleSort(LinkedList list) {
        if (list.head == null || list.head.next == null) return;
    
        boolean swapped;
        do {
            swapped = false;
            Player prev = null;
            Player current = list.head;
    
            while (current.next != null) {
                if (current.Level > current.next.Level) {
                    Player temp = current.next;
                    current.next = temp.next;
                    temp.next = current;
    
                    if (prev == null) {
                        list.head = temp;
                    } else {
                        prev.next = temp;
                    }
    
                    swapped = true;
                    prev = temp; 
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        } while (swapped);
    }
    

    public Queue linearSearchByLevel(Queue antrian, LinkedList list, int level) {
        if (list == null || list.head == null) {
            System.out.println("Daftar pemain kosong.");
            return null;
        }

        Player current = list.head;
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

    public void tampilkanTeam(Player player, LinkedList playerList, int level, Queue antrianPemain) {
        Scanner scanner = new Scanner(System.in);
        Dashboard baru = new Dashboard();
        UndoRedo stackPlayer = new UndoRedo();
        bubbleSort(playerList);
        playerList.findByName(player.name);
        stackPlayer.push(player);
        antrianPemain.dequeueByName(player);
        linearSearchByLevel(antrianPemain, playerList, level);
        int num = 1;
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

    public void playMatch(Player player, Queue teams, Queue team) {
        int totalteams = teams.getTotalLevel();
        int totalteam = team.getTotalLevel();
        System.out.println("Lawan ditemukan...");
        System.out.println("Lawan anda adalah:");
        team.displayQueue();
        System.out.println();
        if (totalteam > totalteams) {
            System.out.println("Kalah karena power anda " + totalteam);
        } else if (totalteam < totalteams) {
            System.out.println("Menang dengan power " + totalteams);
            player.wins++;
        } else {
            System.out.println("The match is a draw!");
        }
        return;
    }
    
}
