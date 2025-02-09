import java.util.Scanner;
public class MukemmelSayi {
    // keninden başka pozitif tm sayı bölenlerinin toplamı kendisine eşit olan sayıdır

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number ;
        int total = 0;

        // kullanıcı girdisi
        System.out.println("Bir sayi giriniz: ");
        number = scanner.nextInt();

        for (int i=1 ; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }

        if (number == total){
            System.out.println("Girilen sayi mukemmel sayidir.");
        } else {
            System.out.println("Girilen sayi mukemmel sayi degildir. " +
                    "Bolenleri toplamı : "+ total);
        }


    }
}
