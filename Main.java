
public class Main {

    public static void main(String[] args) throws InterruptedException {
        LinkedList playerList = new LinkedList();

        
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

        System.out.println("Pemain sebelum diurutkan :");
        playerList.displayPlayers();
        MatchmakingSort.bubblesort(playerList);
        
        System.out.println("\nPemain setelah diurutkan berdasarkan Skill Level:");
        playerList.displayPlayers();




//        while (running) {
//            menuDashboard.banner();
//            System.out.println("[1] Registrasi");
//            System.out.println("[2] Login");
//            System.out.println("[3] Exit");
//            System.out.println();
//            System.out.print("Pilih opsi (1-3): ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            menuDashboard.clearScreen();
//            switch (choice) {
//                case 1:
//                    menuDashboard.registrasi();
//                    Thread.sleep(1500);
//                    menuDashboard.clearScreen();
//                    break;
//                case 2:
//                    menuDashboard.login();
//                    Thread.sleep(1500);
//                    menuDashboard.clearScreen();
//                    break;
//                case 3:
//                    System.out.println("Program selesai. Terima kasih!");
//                    running = false;
//                    Thread.sleep(1500);
//                    menuDashboard.clearScreen();
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid.");
//                    Thread.sleep(1500);
//                    menuDashboard.clearScreen();
//            }
//        }

//       

     

        
        String searchName = "k";
        Player foundPlayer = MatchmakingSort.binarySearch(playerList, searchName);
        if (foundPlayer != null) {
            System.out.println("Pemain ditemukan: " + foundPlayer.name);
        } else {
            System.out.println("Pemain tidak ditemukan");
        }
    }
}



 