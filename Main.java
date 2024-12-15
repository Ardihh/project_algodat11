import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Dashboard menuDashboard = new Dashboard();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n=== Dashboard Utama ===");
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            scanner.nextLine();
            switch (choice) {
                case 1:
                    menuDashboard.registrasi();
                    Thread.sleep(1500);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush(); 
                    break;
                case 2:
                    menuDashboard.login();
                    Thread.sleep(1500);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    break;
                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    running = false;
                    Thread.sleep(1500);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    Thread.sleep(1500);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
            }
        }
    }
}
