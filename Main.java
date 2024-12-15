import java.util.Scanner;

public class Main {
    static void main(Scanner scanner, Player player) {
        System.out.println("Menu Utama Pengguna:\n1. Match making\n2. Lihat Statistik\n3. Exit");
        int pilih = scanner.nextInt();
        scanner.nextLine();
        if (pilih == 1) {
            System.out.println("blom buat bang ardi");
        } else if (pilih == 2) {
            System.out.println("Statistik Pengguna:");
            System.out.println("Email: " + player.email);
            System.out.println("Nama: " + player.name);
            System.out.println("Role: " + player.role);
            System.out.println("Skill Level: " + player.skillLevel);
            System.out.println("Total Pertandingan: " + player.totalMain);
            System.out.println("Kemenangan: " + player.wins);
            System.out.println("Win Rate: " + player.getWinRate() + "%");
        } else {
            System.out.println("Terima kasih telah bermain!");
        }
    }

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList playerList = new LinkedList();
        
        while (true) {
            System.out.println("Dashboard Utama:\n1. Registrasi\n2. Login\n3. Exit");
            int pilih2 = scanner.nextInt();
            scanner.nextLine();

            switch (pilih2) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Masukkan Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Masukkan Skill Level: ");
                    int skillLevel = scanner.nextInt();
                    scanner.nextLine();
                    playerList.addPlayer(new Player(name, email, password, role, skillLevel));
                    System.out.print("Registrasi Berhasil. ");
                    break;
                case 2:
                    System.out.print("Masukkan Email: ");
                    email = scanner.nextLine();
                    System.out.print("Masukkan Password: ");
                    password = scanner.nextLine();
                    Player player = playerList.cariPlayer(email, password);
                    if (player != null) {
                        main(scanner, player);
                    } else {
                        System.out.println("Email atau Password salah.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah bermain!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
