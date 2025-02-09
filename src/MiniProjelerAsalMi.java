import java.util.Scanner;


public class MiniProjelerAsalMi {
    public static void main(String[] args){

        // kullanıcıdan sayi girdisi alıp asal mı değil mi kontrol edicez
        // Scanner objesi oluşturuyoruz
        Scanner scanner = new Scanner(System.in);
        int sayi ;
        boolean asalMi = true;
        System.out.println("Asal mi degil mi bakilacak olan sayiyi yaziniz: ");
        sayi = scanner.nextInt();

        if (sayi < 1){
            System.out.println("Girilen deger gecersiz.");
            return;
        }

        if (sayi == 1) {
            System.out.println("Girilen sayi asal degildir.");
            return;
        }

        for (int i = 2; i < sayi; i++){
            if (sayi % i == 0){
                asalMi = false;
                break;
            }
        }

        if (asalMi){
            System.out.println("Girilen sayi asaldir");
        } else {
            System.out.println("Girilen sayi asal degildir");
        }



    }
}
