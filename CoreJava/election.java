import java.util.Scanner;

public class election
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v;
        System.out.println("Number of voters ");
        v = sc.nextFloat();
        double v2 = v*0.8;
        double x = v2*0.6;
        double y = v2-x;
        System.out.println("Number of votes X get = "+x);
        System.out.println("Number of votes Y get = "+y);
    }
}