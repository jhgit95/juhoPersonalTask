import java.util.LinkedList;
import java.util.Queue;

public class CircleCalculator extends Calculator {

    // 원의 넓이 계산 결과를 담는 컬렉션
    Queue<Double> sizeQueue = new LinkedList<>();

    // 생성자
    public CircleCalculator() {
        this.sizeQueue = new LinkedList<>();
    }


    // sizeQueue 값 저장
    public void setSizeQueue(double s) {
        sizeQueue.add(s);
    }

    public void resultUpdate() {
        if (sizeQueue.size() >= qSize) {
            sizeQueue.poll();
        }

    }

    // sizeQueue 결과 조회
    public void inquirySizeQueue() {
        int i = 1;
        for (double value : sizeQueue) {
            System.out.println(i + ". 넓이 결과 값 = " + value);
            i++;

        }
    }

    // sizeQueue의 결과 삭제
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
