package Calculator;

import Calculator.ArithmeticPackage.AddOperator;

import java.util.LinkedList;
import java.util.Queue;

public class CircleCalculator extends Calculator {

    // 원의 넓이 계산 결과를 담는 컬렉션
    protected Queue<Double> sizeQueue = new LinkedList<>();

    // 생성자
    public CircleCalculator() {
        this.sizeQueue = new LinkedList<>();
    }

    // 원의 넓이 값 저장
    public void setSizeQueue(double s) {
        sizeQueue.add(s);
    }

    // 원의 넓이 저장 최대치(10개)가 넘을 경우, 가장 오래전에 저장된 수를 삭제하는 기능
    public void resultUpdate() {
        if (sizeQueue.size() >= qSize) {
            sizeQueue.poll();
        }

    }

    // 저장된 원의 넓이 결과 조회
    public void inquirySizeQueue() {
        for (double value : sizeQueue) {
            System.out.println("넓이 결과 값 = " + value);
        }
    }

    // 가장 오래된 원의 넓이의 결과 1개 삭제
    public void sizeDelete() {
        sizeQueue.poll();
    }


    // 원의 넓이 계산 메서드
    public final double circleSize(double r) {
        double pi = 3.141592;
        double result = r * r * pi;
        return result;
    }
}
