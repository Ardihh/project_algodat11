import java.util.Scanner;

public class Dashboard {
    Player head;
    Queue newQueue = new Queue();
    static Scanner scanner = new Scanner(System.in);
    String role = null;
    int index = 0;
    int choice = 0;

    public void banner() {
        System.out.println("\r\n" + //
                "███████╗██╗  ██╗██╗██╗     ██╗     ███████╗██╗   ██╗███╗   ██╗ ██████╗\r\n" + //
                "██╔════╝██║ ██╔╝██║██║     ██║     ██╔════╝╚██╗ ██╔╝████╗  ██║██╔════╝\r\n" + //
                "███████╗█████╔╝ ██║██║     ██║     ███████╗ ╚████╔╝ ██╔██╗ ██║██║     \r\n" + //
                "╚════██║██╔═██╗ ██║██║     ██║     ╚════██║  ╚██╔╝  ██║╚██╗██║██║     \r\n" + //
                "███████║██║  ██╗██║███████╗███████╗███████║   ██║   ██║ ╚████║╚██████╗\r\n" + //
                "╚══════╝╚═╝  ╚═╝╚═╝╚══════╝╚══════╝╚══════╝   ╚═╝   ╚═╝  ╚═══╝ ╚═════╝\r\n" + //
                "                                                                      \r" + //
                "");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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

    public String ChooseRole() {
        clearScreen();
        index = 1;
        role newRole = new role();
        String getAction = null;
        while (true) {
            clearScreen();
            switch (index) {
                case 1:
                    newRole.warriorIcon();
                    break;
                case 2:
                    newRole.mageIcon();
                    break;
                case 3:
                    newRole.rogueIcon();
                    break;
                case 4:
                    newRole.clericIcon();
                    break;
                case 5:
                    newRole.rangerIcon();
                    break;
            }
            System.out.println();
            System.out.println("- ketik A/a + enter untuk ke pilihan sebelumnya");
            System.out.println("- ketik D/d + enter untuk ke pilihan selanjutnya");
            System.out.println("- ketik yes + enter untuk memilih role.");
            System.out.print("pilih: ");
            getAction = scanner.nextLine();
            clearScreen();
            if (getAction.equalsIgnoreCase("yes")) {
                switch (index) {
                    case 1:
                        return "Warrior";
                    case 2:
                        return "Mage";
                    case 3:
                        return "Rogue";
                    case 4:
                        return "Cleric";
                    case 5:
                        return "Ranger";
                }
            } else if (getAction.equalsIgnoreCase("A")) {
                index = (index == 1) ? 5 : index - 1;
            } else if (getAction.equalsIgnoreCase("D")) {
                index = (index == 5) ? 1 : index + 1;
            } else {
                System.out.println("Input tidak valid, coba lagi!");
            }
        }
    }

    public void registrasi(LinkedList playerList) {
        clearScreen();
        banner();
        System.out.println();
        System.out.println("Sign up menu");
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();
        System.out.println("Pilih ChooseRole: ");
        role = ChooseRole();
        int level = 1;
        playerList.addPlayer(new Player(name, email, password, role, level));
        System.out.println("Registrasi Berhasil! Anda sekarang dapat login.");
    }

    public void login(LinkedList playerList) {
        clearScreen();
        banner();
        System.out.println("Login menu");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Player player = playerList.findPlayer(name, password);
        if (player != null) {
            System.out.println("Login berhasil! Selamat datang, " + player.name);
            System.out.println(player.name);
            menuUtama(player, playerList);
        } else {
            System.out.println("Nama atau Password Salah!");
        }
    }

    public void menuUtama(Player player, LinkedList playerList) {
        boolean backToDashboard = false;
        if (player.role.equalsIgnoreCase("Warrior"))
            choice = 1;
        else if (player.role.equalsIgnoreCase("Mage"))
            choice = 2;
        else if (player.role.equalsIgnoreCase("Rogue"))
            choice = 3;
        else if (player.role.equalsIgnoreCase("Cleric"))
            choice = 4;
        else if (player.role.equalsIgnoreCase("Ranger"))
            choice = 5;
        // buat team random
        // akun team yang akan dilawan user
        Queue teamA = new Queue();
        Player mod = new Player("moderator", "mod@gmail.com", "1234", "Mage", 2);
        Player user1 = new Player("johnDoe", "johndoe@example.com", "password123", "Warrior", 1);
        Player user2 = new Player("janeDoe", "janedoe@example.com", "qwerty", "Ranger", 3);
        playerList.addPlayer(user2);
        playerList.addPlayer(user1);
        playerList.addPlayer(mod);
        teamA.enqueue(user2);
        teamA.enqueue(user1);
        teamA.enqueue(mod);
        Queue teamB = new Queue();
        Player gamer1 = new Player("gamerBoy", "gamerboy@games.com", "gamer123", "Rogue", 5);
        Player proPlayer = new Player("proGamer", "progamer@pro.com", "pro123", "Mage", 4);
        Player newbie = new Player("newbie123", "newbie@example.com", "newbie123", "Warrior", 4);
        playerList.addPlayer(proPlayer);
        playerList.addPlayer(gamer1);
        playerList.addPlayer(newbie);
        teamB.enqueue(proPlayer);
        teamB.enqueue(gamer1);
        teamB.enqueue(newbie);
        Queue teamC = new Queue();
        Player veteran = new Player("veteranGamer", "veterangamer@veteran.com", "veteran123", "Cleric", 15);
        Player player9 = new Player("girlGamer", "girlgamer@girlgames.com", "girlgamer123", "Rogue", 16);
        Player player8 = new Player("coolDude", "cooldude@example.com", "cooldude123", "Ranger", 14);
        playerList.addPlayer(player9);
        playerList.addPlayer(player8);
        playerList.addPlayer(veteran);
        teamC.enqueue(player9);
        teamC.enqueue(player8);
        teamC.enqueue(veteran);
        Queue teamD = new Queue();
        Player player10 = new Player("speedRun", "speedrun@speed.com", "speed123", "Warrior", 2);
        Player casual = new Player("casualGamer", "casualgamer@casual.com", "casual123", "Mage", 3);
        Player hardcore = new Player("hardcoreGamer", "hardcoregamer@hardcore.com", "hardcore123", "Cleric", 4);
        playerList.addPlayer(player10);
        playerList.addPlayer(casual);
        playerList.addPlayer(hardcore);
        teamD.enqueue(player10);
        teamD.enqueue(casual);
        teamD.enqueue(hardcore);
        Queue teamE = new Queue();
        Player playerGG = new Player("noobSlayer", "noobslayer@noob.com", "noob123", "Ranger", 9);
        Player player14 = new Player("proNewbie", "pronewbie@pronewbie.com", "pronewbie123", "Rogue", 10);
        Player player15 = new Player("legendGamer", "legendgamer@legend.com", "legend123", "Warrior", 11);
        playerList.addPlayer(playerGG);
        playerList.addPlayer(player14);
        playerList.addPlayer(player15);
        teamE.enqueue(playerGG);
        teamE.enqueue(player14);
        teamE.enqueue(player15);
        // menambahkan player ke list dan queue
        Player p1 = new Player("Arden", "arden@gmail.com", "123", "Warrior", 10);
        Player p2 = new Player("Elyra", "elyra@gmail.com", "456", "Mage", 8);
        Player p3 = new Player("Kael", "kael@gmail.com", "789", "Ranger", 7);
        Player p4 = new Player("Lorien", "lorien@gmail.com", "321", "Assassin", 15);
        Player p5 = new Player("Thane", "thane@gmail.com", "654", "Tank", 12);
        Player p6 = new Player("Seris", "seris@gmail.com", "987", "Support", 9);
        Player p7 = new Player("Maven", "maven@gmail.com", "234", "Mage", 6);
        Player p8 = new Player("Ryker", "ryker@gmail.com", "567", "Warrior", 13);
        Player p9 = new Player("Zara", "zara@gmail.com", "890", "Ranger", 11);
        Player p10 = new Player("Dorian", "dorian@gmail.com", "345", "Assassin", 14);
        Player p11 = new Player("Lyric", "lyric@gmail.com", "678", "Tank", 16);
        Player p12 = new Player("Ember", "ember@gmail.com", "901", "Support", 5);
        Player p13 = new Player("Jarek", "jarek@gmail.com", "111", "Warrior", 18);
        Player p14 = new Player("Nyssa", "nyssa@gmail.com", "222", "Mage", 20);
        Player p15 = new Player("Caius", "caius@gmail.com", "333", "Ranger", 4);
        Player p16 = new Player("Taryn", "taryn@gmail.com", "444", "Assassin", 19);
        Player p17 = new Player("Kieran", "kieran@gmail.com", "555", "Tank", 3);
        Player p18 = new Player("Aeris", "aeris@gmail.com", "666", "Support", 2);
        Player p19 = new Player("Vanya", "vanya@gmail.com", "777", "Warrior", 17);
        Player p20 = new Player("Orin", "orin@gmail.com", "888", "Mage", 1);

        // menambahkan node ke list
        playerList.addPlayer(p1);
        playerList.addPlayer(p2);
        playerList.addPlayer(p3);
        playerList.addPlayer(p4);
        playerList.addPlayer(p5);
        playerList.addPlayer(p6);
        playerList.addPlayer(p7);
        playerList.addPlayer(p8);
        playerList.addPlayer(p9);
        playerList.addPlayer(p10);
        playerList.addPlayer(p11);
        playerList.addPlayer(p12);
        playerList.addPlayer(p13);
        playerList.addPlayer(p14);
        playerList.addPlayer(p15);
        playerList.addPlayer(p16);
        playerList.addPlayer(p17);
        playerList.addPlayer(p18);
        playerList.addPlayer(p19);
        playerList.addPlayer(p20);
        while (!backToDashboard) {
            clearScreen();
            banner();
            System.out.println();
            System.out.println("[1] Masuk ke Matchmaking");
            System.out.println("[2] Lihat Statistik");
            System.out.println("[3] Leaderboard");
            System.out.println("[4] Exit");
            System.out.println();
            System.out.print("Pilih opsi: ");
            int pilih = scanner.nextInt();
            String getAction = null;
            scanner.nextLine();
            clearScreen();
            banner();
            switch (pilih) {
                case 1:
                    MatchmakingSort sorting = new MatchmakingSort();
                    Queue teams = new Queue();
                    RandomQueueSelector pick = new RandomQueueSelector(teamA, teamB, teamC, teamD, teamE);
                    Queue teamLawan = pick.getRandomQueue();
                    sorting.tampilkanTeam(player, playerList, player.Level, teams);
                    clearScreen();
                    banner();
                    sorting.playMatch(player, teams, teamLawan);
                    getAction = scanner.nextLine();
                    if (getAction == "\n") {
                        menuUtama(player, playerList);
                    }
                    player.totalMain++;
                    break;
                case 2:
                    System.out.println(player.name + " statistic!");
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
                    System.out.println();
                    System.out.println("Email              : " + player.email);
                    System.out.println("Nama               : " + player.name);
                    System.out.println("Role               : " + player.role);
                    System.out.println("Level              : " + player.Level);
                    System.out.println("Total Pertandingan : " + player.totalMain);
                    System.out.println("Kemenangan         : " + player.wins);
                    System.out.println("Win Rate           : " + player.getWinRate() + "%");
                    getAction = scanner.nextLine();
                    if (getAction == "\n") {
                        menuUtama(player, playerList);
                    }
                    break;
                case 3:
                    TeamTree leaderboard = new TeamTree();
                    Player current = playerList.head;

                    while (current != null) {
                        leaderboard.insert(current);
                        current = current.next;
                    }
                    leaderboard.displayLeaderboard();
                    getAction = scanner.nextLine();
                    if (getAction == "\n") {
                        menuUtama(player, playerList);
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari Menu Utama.");
                    backToDashboard = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        return;
    }
}
