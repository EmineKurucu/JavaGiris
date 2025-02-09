import java.util.Scanner;


public class sesliHarfler {
    public static void main(String[] args){

        // sesli harf listeleri
        Character[] inceSesli = {'e', 'i', 'ü','ö' };
        Character[] kalinSesli = {'a', 'ı', 'o', 'u'};

        // Kullanıcının girdiği harf kalın sesli mi ince sesli mi
        char kullaniciGirdisi = 'a';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalin ya da ince sesli harf tespiti için sesli harf giriniz: ");
        kullaniciGirdisi = scanner.next().charAt(0);

        for (char harf : inceSesli){
            if (harf == kullaniciGirdisi){
                System.out.println("İnce sesli harf girildi.");
            }
        }

        for (char harf : kalinSesli){
            if (harf == kullaniciGirdisi){
                System.out.println("Kalin sesli harf girildi.");
            }
        }



    }
}
