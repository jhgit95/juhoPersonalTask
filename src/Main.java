import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] result = new int[10];



        String breakWord = "";
        while (!breakWord.equals("exit")){
            System.out.println("breakWord = "+breakWord);

            System.out.println("첫 입력");
            int firstInput = sc.nextInt();

            System.out.println("두 번째 입력");
            int secondInput = sc.nextInt();
            // 버퍼 정리
            sc.nextLine();

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
            // 이거 안 넣으면 자꾸 breakWord 입력 안 받고 나가지는데, 나중에 튜터님께 질문하기
            sc.nextLine();
            breakWord= sc.nextLine();

            }

        }









    }
