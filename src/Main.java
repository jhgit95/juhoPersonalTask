import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 입력");
        int firstInput = sc.nextInt();

        System.out.println("두 번째 입력");
        int secondInput = sc.nextInt();

        int[] result = new int[10];




        String breakWord = "";
        while (breakWord=="exit"){
            System.out.println("사칙연산 기호 입력");
            char c = sc.next().charAt(0);


            switch (c){
                case '+':
                    System.out.println(firstInput+secondInput);
                    break;

                case '-':
                    System.out.println(firstInput-secondInput);
                    break;

                case '*':
                    System.out.println(firstInput*secondInput);
                    break;

                case '/':

                    System.out.println(firstInput/secondInput);
                    break;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            breakWord= sc.nextLine();

            }

        }









    }
