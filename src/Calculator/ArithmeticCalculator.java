package Calculator;

import Calculator.ArithmeticPackage.*;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator extends Calculator {

    // 사칙연산 결과를 담는 컬렉션
    Queue<Integer> resultQueue = new LinkedList<>();

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    ModOperator modOperator;

    // 생성자
    public ArithmeticCalculator() {
        this.resultQueue = new LinkedList<>();
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
        this.modOperator = new ModOperator();
    }

    // 첫 숫자 입력
    final public void setFirstInput(int firstInput) {
        this.firstInput = firstInput;
    }

    // 첫 숫자 출력
    public void getFirstInput() {
        System.out.println("첫 번째 입력 = " + this.firstInput);
    }

    // 두 번째 숫자 입력
    final public void setSecondInput(int secondInput) {
        this.secondInput = secondInput;
    }

    // 두 번째 숫자 출력
    public void getSecondInput() {
        System.out.println("두 번째 입력 = " + this.secondInput);
    }

    // 연산 기호 입력
    final public void setOperator(char operator) {
        this.operator = operator;
    }

    // 연산 기호 출력
    public void getOperator() {
        System.out.println("연산자 = " + this.secondInput);
    }

    // 사칙연산 결과 삭제
    final public void resultDelete() {
        resultQueue.poll();
    }

    // 사칙연산 결과 조회
    public void inquiryQueue() {
        for (int value : resultQueue) {
            System.out.println("저장된 결과 값 = " + value);
        }
    }

    // 사칙연산 저장 최대치(10개)가 넘을 경우, 가장 오래전에 저장된 수를 삭제하는 기능
    public void resultUpdate() {
        if (resultQueue.size() >= qSize) {
            resultQueue.poll();
        }

    }

    // 사칙연산 메서드
    public void calculation() throws ExceptionClass {

        switch (this.operator) {
            case '+':
                result = addOperator.add(firstInput, secondInput);
                break;

            case '-':
                result = subtractOperator.subtract(firstInput, secondInput);
                break;

            case '*':
                result = multiplyOperator.multiply(firstInput, secondInput);
                break;

            case '/':
                result = divideOperator.divide(firstInput, secondInput);
                break;
            case '%':
                result = modOperator.mod(firstInput, secondInput);
                break;
            default:
                throw new ExceptionClass("잘못된 연산자입니다. 입력한 문자 = " + operator);
        }
        resultUpdate();
        resultQueue.add(result);

    }

}
