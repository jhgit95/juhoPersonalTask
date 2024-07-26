import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);


        String commandWord = "";
        while (!commandWord.equals("exit")) {

            System.out.println("첫 입력");
            int firstInput = sc.nextInt();
            calculator.setFirstInput(firstInput);

            System.out.println("두 번째 입력");
            int secondInput = sc.nextInt();
            calculator.setSecondInput(secondInput);

            // 버퍼 정리
            sc.nextLine();

            System.out.println("사칙연산 기호 입력");
            char c = sc.nextLine().charAt(0);
            calculator.setC(c);

            try {
                calculator.calculation();
            } catch (ExceptionClass e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("try catch finally 잘 됐나요 ?");

            }


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            commandWord = sc.nextLine();
            if (commandWord.equals("remove")) {
                calculator.resultDelete();
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            commandWord = sc.nextLine();
            if (commandWord.equals("inquiry")) {
                calculator.inquiryQueue();
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            commandWord = sc.nextLine();


        }

    }


}
