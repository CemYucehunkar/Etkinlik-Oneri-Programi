import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sıcaklık Giriniz:");
        heat = input.nextInt();


        if (heat < 5) {
            System.out.print("Kayak Yapmaya Gidebilirsiniz!");
        } else if (heat >= 5 && heat <= 25) {
            if (heat >= 10) {
                System.out.println("Pikniğe Gidebilirsin!");
            }
            if (heat <= 15) {
                System.out.print("Sinemaya Gidebilirsin !");
            }

        }

    }
}