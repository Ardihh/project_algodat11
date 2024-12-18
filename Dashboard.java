import java.util.Scanner;

public class Dashboard {
    Player head;
    Queue team1 = new Queue();
    LinkedList playerList = new LinkedList();
    static Scanner scanner = new Scanner(System.in);
    String role = null;
    int choice = 0;

    public void banner() {
        System.out.println("=====================(Welcome To SkillSync)======================");
        System.out.println();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    void warrior() {
        System.out.println("\t                     .-.                \r\n" + //
                "\t                    :@@@+               \r\n" + //
                "\t                    .@@@#:              \r\n" + //
                "\t                    =@@@@%*:            \r\n" + //
                "\t                  :@@@@@@@@@#           \r\n" + //
                "\t                  -@@@@@@@@@@=          \r\n" + //
                "\t               #: #@@@@@@@@@@@:         \r\n" + //
                "\t               *:%@-@@@@@@:.#@=         \r\n" + //
                "\t               #%%+-@@@@@@* #@+         \r\n" + //
                "\t            .*-@%-#@@@@@@@@*%%          \r\n" + //
                "\t          :+%@=*. @@@@@@@@@@@-          \r\n" + //
                "\t      :=*%*=.. =.=@@@@@@@@@@@=          \r\n" + //
                "\t  -+##*=:       :@@@@@@@@@@@@@+         \r\n" + //
                "\t                :@@@@*@@@@@@@@@+        \r\n" + //
                "\t                -@@@* .=#+@@@@%@@*-     \r\n" + //
                "\t                :@@@*     =@@@%%@@@*.   \r\n" + //
                "\t                 %@@*      +@@#.%@@+    \r\n" + //
                "\t                 +@%        =@# .#@+.   \r\n" + //
                "\t                 +@@         @@.  :+.   \r\n" + //
                "\t              .=%@@@         %@-    .   \r\n" + //
                "\t        .:.:-=+********#%%%#+**=-:.. ");
    }

    void mage() {
        System.out.println("\t                    .:::  .     \r\n" + //
                "\t        .:   .+++#@@@@@#-     \r\n" + //
                "\t       .=+.   :#*%@@@:.       \r\n" + //
                "\t        **+    =*+:+@-        \r\n" + //
                "\t        *+.   :.  ..-*.       \r\n" + //
                "\t        *:   .   :..-:+-      \r\n" + //
                "\t        *.   -:. =-*%#%@@=    \r\n" + //
                "\t       :@#=*%@==*@@@@*%%@@=   \r\n" + //
                "\t       .%%%%@@%#@@@@%%@@@@+   \r\n" + //
                "\t        @@%#@#%@@%%%@@@@#@=   \r\n" + //
                "\t       :#@%#@#%%##%#%@@@@@.   \r\n" + //
                "\t       -+%#@#@@%@@@@#@@@%%    \r\n" + //
                "\t       ==%#@#@@@@%@@#@@@##    \r\n" + //
                "\t       +:%#@%@@@@%@@%#@@*=    \r\n" + //
                "\t       *.-@%@@@@@%@@@*@@*.    \r\n" + //
                "\t       # :@#@@@@@%@@@*@@=     \r\n" + //
                "\t       %  @#@@@@@#@@@#@@:     \r\n" + //
                "\t       *  @%@@@@%#@@@*@@-     \r\n" + //
                "\t       +  *%#@@##%@@%=@%      \r\n" + //
                "\t      :=  =%#@@#+@@#@+@%      \r\n" + //
                "\t      =-  -%%@*%*@%%@+@%-     \r\n" + //
                "\t      +.  -#@@#%*@*@@*%@@.    \r\n" + //
                "\t      *   +%%*===-:.+#*--. ");
    }

    void rogue() {
        System.out.println("\t                  :-                    \r\n" + //
                "\t                 *@@%.                  \r\n" + //
                "\t                :@@%@#                  \r\n" + //
                "\t               -%@%@@@+:                \r\n" + //
                "\t            :%@@@@@%%#%@*               \r\n" + //
                "\t            *%@@@@@@%%%@#.              \r\n" + //
                "\t            ##@@@@@@@@@@@+              \r\n" + //
                "\t           =%%*@@@@@@@@%@#:             \r\n" + //
                "\t          :#%*-%@@@@@@@:*%+             \r\n" + //
                "\t          *@#==#%@@@@@@:=@#             \r\n" + //
                "\t         -@= #%%%@@@@@@: *@:            \r\n" + //
                "\t         %%:.**##%@@@@#: -@-            \r\n" + //
                "\t        =@#  +@@@@@@@@@= =*.            \r\n" + //
                "\t      :+=    =@@@@@@%%@@*:              \r\n" + //
                "\t     -:      *@@@@@@@*%@@%*-            \r\n" + //
                "\t   ::        *@@@*@@%*=@@++@@*=-.       \r\n" + //
                "\t             .@@%=*%@@ .+%: *@##%+.     \r\n" + //
                "\t              %@@#*@@@.  .:  .=*+ #     \r\n" + //
                "\t              -%@%%%%-          ...     \r\n" + //
                "\t               -@**@%                   \r\n" + //
                "\t               .*:*@#  ");
    }

    void cleric() {
        System.out.println("\t                   ..         \r\n" + //
                "\t                 .%@@@=       \r\n" + //
                "\t  .%:            :@@@@#       \r\n" + //
                "\t =#@@@-           @@@@.       \r\n" + //
                "\t   .@*          -%@@@@@#:     \r\n" + //
                "\t   -%@.       .#@@@@@@@@@@+   \r\n" + //
                "\t    :@       .@@@@@@@@@@@@@-  \r\n" + //
                "\t    .@%=.   :@@@@@@@@@@@@@@-  \r\n" + //
                "\t     +@@@@@%@@@@@@@@@@@@@@@+  \r\n" + //
                "\t      %-##@@@@@@@@@@@@@@@@@#  \r\n" + //
                "\t           .:#@@@@@@@@@@@@@*  \r\n" + //
                "\t             #@@@@@@@@@@@@%   \r\n" + //
                "\t     :%%%**. %@@@@@@@@@@@@-   \r\n" + //
                "\t      .-=*#==@@@@@@@@@@@@%    \r\n" + //
                "\t            .@@@@@@@@@@@@%-.  \r\n" + //
                "\t            :@@@@@@@@@@@@@:-=:\r\n" + //
                "\t            -@@@@@@@@@@@@@:   \r\n" + //
                "\t            =@@@@@@@@@@@@@-   \r\n" + //
                "\t            +@@@@@@@@@@@@@*   \r\n" + //
                "\t            %@@@@@@@@@@@@@%   \r\n" + //
                "\t            @@@@@@@@@@@@@@@.  \r\n" + //
                "\t           -@@@@@@@@@@@@@@@=  \r\n" + //
                "\t           .*@@@@@@@@@@@@@@#  \r\n" + //
                "\t             :@@%##%@@%*=-:   \r\n" + //
                "\t           -*@#*-   @@+       \r\n" + //
                "\t            .       =##. ");
    }

    void ranger() {
        System.out.println("\t           -                  \r\n" + //
                "\t         ::.                  \r\n" + //
                "\t       -:   ..                \r\n" + //
                "\t     -:      ..               \r\n" + //
                "\t   .#-         .-%@@#:  *##-  \r\n" + //
                "\t  .*=.          #@@@@* -=:    \r\n" + //
                "\t  :%            +#@@%+#-::.   \r\n" + //
                "\t ::@***#%%++++*##%@@@@@@@@%.  \r\n" + //
                "\t  :@:::----::--+@@@@@@%=:.    \r\n" + //
                "\t  :#:          -@@@@@@:       \r\n" + //
                "\t   =@           +@@@@%        \r\n" + //
                "\t    :=         .*@@@@@.       \r\n" + //
                "\t      -.      .:@@@@@@%.      \r\n" + //
                "\t       .:.  .. +@@@@@@@%      \r\n" + //
                "\t         .:.   %@@@@@@@@=     \r\n" + //
                "\t               @@@@@@@@@%     \r\n" + //
                "\t               @@@@@@@@@@+    \r\n" + //
                "\t               %@@@@@@@@@@:   \r\n" + //
                "\t               +@@@@@@@@@@@-  \r\n" + //
                "\t               =@@@##***@@@-  \r\n" + //
                "\t               .@@+     :@@=  \r\n" + //
                "\t                %@-      .@@  \r\n" + //
                "\t                #@        +@#.");
    }

    public void ChooseRole() {
        clearScreen();
        System.out.println("=====================(Pilih ChooseRole)======================");
        System.out.println();
        System.out.println("[1] Warrior");
        System.out.println(
                "Tank atau damage dealer utama dalam pertarungan. Biasanya berada di garis depan untuk melindungi anggota party lainnya.");
        System.out.println("_______________________________________________________");
        System.out.println("[2] Mage");
        System.out.println(
                "Damage dealer jarak jauh dengan kemampuan menyerang banyak musuh sekaligus. Mereka seringkali memiliki kemampuan pendukung seperti menyembuhkan atau melindungi teman.");
        System.out.println("_______________________________________________________");
        System.out.println("[3] Rogue");
        System.out.println(
                "Damage dealer yang gesit dan lincah. Mereka seringkali memiliki kemampuan untuk menyerang dari belakang atau melemahkan musuh.");
        System.out.println("_______________________________________________________");
        System.out.println("[4] Cleric");
        System.out.println(
                "Healer atau support yang bertugas menjaga kesehatan anggota party dan memberikan dukungan dalam pertempuran.");
        System.out.println("_______________________________________________________");
        System.out.println("[5] Ranger");
        System.out.println(
                "Damage dealer jarak jauh yang seringkali memiliki kemampuan untuk memanggil hewan atau perangkap.");
        System.out.println();
        System.out.print("Pilih ChooseRole (1-5): ");
        return;
    }

    public void registrasi() {
        System.out.println("=====================(Sign Up)======================");
        System.out.println();
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();
        System.out.println("Pilih ChooseRole: ");
        ChooseRole();
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                role = "Warrior";
                break;
            case 2:
                role = "Mage";
                break;
            case 3:
                role = "Rogue";
                break;
            case 4:
                role = "Cleric";
                break;
            case 5:
                role = "Ranger";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        int level = 1;
        playerList.addPlayer(new Player("ardi", "k", "123", "Ranger", 1));
        playerList.addPlayer(new Player(name, email, password, role, level));
        System.out.println("Registrasi Berhasil! Anda sekarang dapat login.");
        clearScreen();
    }

    public void login() {
        System.out.println("=====================(Log In)======================");
        System.out.println();
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
        clearScreen();
    }

    public void menuUtama(Player player) {
        boolean backToDashboard = false;

        while (!backToDashboard) {
            clearScreen();
            System.out.println("=====================(Main Menu)======================");
            System.out.println();
            System.out.println("[1] Masuk ke Matchmaking");
            System.out.println("[2] Lihat Statistik");
            System.out.println("[3] Exit");
            System.out.println();
            System.out.print("Pilih opsi: ");
            int pilih = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            clearScreen();
            switch (pilih) {
                case 1:
                    System.out.println("Menunggu pemain...");
                    team1.enqueue(player);
                    if (team1.total() == 3) {
                        team1.displayQueue();
                    }
                    break;
                case 2:
                    System.out.println("=====================(Player Statistic)======================");
                    System.out.println();
                    switch (choice) {
                        case 1:
                            warrior();
                            break;
                        case 2:
                            mage();
                            break;
                        case 3:
                            rogue();
                            break;
                        case 4:
                            cleric();
                            break;
                        case 5:
                            ranger();
                            break;
                    }
                    System.out.println("[+]-------------------------------------------------------[+]\n");
                    System.out.println("Email              : " + player.email);
                    System.out.println("Nama               : " + player.name);
                    System.out.println("Role               : " + player.role);
                    System.out.println("Level              : " + player.Level);
                    System.out.println("Total Pertandingan : " + player.totalMain);
                    System.out.println("Kemenangan         : " + player.wins);
                    System.out.println("Win Rate           : " + player.getWinRate() + "%");
                    String getAction = scanner.nextLine();
                    if (getAction == "\n") {
                        menuUtama(player);
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari Menu Utama.");
                    backToDashboard = true;
                    clearScreen();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    clearScreen();
            }
        }
    }
}
