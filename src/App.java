import Calculator.ArithmeticCalculator;
import Calculator.CircleCalculator;
import Calculator.ExceptionClass;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        CircleCalculator circleC = new CircleCalculator();
        ArithmeticCalculator arithmeticC = new ArithmeticCalculator();

        Scanner sc = new Scanner(System.in);

        String commandWord = "";
        while (!commandWord.equals("exit")) {
            System.out.println("1. 원의 넓이 계산기");
            System.out.println("2. 사칙연산 계산기");
            String choiceCalculator = sc.nextLine();

            if (choiceCalculator.equals("1")) {
                // 원의 넓이 공식 = 파이 * 반지름^2

                // static, final에 대한 고민(2레벨 7번)
                // 결론적으로 저는 final만 메서드에 사용했습니다.
                // 변수는 바꾸거나 삭제 등 변할 가능성이 있다고 생각하는데,
                // 일부 메서드는 바꿀 일 없다고 생각이 들어서, 일부 메서드에만 적용해봤습니다.
                //
                // static과 final이 무엇이고 왜 써야하는지 알아본 결과를 요약하자면,
                // static   장점 : 메모리 절약, 공유, 편리성, 글로벌 접근
                //          단점 : 상태 관리 어려움, 테스트 어려움, 메모리 누수
                //
                // final    장점 : 불변성, 안정성, 최적화, 가독성
                //          단점 : 유연성 감소, 테스트 어려움, 상속 제한
                //
                // static을 사용하지 않은 이유는, static의 장점이 제 프로그램에는
                // 별로 소용이 없다는 이유입니다. 어차피 calculator 클래스도
                // App 클래스의 메인 메서드 안에서만 활용될 뿐이기에, 접근이나
                // 공유, 메모리 절약 등의 이유로는 큰 장점이 되지 않다고 생각합니다.
                // 편리성 하나는 괜찮을 수 있다고 생각은 합니다만, 굳이 안 써도 불편하진
                // 않다고 느껴집니다. 반면, 단점의 테스트 어려움이나 메모리 누수도
                // 이 프로그램에서는 별로 큰 영향은 없을 것 같다고 생각하는데,
                // 상태 관리 어려움이라는 단점은 앞으로 해나갈 과제들이 남아 있어서
                // 혹시 불편함이 생길 수도 있다고 생각이 됐습니다.
                // 그래서 변수나 메서드 등에서 굳이 static을 사용하지 않았습니다.
                //
                //
                // final도 static과 비슷하게, 장단점의 대부분이 제 프로그램에서
                // 크게 영향이 없다고 생각했습니다. 하지만 여기서, 최적화(성능 향상에
                // 도움이 된다) 부분에 흥미를 느끼고 찾아봤습니다. 더 깊은 부분이
                // 있는 것 같지만, 우선은 큰 개념으로 간단히 알아봤습니다.
                // final 사용할 경우, 변수는 컴파일러가 변경되지 않은 것임을
                // 확실할 수 있어서, 미리 계산을 할 수 있다고 합니다.
                // 메서드는 컴파일러에서 이 메서드가 항상 동일하게 동작할
                // 것임을 확신할 수 있어서, 메서드 호출을 직접 그 코드로
                // 대체할 수 있다고 합니다. 이를 인라이닝이라고 합니다.
                // 실제 개발자가 되어 본 적은 단 한번도 없지만,
                // 백엔드 개발자라면, 성능 향상을 지향하는 것이
                // 좋을 것 같다고 생각했습니다. 그래서 조금이라도
                // 성능이 향상될 수 있는 수단은 사용해보는 것이
                // 좋을 것 같다고 생각했습니다.
                //
                // 그렇다면 final을 쓰지 않는다면 어떤지도 알아봤습니다.
                // 변수는 미리 계산이 불가능합니다. 컴파일러에서 이 변수 값이
                // 언제든 변할 수 있다고 가정하기 때문에, 미리 계산하거나
                // 고정된 상수로 최적화할 수 없다고 합니다.
                // 메서드는 서브 클래스에서 오버라이드 될 수 있다고 가정합니다.
                // 컴파일러는 이 메서드를 호출할 때, 실제로 어떤 메서드가
                // 호출될 것인지 확실할 수 없어서 인라인을 할 수 없고,
                // 런타임에 메서드 호출이 발생하여 오버헤드가 생긴다고 합니다.
                // 여기서 오버헤드는, 작업을 수행하기 위해 추가적으로 들어가는
                // 시간이나 자원을 의미합니다.(스택 프레임 생성, 매개변수 전달,
                // 제어 흐름 변경 등)


                System.out.println("원의 반지름을 입력하세요.");
                double radius = sc.nextDouble();
                double sizeResult = circleC.circleSize(radius);
                System.out.println("원의 넓이 = " + sizeResult);
                circleC.resultUpdate();
                circleC.setSizeQueue(sizeResult);


                // 버퍼 정리
                sc.nextLine();

            } else if (choiceCalculator.equals("2")) {

                System.out.println("첫 숫자를 입력해 주세요.(숫자 입력)");
                int firstInput = sc.nextInt();
                arithmeticC.setFirstInput(firstInput);

                System.out.println("두 번째 숫자를 입력해 주세요.(숫자 입력) ");
                int secondInput = sc.nextInt();
                arithmeticC.setSecondInput(secondInput);

                // 버퍼 정리
                sc.nextLine();

                System.out.println("사칙연산 기호 입력해 주세요.(문자 입력)");
                char operator = sc.nextLine().charAt(0);
                arithmeticC.setOperator(operator);

                try {
                    arithmeticC.calculation();
                } catch (ExceptionClass e) {
                    System.out.println(e.getMessage());

                } finally {
//                    System.out.println("try catch finally 잘 됐나요 ?");

                }


            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");

            commandWord = sc.nextLine();
            if (commandWord.equals("remove") && choiceCalculator.equals("1")) {
                circleC.sizeDelete();
            }
            if (commandWord.equals("remove") && choiceCalculator.equals("2")) {
                arithmeticC.resultDelete();
            }

            if (commandWord.equals("inquiry") && choiceCalculator.equals("1")) {
                circleC.inquirySizeQueue();
            }
            if (commandWord.equals("inquiry") && choiceCalculator.equals("2")) {
                arithmeticC.inquiryQueue();
            }


        }
    }

}
