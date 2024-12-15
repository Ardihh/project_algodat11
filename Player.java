public class Player {
    String name;
    String email;
    String password;
    String role;
    int skillLevel;
    int totalMain;
    int wins;
    Player next;

    Player(String name, String email, String password, String role, int skillLevel) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.skillLevel = skillLevel;
        this.totalMain = 0;
        this.wins = 0;
        this.next = null;
    }

    double getWinRate() {
        if (totalMain > 0) {
            double wr = (double) wins / totalMain;
            double persen = wr * 100;
            return persen;
        } else {
            return 0;
        }
    }
}
