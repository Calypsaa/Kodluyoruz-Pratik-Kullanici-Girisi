import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, password1;
        int choose;

        System.out.print("Kullanici Adinizi girin: ");
        userName = input.nextLine();

        System.out.print("Sifrenizi girin: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Basarili");
        } else
            System.out.println("Kullanici adi veya sifre hatali");

        System.out.println("Sifrenizi degistirmek icin 1 degistirmek istemiyorsaniz 2 tusuna basin");
        choose = input.nextInt();

        if (choose == 1) {
            System.out.print("Yeni sifrenizi girin: ");
            Scanner scan=new Scanner(System.in);
            password1 = scan.nextLine();
            if (password1.equals(password)) {
                System.out.println("Yeni sifreniz eski sifrenizle aynı olamaz!");
            } else {
                System.out.println("Sifreniz degistirildi.");
            }
        }
        else if(choose==2){
            System.out.println("Gorusmek uzere...");
        }
    }
}
