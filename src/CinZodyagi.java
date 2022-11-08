import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {



        Scanner sc= new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz.");
        int dogumYili = sc.nextInt();

        int CinBurcu= dogumYili % 12;


        String[] cinZodyagi = { "Maymun", "Horoz","Kopek","Domuz","Fare","Okuz","Kaplan","Tavsan","Ejderha","Yilan","At","Koyun"};
        System.out.print("Cin Burcunuz: ");
        System.out.println(cinZodyagi[CinBurcu]);


    }
}
