import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);



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
            char c = sc.nextLine().charAt(0);

            try{
                calculator.calculation(firstInput,secondInput,c);
            }catch (ExceptionClass e){
                System.out.println(e.getMessage());

            }
            finally {
                System.out.println("try catch finally 잘 됐나요 ?");

            }


//            switch (c){
//                case '+':
//                    result = firstInput+secondInput;
//                    System.out.println(result);
//                    if(qq.size()>=qSize){
//                        qq.poll();
//                    }
//                    qq.add(result);
//                    break;
//
//                case '-':
//                    result = firstInput-secondInput;
//                    System.out.println(result);
//                    if(qq.size()>=qSize){
//                        qq.poll();
//                    }
//                    qq.add(result);
//                    break;
//
//                case '*':
//                    result = firstInput*secondInput;
//                    System.out.println(result);
//                    if(qq.size()>=qSize){
//                        qq.poll();
//                    }
//                    qq.add(result);
//                    break;
//
//                case '/':
//                    if(secondInput==0){
//                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//
//                        break;
//                    }
//                    result = firstInput/secondInput;
//                    System.out.println(result);
//                    if(qq.size()>=qSize){
//                        qq.poll();
//                    }
//                    qq.add(result);
//                    break;
//
//                default:
//                    System.out.println("잘못된 입력입니다.");
//                    break;
//            }


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            commandWord= sc.nextLine();
            if(commandWord.equals("remove")){
                calculator.resultQueue.poll();
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            commandWord= sc.nextLine();
            if(commandWord.equals("inquiry")){
                for(int value : calculator.resultQueue){
                    System.out.println("뭐가있징?!"+value);
                }
            }



            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            commandWord= sc.nextLine();


            }

        }









    }
