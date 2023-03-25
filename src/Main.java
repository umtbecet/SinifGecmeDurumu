import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int gecmeNotu=55;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat= input.nextInt();
        if (mat<0||100<mat){
            mat=0;
        }else{
            mat=mat;
        }
        System.out.print("Fizik Notunuz : ");
        fizik= input.nextInt();
        if (fizik<0||100<fizik){
            fizik=0;
        }else{
            fizik=fizik;
        }
        System.out.print("Türkçe Notunuz : ");
        turkce= input.nextInt();
        if (turkce<0||100<turkce){
            turkce=0;
        }else{
            turkce=turkce;
        }
        System.out.print("Kimya Notunuz : ");
        kimya= input.nextInt();
        if (kimya<0||100<kimya){
            kimya=0;
        }else{
            kimya=kimya;
        }
        System.out.print("Müzik Notunuz : ");
        muzik= input.nextInt();
        if (muzik<0||100<muzik){
            muzik=0;
        }else{
            muzik=muzik;
        }
        double avarage = (mat+fizik+turkce+kimya+muzik)/5;

        if(avarage<=gecmeNotu){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");

        }else {
            System.out.println("Tebrikler sınıfı geçtiniz!");

        };
        System.out.println("Ortalamanız : " + avarage);
    }
}




















