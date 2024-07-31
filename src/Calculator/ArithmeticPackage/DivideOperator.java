package Calculator.ArithmeticPackage;

import Calculator.ExceptionClass;

public class DivideOperator {
    public int divide(int f, int s) throws ExceptionClass {
        if (s == 0) {
            throw new ExceptionClass("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        int result = f / s;
        System.out.println(f + " / " + s + " = " + result);
        return result;
    }

}
