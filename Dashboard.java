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
        banner();
        System.out.println("Sign up menu");
        System.out.println();
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
        clearScreen();
    }

    public void login(LinkedList playerList) {
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
        clearScreen();
    }

    public void menuUtama(Player player, LinkedList playerList) {
        boolean backToDashboard = false;
        if (player.role.equalsIgnoreCase("Warrior")) choice = 1;
        else if (player.role.equalsIgnoreCase("Mage")) choice = 2;
        else if (player.role.equalsIgnoreCase("Rogue")) choice = 3;
        else if (player.role.equalsIgnoreCase("Cleric")) choice = 4;
        else if (player.role.equalsIgnoreCase("Ranger")) choice = 5;
        // menambahkan player ke list dan queue
        Player a = new Player("a", "a@gmail.com", "123", "Mage", 1);
        Player b = new Player("b", "b@gmail.com", "123", "Warrior", 2);
        Player c = new Player("c", "c@gmail.com", "123", "Rogue", 3);
        Player d = new Player("d", "d@gmail.com", "123", "Cleric", 4);
        Player e = new Player("e", "e@gmail.com", "123", "Ranger", 5);
        Player f = new Player("f", "f@gmail.com", "123", "Mage", 1);
        Player g = new Player("g", "g@gmail.com", "123", "Warrior", 2);
        Player h = new Player("h", "h@gmail.com", "123", "Rogue", 3);
        Player i = new Player("i", "i@gmail.com", "123", "Cleric", 4);
        Player j = new Player("j", "j@gmail.com", "123", "Ranger", 5);
        Player k = new Player("k", "k@gmail.com", "123", "Mage", 1);
        Player l = new Player("l", "l@gmail.com", "123", "Warrior", 2);
        Player m = new Player("m", "m@gmail.com", "123", "Rogue", 3);
        Player n = new Player("n", "n@gmail.com", "123", "Cleric", 4);
        Player o = new Player("o", "o@gmail.com", "123", "Ranger", 5);
        Player p = new Player("p", "p@gmail.com", "123", "Mage", 1);
        Player q = new Player("q", "q@gmail.com", "123", "Warrior", 2);
        Player r = new Player("r", "r@gmail.com", "123", "Rogue", 3);
        Player s = new Player("s", "s@gmail.com", "123", "Cleric", 4);
        Player t = new Player("t", "t@gmail.com", "123", "Ranger", 5);
        // menambahkan node ke list
        playerList.addPlayer(a);
        playerList.addPlayer(b);
        playerList.addPlayer(c);
        playerList.addPlayer(d);
        playerList.addPlayer(e);
        playerList.addPlayer(f);
        playerList.addPlayer(g);
        playerList.addPlayer(h);
        playerList.addPlayer(i);
        playerList.addPlayer(j);
        playerList.addPlayer(k);
        playerList.addPlayer(l);
        playerList.addPlayer(m);
        playerList.addPlayer(n);
        playerList.addPlayer(o);
        playerList.addPlayer(p);
        playerList.addPlayer(q);
        playerList.addPlayer(r);
        playerList.addPlayer(s);
        playerList.addPlayer(t);
        // menambahkan ke queue
        newQueue.enqueue(a);
        newQueue.enqueue(b);
        newQueue.enqueue(c);
        newQueue.enqueue(d);
        newQueue.enqueue(e);
        newQueue.enqueue(f);
        newQueue.enqueue(g);
        newQueue.enqueue(h);
        newQueue.enqueue(i);
        newQueue.enqueue(j);
        newQueue.enqueue(k);
        newQueue.enqueue(l);
        newQueue.enqueue(m);
        newQueue.enqueue(n);
        newQueue.enqueue(o);
        newQueue.enqueue(p);
        newQueue.enqueue(q);
        newQueue.enqueue(r);
        newQueue.enqueue(s);
        newQueue.enqueue(t);
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
            scanner.nextLine();
            switch (pilih) {
                case 1:
                    clearScreen();
                    banner();
                    TeamTree newTeam = new TeamTree();
                    // newTeam.formTeam(player, playerList, newQueue);
                    break;
                case 2:
                    clearScreen();
                    banner();
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
                    System.out.println("Email              : " + player.email);
                    System.out.println("Nama               : " + player.name);
                    System.out.println("Role               : " + player.role);
                    System.out.println("Level              : " + player.Level);
                    System.out.println("Total Pertandingan : " + player.totalMain);
                    System.out.println("Kemenangan         : " + player.wins);
                    System.out.println("Win Rate           : " + player.getWinRate() + "%");
                    String getAction = scanner.nextLine();
                    if (getAction == "\n") {
                        menuUtama(player, playerList);
                    }
                    break;
                case 3:
                    MatchmakingSort sorting = new MatchmakingSort();
                    TeamTree leaderboardTree = sorting.linearSearchByLevel(playerList, player.Level);

                    if (leaderboardTree != null) {
                        leaderboardTree.displayLeaderboardAscending();
                        leaderboardTree.displayLeaderboardDescending();
                    }
                case 4:
                    System.out.println("Keluar dari Menu Utama.");
                    backToDashboard = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    clearScreen();
            }
        }
        return;
    }
}
