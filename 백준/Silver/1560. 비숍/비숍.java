import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        BigInteger result;

        // BigInteger는 일반적인 연산자(*)와 (-)를 사용할 수 없기 때문에, 
        // 대신 multiply()와 subtract() 메서드를 사용해야 한다.
        if (N.equals(BigInteger.ONE)) {
            result = BigInteger.ONE;
        } else {
            result = N.multiply(BigInteger.valueOf(2)).subtract(BigInteger.valueOf(2));
        }

        System.out.println(result);
    }
}