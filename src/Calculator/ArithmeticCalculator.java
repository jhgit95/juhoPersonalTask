package Calculator;

import Calculator.ArithmeticPackage.AddOperator;
import Calculator.ArithmeticPackage.DivideOperator;
import Calculator.ArithmeticPackage.MultiplyOperator;
import Calculator.ArithmeticPackage.SubtractOperator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator  {

    // 사칙연산 결과를 담는 컬렉션
    Queue<Integer> resultQueue = new LinkedList<>();

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    // 생성자
    public ArithmeticCalculator() {
        this.resultQueue = new LinkedList<>();
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    // firstInput 입력
    public void setFirstInput(int firstInput) {
        this.firstInput = firstInput;
    }

    // firstInput 출력
    public void getFirstInput() {
        System.out.println("첫 번째 입력 = " + this.firstInput);
    }

    // secondInput 입력
    public void setSecondInput(int secondInput) {
        this.secondInput = secondInput;
    }

    // secondInput 출력
    public void getSecondInput() {
        System.out.println("두 번째 입력 = " + this.secondInput);
    }

    public void setC(char c) {
        this.c = c;
    }

    public void getC() {
        System.out.println("두 번째 입력 = " + this.secondInput);
    }

    // resultQueue의 결과 삭제
    public void resultDelete() {
        resultQueue.poll();
    }

    // resultQueue의 결과 조회
    public void inquiryQueue() {
        for (int value : resultQueue) {
            System.out.println("뭐가있징?!" + value);
        }
    }


    // 큐 컬렉션의 결과 값이 최대치가 넘을 경우 삭제하는 기능
    public void resultUpdate() {
        if (resultQueue.size() >= qSize) {
            resultQueue.poll();
        }

    }

    // 사칙연산 메서드
    public void calculation() throws ExceptionClass {


        switch (this.c) {
            case '+':
                result = addOperator.add(1,2);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '-':
                result = subtractOperator.subtract(firstInput,secondInput);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '*':
                result = multiplyOperator.multiply(firstInput,secondInput);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '/':
                if (secondInput == 0) {
                    throw new ExceptionClass("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = divideOperator.divide(firstInput,secondInput);
                resultUpdate();
                resultQueue.add(result);
                break;

            default:
                throw new ExceptionClass("잘못된 연산자입니다. 입력한 문자 = " + c);
        }


    }


}
