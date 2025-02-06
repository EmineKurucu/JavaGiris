import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    System.out.println("Hello java");

    System.out.println("---Variables---");
    int ogrenciSayisi = 10;
    String metin = "ogrnci sayisi";
    System.out.println(metin + ogrenciSayisi);

    char character = 'x';
    System.out.println(character);

    double doubleSay = 5.2;
    System.out.println(doubleSay);

    boolean isAlive = false;
    System.out.println(isAlive);
    System.out.println("----------");

    System.out.println("---Kosullar---");
    System.out.println("IF-Else If-Else");

    int sayi = 12;
    if (sayi <= 10){
        System.out.println("Sayi 10'dan kucuk. Sayi: "+ sayi);
    } else if (sayi > 10 && sayi <= 20 ){
        System.out.println("Sayi 10 ile 20 arasinda. Sayi: "+ sayi);
    }else {
        System.out.println("Sayi 20'den buyuk. Sayi : "+ sayi);
    }

    // aşağıdaki kod verilen 3 sayıdan en buyugunu bulur
    int sayi1 = 366;
    int sayi2 = 389;
    int sayi3 = 345;
    int enBuyukSayi = 0;



    if (sayi1 < sayi2 ){
        if (sayi3 < sayi2){
            enBuyukSayi = sayi2;
        } else {
                enBuyukSayi = sayi3;
            }

    }else {
        if (sayi1 > sayi3){
            enBuyukSayi = sayi1;
        } else {
            enBuyukSayi = sayi3;
        }
    }
    System.out.println("Verilen sayilarin en buyugu : "+ enBuyukSayi );

    System.out.println("Switch Yapısı");

    char grade = 'D';

    switch (grade) {
        case 'A':
            System.out.println("Mukemmel : Gectiniz.");
            break;
        case 'B':
            System.out.println("Iyi : Gectiniz.");
            break;
        case 'C':
            System.out.println("Ortalama: Gectiniz.");
            break;
        case 'D':
        case 'E':
            System.out.println("Kotu : Gectiniz.");
            break;
        case 'F':
            System.out.println("Cok kotu: Kaldiniz.");
            break;
        default:
            System.out.println("Gecersiz deger girildi.");
            break;
    }

    System.out.println();
    System.out.println("---Donguler---");
    System.out.println("For Dongusu");

    for (int i = 0; i <= 10; i++){
        System.out.println(i);
    }

    for (int a = 1; a <= 10; a+=2){
        System.out.println(a);
    } // 1 3 5 7 9

    System.out.println("While Dongusu");
    int j = 1;
    while (j <= 10) {
        System.out.println(j);
        j++;
    }

    System.out.println("Do While Dongusu");
    int i = 1;
    do {
        System.out.println(i);
        i++;
    }while (i < 10);
    System.out.println();

    // Diziler
    System.out.println("---DIZILER---");
    String[] ogrenciler = new String[4];
    ogrenciler[0] = "Egemen";
    ogrenciler[1] = "Derin";
    ogrenciler[2] = "Murat";
    ogrenciler[3] = "Buse";

    for (String ogrenci : ogrenciler ){
        System.out.println(ogrenci);
    }
    System.out.println();


    for (int index=0 ; index < ogrenciler.length; index++){
        System.out.println(ogrenciler[index]);
    }

    double[] myList = {1.2, 1.3, 4.3, 5.6};
    double toplam = 0;
    double enBuyuk = myList[0];

    for ( double num : myList){
        System.out.println(num);
        toplam += num;
        if (num > enBuyuk){
            enBuyuk = num;
        }
    }
    System.out.println("Yazdirilan sayilarin toplami: "+ toplam);
    System.out.println("Yazdirilan sayilarin en buyugu: "+ enBuyuk);
    System.out.println();

    // multidimensional diziler
    System.out.println("Multidimensional Diziler");

    String[][] sehirler = new String[3][3];
    sehirler[0][0] = "Istanbul";
    sehirler[0][1] = "Eskisehir";
    sehirler[0][2] = "Yalova";
    sehirler[1][0] = "Ankara";
    sehirler[1][1] = "Bursa";
    sehirler[1][2] = "Edirne";
    sehirler[2][0] = "Tekirdag";
    sehirler[2][1] = "Gaziantep";
    sehirler[2][2] = "Adana";

    for (int dis =0 ; dis < sehirler.length; dis++){
        System.out.println("----------------");
        for (int ic =0 ; ic < sehirler.length; ic++) {
            System.out.println(sehirler[dis][ic]);
        }
    }
    System.out.println();

    // Stringler
    System.out.println("---Stringler---");
    String mesaj = "Bugun hava cok guzel";
    // stringler charların bir araya gelmesiyle oluşur
    System.out.println("Mesajin uzunlugu : " + mesaj.length());
    System.out.println("Mesajin 3. elemani : " + mesaj.charAt(2)); // g
    System.out.println(mesaj.concat(" Yasasin")); // Bugun hava cok guzel Yasasi
    System.out.println(mesaj.startsWith("B")); // true döndürür
    System.out.println(mesaj.startsWith("A")); // false
    System.out.println(mesaj.endsWith("n")); // true
    System.out.println(mesaj.endsWith("N")); // false

    char[] karakterler = new char[5];
    mesaj.getChars(0,5, karakterler,0);
    System.out.println(karakterler);
    System.out.println(mesaj.indexOf('a')); // 7
    System.out.println(mesaj.lastIndexOf('a')); // 9

    String yeniMesaj = mesaj.replace(' ', '*'); // Bugun*hava*cok*guzel
    System.out.println(yeniMesaj);
    System.out.println(mesaj.substring(2, 8)); // gun ha 8.index dahil değil
    System.out.println();

    for (String kelime : mesaj.split(" ")){
        System.out.println(kelime);
    }
    String boslukluStrinng = "  Basta ve sonda bosluk var . ";
    // baş ve sondaki boşlukları atma
    System.out.println(boslukluStrinng); //   Basta ve sonda bosluk var .
    System.out.println(boslukluStrinng.trim()); //Basta ve sonda bosluk var .


    }
}