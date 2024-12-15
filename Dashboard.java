import java.util.Scanner;
public class Dashboard {
    Player head;
    Queue team1 = new Queue();
    LinkedList playerList = new LinkedList();
    static Scanner scanner = new Scanner(System.in);
    public void registrasi() {
        System.out.println("\n--- Registrasi Pengguna ---");
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();
        System.out.print("Masukkan Role: ");
        String role = scanner.nextLine();
        System.out.print("Masukkan Skill Level: ");
        int skillLevel = -1;
    
        while (skillLevel < 0) {
            try {
                skillLevel = Integer.parseInt(scanner.nextLine());
                if (skillLevel < 0) {
                    System.out.print("Skill Level harus berupa angka positif. Masukkan kembali: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Input tidak valid. Masukkan angka: ");
            }
        }
    
        playerList.addPlayer(new Player(name, email, password, role, skillLevel));
        System.out.println("Registrasi Berhasil! Anda sekarang dapat login.");
    }
    

    public void login() {
        System.out.println("\n--- Login Pengguna ---");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
    
        Player player = playerList.findPlayer(name, password);
        if (player != null) {
        System.out.println("Login berhasil! Selamat datang, " + player.name);
        menuUtama(player); // Panggil menu utama
        } else {
            System.out.println("Nama atau Password Salah!");
        }
    }

    public void menuUtama(Player player){
        boolean backToDashboard = false;

        while (!backToDashboard) {

            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Masuk ke Matchmaking");
            System.out.println("2. Lihat Statistik");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Menunggu pemain...");
                    team1.enqueue(player);
                    if (team1.total() == 3) {
                        team1.displayQueue();
                    }
                    break;
                case 2:
                    System.out.println("Statistik Pengguna:");
                    System.out.println("Email: " + player.email);
                    System.out.println("Nama: " + player.name);
                    System.out.println("Role: " + player.role);
                    System.out.println("Skill Level: " + player.skillLevel);
                    System.out.println("Total Pertandingan: " + player.totalMain);
                    System.out.println("Kemenangan: " + player.wins);
                    System.out.println("Win Rate: " + player.getWinRate() + "%");
                    break;
                case 3:
                    System.out.println("Keluar dari Menu Utama.");
                    backToDashboard = true;
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
