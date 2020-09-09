import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        System.out.println("Enter yer name pls");

        String user = sc.nextLine();
//        int userId = sc.nextInt();
//        double userMoney = sc.nextDouble();
//        float userFLoat = sc.nextFloat();
//        long userBigNumber = sc.nextLong();
//        boolean userTrue = sc.nextBoolean();

        System.out.println(user);
//        System.out.println(userId);

        sc.close();

        System.out.println("Try entering another thing");
        String anotherThing = sc2.nextLine();
        System.out.println(anotherThing);

    }

}
