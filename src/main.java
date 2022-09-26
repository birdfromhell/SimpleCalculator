/*
Create By
Ababil Mustax @2022
*/

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        function fungsi = new function();
        Scanner scan = new Scanner(System.in);
        int angka1 ;
        int angka2 ;
        String jawaban ;

        System.out.println("==========");
        System.out.println("a.+");
        System.out.println("a.-");
        System.out.println("c.*");
        System.out.println("d./");
        System.out.println("==========");

        System.out.println("Pilih Operator ?");
        jawaban = scan.nextLine();
        System.out.println("Masukan Angka pertama ? ");
        angka1 = scan.nextInt();
        System.out.println("Masukan Angka Kedua ? ");
        angka2 = scan.nextInt();
        System.out.println(" ");


        switch(jawaban){
            case "a" :
                System.out.println("hasil:");
                System.out.println(angka1 +" + "+ angka2 + " = "+ fungsi.tambah(angka1,angka2));
                break;
            case "b" :
                System.out.println("hasil:");
                System.out.println(angka1 +" - "+ angka2 + " = "+ fungsi.kurang(angka1,angka2));
                break;
            case "c" :
                System.out.println("hasil:");
                System.out.println(angka1 +" x "+ angka2 + " = "+ fungsi.kali(angka1,angka2));
                break;
            case "d" :
                System.out.println("hasil:");
                System.out.println(angka1 +" / "+ angka2 + " = "+ fungsi.bagi(angka1,angka2));
                break;
            default:
                System.out.println("Oprasi Tidak Ada!!!");
                         }


    }



}
