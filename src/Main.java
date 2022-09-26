import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String SOUND5 = "Snap";
        final String SOUND2 = "Crackle";
        final String SOUND3 = "Pop";
        String sOut="";
        int n;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            n=sc.nextInt();
            if (n%3==0) {
                sOut+=SOUND3+" ";
                continue;
            }
            if (n%3!=0 && n%2==0 ) {
                sOut+=SOUND2+" ";
                continue;
            }
            sOut+=SOUND5+" ";s
        };
        System.out.println(sOut.trim());
    }
}