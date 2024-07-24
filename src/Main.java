import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int QSize = 10;
        Queue<Integer> Q = new LinkedList<>();
        if(Q.size()>=QSize){
            Q.poll();
        }

        int result;

        String commandWord = "";
        while (!commandWord.equals("exit")){

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
                    result = firstInput+secondInput;
                    System.out.println(result);
                    if(Q.size()>=QSize){
                        Q.poll();
                    }
                    Q.add(result);
                    break;

                case '-':
                    result = firstInput-secondInput;
                    System.out.println(result);
                    if(Q.size()>=QSize){
                        Q.poll();
                    }
                    Q.add(result);
                    break;

                case '*':
                    result = firstInput*secondInput;
                    System.out.println(result);
                    if(Q.size()>=QSize){
                        Q.poll();
                    }
                    Q.add(result);
                    break;

                case '/':
                    if(secondInput==0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");

                        break;
                    }
                    result = firstInput/secondInput;
                    System.out.println(result);
                    if(Q.size()>=QSize){
                        Q.poll();
                    }
                    Q.add(result);
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
            // 이거 안 넣으면 자꾸 commandWord 입력 안 받고 나가지는데, 나중에 튜터님께 질문하기
            sc.nextLine();

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            commandWord= sc.nextLine();
            if(commandWord.equals("remove")){
                Q.poll();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            commandWord= sc.nextLine();


            System.out.println("commandWord = "+commandWord);
            System.out.println("Q = "+Q);

            }

        }









    }
