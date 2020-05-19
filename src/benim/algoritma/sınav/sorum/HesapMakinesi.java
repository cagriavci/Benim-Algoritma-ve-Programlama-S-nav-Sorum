 
package benim.algoritma.sınav.sorum;
  
import java.util.Scanner;
//kullanıcıdan ıstedıgı sayıları alınız <<<<
//asallık kontrol eden oop ıle kodlanmıs bır program kodlayınız<<<
//4 ıslem ve yuvarlama kok ve mod alma ıslemlerını yapabılen makıneyı  oop ıle kodlayınız <<<<
  
public class HesapMakinesi{

    int q;
    int p;
    
    
    public class Toplama{
    public int toplamaYap(int a,int b){
    return a+b;
    }
    }
    protected class Cikarma{
        
        public int cikarmaYap(int a,int b){
        return a-b;
        }
    }
    class Carpma{
        
        public int carpmaYap(int a,int b){
        return a*b;
        }
    }
    private class Bolme{
        
        public int bolmeYap(int a,int b){
        return a/b;
        }
    }
    class UsAlma{
        
        public int UsAl(int a,int b){
        int sonuc=1;//a üzeri b seklınde ıstenıyor
        while(b>0){
            sonuc=a*a;
            b--;
        }
        return sonuc;
        }
    }
    public class YukarıYuvarla{
    public double yukarıYuvarlamaYap(double y){
    
    double deger1=Math.ceil(y);
    return deger1;
    }
    }
    protected class AsagıYuvarla{
        
    public double asagıYuvarlamaYap(double y){
    double deger2= Math.floor(y);
    return deger2;
        }
    }
    class KokAl{
        
        public double kokAlmaYap(double y){
        return Math.sqrt(y);
        }
    }
    private class MutlakDeger{
        
        public double mutlakDegerAl(double y){
        return Math.abs(y);
        }
    }

    
    public static void main(String[] args) {
        System.out.println("ASALLIK KONTROLU YAPACAGIN ILK SAYIYI GIR");
        Scanner rakam4=new Scanner(System.in);
        int q=rakam4.nextInt();
        System.out.println("ASALLIK KONTROLU YAPACAGIN IKINCI SAYIYI GIR");
        Scanner rakam5=new Scanner(System.in);
        int p=rakam5.nextInt();
         
        System.out.println("ISLEM YAPMAK ISTEDIGIN ILK SAYIYI GIR");
        Scanner rakam1=new Scanner(System.in);
        int a=rakam1.nextInt();
        System.out.println("ISLEM YAPMAK ISTEDIGIN IKINCI SAYIYI GIR");
        Scanner rakam2=new Scanner(System.in);
        int b=rakam2.nextInt();
        
        
        System.out.println("BILIMSEL HESAP MAKINESINDE ISLEM YAPMAK ISTEDIGIN SAYIYI GIR");
        Scanner rakam3=new Scanner(System.in);
        final double y=rakam3.nextDouble();

        HesapMakinesi.Toplama x1=new HesapMakinesi().new Toplama();
        HesapMakinesi.Cikarma x2=new HesapMakinesi().new Cikarma();
        HesapMakinesi.Carpma x3=new HesapMakinesi().new Carpma();
        HesapMakinesi.Bolme x4=new HesapMakinesi().new Bolme();
        HesapMakinesi.UsAlma x5=new HesapMakinesi().new UsAlma();
        HesapMakinesi.YukarıYuvarla x6=new HesapMakinesi().new YukarıYuvarla();
        HesapMakinesi.AsagıYuvarla x7=new HesapMakinesi().new AsagıYuvarla();
        HesapMakinesi.KokAl x8=new HesapMakinesi().new KokAl();
        HesapMakinesi.MutlakDeger x9=new HesapMakinesi().new MutlakDeger();
        asallikkontrol x10=new asallikkontrol();
        

        int sonuc1=x1.toplamaYap(a, b);
        int sonuc2=x2.cikarmaYap(a, b);
        int sonuc3=x3.carpmaYap(a, b);
        int sonuc4=x4.bolmeYap(a, b);
        int sonuc5=x5.UsAl(a, b);
        double sonuc6=x6.yukarıYuvarlamaYap(y);
        double sonuc7=x7.asagıYuvarlamaYap(y);
        double sonuc8=x8.kokAlmaYap(y);
        double sonuc9=x9.mutlakDegerAl(y);
        int sonuc10=x10.asallikbul(p,q);
       

        System.out.println("TOPLAM SONUC ==> "+sonuc1);
        System.out.println("CIKARMA SONUC ==> "+sonuc2);
        System.out.println("CARPMA SONUC ==> "+sonuc3);
        System.out.println("BOLME SONUC ==> "+sonuc4);
        System.out.println("US ALMASONUC ==> "+sonuc5);
        System.out.println("  ");
        System.out.println(" ********************************** ");
        System.out.println("BILIMSEL MAKINEDE YUKARI YUVARLANDIGI SONUCU==> "+sonuc6);
        System.out.println("BILIMSEL MAKINEDE ASAGI YUVARLANDIGI SONUCU ==> "+sonuc7);
        System.out.println("BILIMSEL MAKINEDE KOKU==> "+sonuc8);
        System.out.println("BILIMSEL MAKINEDE MUTLAK DEGERI ==> "+sonuc9);
        System.out.println("  ");
        System.out.println(" ********************************** ");
        if(sonuc10==0){
            System.out.println(p+" ve "+q+"  BU IKI SAYI ARALARINDA ASALDIR");
        }else
            System.out.println(p+"ve  "+q+"BU IKI SAYI ARALARINDA ASAL DEGILDIR ");
        
    }


}
    
    
    
    
    
    
    
    
    
    
    
    
