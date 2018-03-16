import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Tên bạn vừa nhập là: "+ name);
    }
}
