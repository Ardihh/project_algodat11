import java.util.Scanner;

public class role {
    static Scanner scanner = new Scanner(System.in);
    String role = null;
    void bottomNav() {
        System.out.println("[+]==============================================[+]");
        System.out.println(" |                  <  Choose  >                  |");
        System.out.println("[+]==============================================[+]");
    }
    void warriorIcon() {
        System.out.println("[+]==============================================[+]");
        System.out.println(" |                     WARRIOR                    |");
        System.out.println("[+]==============================================[+]");
        System.out.println("\t\t         ==.     \r\n" + //
                "\t\t         **.     \r\n" + //
                "\t\t         *#      \r\n" + //
                "\t\t         *#      \r\n" + //
                "\t\t     .-:-##---.  \r\n" + //
                "\t\t      ::+%%=.:   \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        -%%-     \r\n" + //
                "\t\t        .#%:\r\n" + //
                "\t\t         .* ");
        System.out.println("   Tank atau damage dealer utama dalam pertarungan.");
        bottomNav();
    }

    void mageIcon() {
        System.out.println("[+]==============================================[+]");
        System.out.println(" |                       MAGE                     |");
        System.out.println("[+]==============================================[+]");
        System.out.println("\t\t          ..     \r\n" + //
                "\t\t         :-      \r\n" + //
                "\t\t        :=:::    \r\n" + //
                "\t\t       =%%%*-    \r\n" + //
                "\t\t    .=%#*+#%%#+=.\r\n" + //
                "\t\t  .+*#=+%@@%+##- \r\n" + //
                "\t\t     +#*@@@%+%%  \r\n" + //
                "\t\t      .-+#**+%@: \r\n" + //
                "\t\t      =@*#%##--. \r\n" + //
                "\t\t       %###:     \r\n" + //
                "\t\t       #@%.      \r\n" + //
                "\t\t      :%@#       \r\n" + //
                "\t\t       .+#*.     \r\n" + //
                "\t\t         #*=     \r\n" + //
                "\t\t         +%*     \r\n" + //
                "\t\t         =*=     \r\n" + //
                "\t\t        *#- ");
        System.out.println("   Damage dealer jarak jauh dengan kemampuan menyerang \n" +
                "   banyak musuh sekaligus.");
        bottomNav();
    }

    void rogueIcon() {
        System.out.println("[+]==============================================[+]");
        System.out.println(" |                      ROGUE                     |");
        System.out.println("[+]==============================================[+]");
        System.out.println("\t\t         :#:         \r\n" + //
                "\t\t         :*:         \r\n" + //
                "\t\t         -*-         \r\n" + //
                "\t\t         -*-         \r\n" + //
                "\t\t         -*-         \r\n" + //
                "\t\t       ..+#+..       \r\n" + //
                "\t\t         %*%         \r\n" + //
                "\t\t         %#%         \r\n" + //
                "\t\t         %#%         \r\n" + //
                "\t\t         %#%         \r\n" + //
                "\t\t         ###         \r\n" + //
                "\t\t         *%*         \r\n" + //
                "\t\t         =%=         \r\n" + //
                "\t\t         :%:         \r\n" + //
                "\t\t          # ");
        System.out.println("   Damage dealer yang gesit dan lincah.");
        bottomNav();
    }

    void clericIcon() {
        System.out.println("[+]==============================================[+]");
        System.out.println(" |                     CLERIC                     |");
        System.out.println("[+]==============================================[+]");
        System.out.println("\t\t          .         \r\n" + //
                "\t\t          =         \r\n" + //
                "\t\t     .-.-+%*=--     \r\n" + //
                "\t\t      :@@@@@@@=     \r\n" + //
                "\t\t   .:-#@@@@@@@@-:.  \r\n" + //
                "\t\t      .%@@@@@@=     \r\n" + //
                "\t\t      :--+@%=.-:    \r\n" + //
                "\t\t         :@#        \r\n" + //
                "\t\t          @=        \r\n" + //
                "\t\t          %-        \r\n" + //
                "\t\t          %-        \r\n" + //
                "\t\t          %-        \r\n" + //
                "\t\t          %:        \r\n" + //
                "\t\t          #:        \r\n" + //
                "\t\t          %-        \r\n" + //
                "\t\t          =:   ");
        System.out.println("   Healer atau support yang bertugas menjaga \n" +
                "   kesehatan anggota party dan memberikan dukungan \n" +
                "   dalam pertempuran.");
        bottomNav();
    }

    void rangerIcon() {
        System.out.println("[+]==============================================[+]");
        System.out.println(" |                     RANGER                     |");
        System.out.println("[+]==============================================[+]");
        System.out.println();
        System.out.println();
        System.out.println("\t\t         *-=+-           \r\n" + //
                "\t\t         +   -%+         \r\n" + //
                "\t\t         +     #%.       \r\n" + //
                "\t\t         +      %%       \r\n" + //
                "\t\t         +      -@=      \r\n" + //
                "\t\t  *@@+---=-------==--=@* \r\n" + //
                "\t\t  ...    =      -@=   :  \r\n" + //
                "\t\t         =      #@.      \r\n" + //
                "\t\t         =     +@:       \r\n" + //
                "\t\t         =   :##.        \r\n" + //
                "\t\t         +:=++.   ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("   Damage dealer jarak jauh.");
        bottomNav();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
