import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Dashboard menuDashboard = new Dashboard();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            menuDashboard.banner();
            System.out.println("[1] Registrasi");
            System.out.println("[2] Login");
            System.out.println("[3] Exit");
            System.out.println();
            System.out.print("Pilih opsi (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            menuDashboard.clearScreen();
            switch (choice) {
                case 1:
                    menuDashboard.registrasi();
                    Thread.sleep(1500);
                    menuDashboard.clearScreen();
                    break;
                case 2:
                    menuDashboard.login();
                    Thread.sleep(1500);
                    menuDashboard.clearScreen();
                    break;
                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    running = false;
                    Thread.sleep(1500);
                    menuDashboard.clearScreen();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    Thread.sleep(1500);
                    menuDashboard.clearScreen();
            }
        }
    }
}
