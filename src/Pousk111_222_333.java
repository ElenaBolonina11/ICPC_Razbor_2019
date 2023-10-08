import java.util.Scanner;

//1. Дано целое число n от 100 до 999 не вкл, найти число которое не меньше чем n и все цифры в котором одинаковые.
//
//int i=111;

//If n >
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = n.nextInt();
        int value=111;
        for (int x = 111; x<999; x+=111 ){
            if (x>=num){
                System.out.println(x);
                break;
            }
        }

    }
}