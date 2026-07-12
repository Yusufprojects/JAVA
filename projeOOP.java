import java.util.Scanner;

public class projeOOP {
    static void main(String[] args) {
        // sınıfadı obje adı = new sınıfadı
        Oop m1 = new Oop(6,5);

        System.out.println(m1.num1 + "-" + m1.num2);
        System.out.println(m1.addition());
        System.out.println(m1.division());
        System.out.println(m1.cikarma());
        System.out.println(m1.multiplication());


    }
}
