import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int number,numBasamak,result;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz :");
        number=input.nextInt();
        result=0;
        while (number !=0){
            numBasamak= number %10;
            number /=10;
            result +=numBasamak;

        }
        System.out.println(number +" Sayısının Basamakları Toplamı : "+result);

    }
}
