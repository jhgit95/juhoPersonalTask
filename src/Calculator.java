import java.util.LinkedList;
import java.util.Queue;

public class Calculator {


    // 연산 결과를 저장하는 필드
//            int qSize = 3;
    int qSize = 10;
    Queue<Integer> resultQueue = new LinkedList<>();

    int result;


    // 큐 컬렉션의 결과 값이 최대치가 넘을 경우 삭제하는 기능
    public void resultUpdate() {
        if (resultQueue.size() >= qSize) {
            resultQueue.poll();
        }

    }


    // 연산 메서드
    public void calculation(int firstInput, int secondInput, char c) throws ExceptionClass {


        switch (c) {
            case '+':
                result = firstInput + secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '-':
                result = firstInput - secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '*':
                result = firstInput * secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '/':
                if (secondInput == 0) {
                    throw new ExceptionClass("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = firstInput / secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            default:
                throw new ExceptionClass("잘못된 연산자입니다. 입력한 문자 = " + c);
        }


    }


}



