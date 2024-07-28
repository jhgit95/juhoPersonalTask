import java.util.LinkedList;
import java.util.Queue;

public class Calculator {


    // 연산 결과를 저장하는 필드
//            int qSize = 3;
    int qSize;
    // 사칙연산 결과를 담는 컬렉션
    private Queue<Integer> resultQueue = new LinkedList<>();

    // 원의 넓이 계산 결과를 담는 컬렉션
    private Queue<Double> sizeQueue = new LinkedList<>();

    int result;
    int firstInput;
    int secondInput;
    char c;


    // 생성자
    public Calculator() {
        this.resultQueue = new LinkedList<>();
        this.qSize = 10;
        this.sizeQueue = new LinkedList<>();
    }

    // sizeQueue 값 저장
    public void setSizeQueue(double s){
        sizeQueue.add(s);
    }

    // sizeQueue 결과 조회
    public void inquirySizeQueue() {
        int i=1;
        for (double value : sizeQueue) {
            System.out.println(i+". 넓이 결과 값 = " + value);
            i++;

        }
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
                result = this.firstInput + this.secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '-':
                result = this.firstInput - this.secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '*':
                result = this.firstInput * this.secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            case '/':
                if (secondInput == 0) {
                    throw new ExceptionClass("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = this.firstInput / this.secondInput;
                System.out.println(firstInput + " " + c + " " + secondInput + " = " + result);
                resultUpdate();
                resultQueue.add(result);
                break;

            default:
                throw new ExceptionClass("잘못된 연산자입니다. 입력한 문자 = " + c);
        }


    }

    // 원의 넓이 계산 메서드
    public final double circleSize(double r){
        double pi = 3.141592;
        double result = r*r*pi;
        return result;
    }


}



